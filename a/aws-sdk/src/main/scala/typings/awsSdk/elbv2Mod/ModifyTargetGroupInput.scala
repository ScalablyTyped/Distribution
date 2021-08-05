package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyTargetGroupInput extends StObject {
  
  /**
    * Indicates whether health checks are enabled.
    */
  var HealthCheckEnabled: js.UndefOr[typings.awsSdk.elbv2Mod.HealthCheckEnabled] = js.undefined
  
  /**
    * The approximate amount of time, in seconds, between health checks of an individual target. For TCP health checks, the supported values are 10 or 30 seconds. With Network Load Balancers, you can't modify this setting.
    */
  var HealthCheckIntervalSeconds: js.UndefOr[typings.awsSdk.elbv2Mod.HealthCheckIntervalSeconds] = js.undefined
  
  /**
    * [HTTP/HTTPS health checks] The destination for health checks on the targets. [HTTP1 or HTTP2 protocol version] The ping path. The default is /. [GRPC protocol version] The path of a custom health check method with the format /package.service/method. The default is /AWS.ALB/healthcheck.
    */
  var HealthCheckPath: js.UndefOr[Path] = js.undefined
  
  /**
    * The port the load balancer uses when performing health checks on targets.
    */
  var HealthCheckPort: js.UndefOr[typings.awsSdk.elbv2Mod.HealthCheckPort] = js.undefined
  
  /**
    * The protocol the load balancer uses when performing health checks on targets. The TCP protocol is supported for health checks only if the protocol of the target group is TCP, TLS, UDP, or TCP_UDP. The GENEVE, TLS, UDP, and TCP_UDP protocols are not supported for health checks. With Network Load Balancers, you can't modify this setting.
    */
  var HealthCheckProtocol: js.UndefOr[ProtocolEnum] = js.undefined
  
  /**
    * [HTTP/HTTPS health checks] The amount of time, in seconds, during which no response means a failed health check. With Network Load Balancers, you can't modify this setting.
    */
  var HealthCheckTimeoutSeconds: js.UndefOr[typings.awsSdk.elbv2Mod.HealthCheckTimeoutSeconds] = js.undefined
  
  /**
    * The number of consecutive health checks successes required before considering an unhealthy target healthy.
    */
  var HealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined
  
  /**
    * [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a successful response from a target. With Network Load Balancers, you can't modify this setting.
    */
  var Matcher: js.UndefOr[typings.awsSdk.elbv2Mod.Matcher] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var TargetGroupArn: typings.awsSdk.elbv2Mod.TargetGroupArn
  
  /**
    * The number of consecutive health check failures required before considering the target unhealthy. For target groups with a protocol of TCP or TLS, this value must be the same as the healthy threshold count.
    */
  var UnhealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined
}
object ModifyTargetGroupInput {
  
  inline def apply(TargetGroupArn: TargetGroupArn): ModifyTargetGroupInput = {
    val __obj = js.Dynamic.literal(TargetGroupArn = TargetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyTargetGroupInput]
  }
  
  extension [Self <: ModifyTargetGroupInput](x: Self) {
    
    inline def setHealthCheckEnabled(value: HealthCheckEnabled): Self = StObject.set(x, "HealthCheckEnabled", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckEnabledUndefined: Self = StObject.set(x, "HealthCheckEnabled", js.undefined)
    
    inline def setHealthCheckIntervalSeconds(value: HealthCheckIntervalSeconds): Self = StObject.set(x, "HealthCheckIntervalSeconds", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckIntervalSecondsUndefined: Self = StObject.set(x, "HealthCheckIntervalSeconds", js.undefined)
    
    inline def setHealthCheckPath(value: Path): Self = StObject.set(x, "HealthCheckPath", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckPathUndefined: Self = StObject.set(x, "HealthCheckPath", js.undefined)
    
    inline def setHealthCheckPort(value: HealthCheckPort): Self = StObject.set(x, "HealthCheckPort", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckPortUndefined: Self = StObject.set(x, "HealthCheckPort", js.undefined)
    
    inline def setHealthCheckProtocol(value: ProtocolEnum): Self = StObject.set(x, "HealthCheckProtocol", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckProtocolUndefined: Self = StObject.set(x, "HealthCheckProtocol", js.undefined)
    
    inline def setHealthCheckTimeoutSeconds(value: HealthCheckTimeoutSeconds): Self = StObject.set(x, "HealthCheckTimeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckTimeoutSecondsUndefined: Self = StObject.set(x, "HealthCheckTimeoutSeconds", js.undefined)
    
    inline def setHealthyThresholdCount(value: HealthCheckThresholdCount): Self = StObject.set(x, "HealthyThresholdCount", value.asInstanceOf[js.Any])
    
    inline def setHealthyThresholdCountUndefined: Self = StObject.set(x, "HealthyThresholdCount", js.undefined)
    
    inline def setMatcher(value: Matcher): Self = StObject.set(x, "Matcher", value.asInstanceOf[js.Any])
    
    inline def setMatcherUndefined: Self = StObject.set(x, "Matcher", js.undefined)
    
    inline def setTargetGroupArn(value: TargetGroupArn): Self = StObject.set(x, "TargetGroupArn", value.asInstanceOf[js.Any])
    
    inline def setUnhealthyThresholdCount(value: HealthCheckThresholdCount): Self = StObject.set(x, "UnhealthyThresholdCount", value.asInstanceOf[js.Any])
    
    inline def setUnhealthyThresholdCountUndefined: Self = StObject.set(x, "UnhealthyThresholdCount", js.undefined)
  }
}
