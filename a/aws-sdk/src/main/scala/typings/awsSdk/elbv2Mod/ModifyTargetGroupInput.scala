package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyTargetGroupInput extends js.Object {
  
  /**
    * Indicates whether health checks are enabled.
    */
  var HealthCheckEnabled: js.UndefOr[typings.awsSdk.elbv2Mod.HealthCheckEnabled] = js.native
  
  /**
    * The approximate amount of time, in seconds, between health checks of an individual target. For TCP health checks, the supported values are 10 or 30 seconds. With Network Load Balancers, you can't modify this setting.
    */
  var HealthCheckIntervalSeconds: js.UndefOr[typings.awsSdk.elbv2Mod.HealthCheckIntervalSeconds] = js.native
  
  /**
    * [HTTP/HTTPS health checks] The destination for health checks on the targets. [HTTP1 or HTTP2 protocol version] The ping path. The default is /. [GRPC protocol version] The path of a custom health check method with the format /package.service/method. The default is /AWS.ALB/healthcheck.
    */
  var HealthCheckPath: js.UndefOr[Path] = js.native
  
  /**
    * The port the load balancer uses when performing health checks on targets.
    */
  var HealthCheckPort: js.UndefOr[typings.awsSdk.elbv2Mod.HealthCheckPort] = js.native
  
  /**
    * The protocol the load balancer uses when performing health checks on targets. The TCP protocol is supported for health checks only if the protocol of the target group is TCP, TLS, UDP, or TCP_UDP. The GENEVE, TLS, UDP, and TCP_UDP protocols are not supported for health checks. With Network Load Balancers, you can't modify this setting.
    */
  var HealthCheckProtocol: js.UndefOr[ProtocolEnum] = js.native
  
  /**
    * [HTTP/HTTPS health checks] The amount of time, in seconds, during which no response means a failed health check. With Network Load Balancers, you can't modify this setting.
    */
  var HealthCheckTimeoutSeconds: js.UndefOr[typings.awsSdk.elbv2Mod.HealthCheckTimeoutSeconds] = js.native
  
  /**
    * The number of consecutive health checks successes required before considering an unhealthy target healthy.
    */
  var HealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.native
  
  /**
    * [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a successful response from a target. With Network Load Balancers, you can't modify this setting.
    */
  var Matcher: js.UndefOr[typings.awsSdk.elbv2Mod.Matcher] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var TargetGroupArn: typings.awsSdk.elbv2Mod.TargetGroupArn = js.native
  
  /**
    * The number of consecutive health check failures required before considering the target unhealthy. For target groups with a protocol of TCP or TLS, this value must be the same as the healthy threshold count.
    */
  var UnhealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.native
}
object ModifyTargetGroupInput {
  
  @scala.inline
  def apply(TargetGroupArn: TargetGroupArn): ModifyTargetGroupInput = {
    val __obj = js.Dynamic.literal(TargetGroupArn = TargetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyTargetGroupInput]
  }
  
  @scala.inline
  implicit class ModifyTargetGroupInputOps[Self <: ModifyTargetGroupInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTargetGroupArn(value: TargetGroupArn): Self = this.set("TargetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckEnabled(value: HealthCheckEnabled): Self = this.set("HealthCheckEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckEnabled: Self = this.set("HealthCheckEnabled", js.undefined)
    
    @scala.inline
    def setHealthCheckIntervalSeconds(value: HealthCheckIntervalSeconds): Self = this.set("HealthCheckIntervalSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckIntervalSeconds: Self = this.set("HealthCheckIntervalSeconds", js.undefined)
    
    @scala.inline
    def setHealthCheckPath(value: Path): Self = this.set("HealthCheckPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckPath: Self = this.set("HealthCheckPath", js.undefined)
    
    @scala.inline
    def setHealthCheckPort(value: HealthCheckPort): Self = this.set("HealthCheckPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckPort: Self = this.set("HealthCheckPort", js.undefined)
    
    @scala.inline
    def setHealthCheckProtocol(value: ProtocolEnum): Self = this.set("HealthCheckProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckProtocol: Self = this.set("HealthCheckProtocol", js.undefined)
    
    @scala.inline
    def setHealthCheckTimeoutSeconds(value: HealthCheckTimeoutSeconds): Self = this.set("HealthCheckTimeoutSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckTimeoutSeconds: Self = this.set("HealthCheckTimeoutSeconds", js.undefined)
    
    @scala.inline
    def setHealthyThresholdCount(value: HealthCheckThresholdCount): Self = this.set("HealthyThresholdCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthyThresholdCount: Self = this.set("HealthyThresholdCount", js.undefined)
    
    @scala.inline
    def setMatcher(value: Matcher): Self = this.set("Matcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatcher: Self = this.set("Matcher", js.undefined)
    
    @scala.inline
    def setUnhealthyThresholdCount(value: HealthCheckThresholdCount): Self = this.set("UnhealthyThresholdCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnhealthyThresholdCount: Self = this.set("UnhealthyThresholdCount", js.undefined)
  }
}
