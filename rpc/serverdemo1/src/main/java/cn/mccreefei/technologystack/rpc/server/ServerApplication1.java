package cn.mccreefei.technologystack.rpc.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author MccreeFei
 * @create 2018-10-25 上午9:30
 */
@SpringBootApplication
@ComponentScan(basePackages = {"cn.mccreefei.technologystack.rpc.server", "cn.mccreefei.technologystack.rpc.support"})
public class ServerApplication1 {
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication1.class, args);
    }
}
