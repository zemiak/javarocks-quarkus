package org.acme.scheduling;

import java.util.concurrent.atomic.AtomicInteger;
import javax.enterprise.context.ApplicationScoped;
import io.quarkus.scheduler.Scheduled;

@ApplicationScoped              // (1)
public class CounterBean {

    private AtomicInteger counter = new AtomicInteger();

    public int get() {
        return counter.get();
    }

    @Scheduled(every="10s")     // (2)
    void increment() {
        counter.incrementAndGet();
    }

}
