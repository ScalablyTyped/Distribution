package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetGroup extends js.Object {
  /**
    * Indicates whether health checks are enabled.
    */
  var HealthCheckEnabled: js.UndefOr[typings.awsSdk.elbv2Mod.HealthCheckEnabled] = js.native
  /**
    * The approximate amount of time, in seconds, between health checks of an individual target.
    */
  var HealthCheckIntervalSeconds: js.UndefOr[typings.awsSdk.elbv2Mod.HealthCheckIntervalSeconds] = js.native
  /**
    * The destination for the health check request.
    */
  var HealthCheckPath: js.UndefOr[Path] = js.native
  /**
    * The port to use to connect with the target.
    */
  var HealthCheckPort: js.UndefOr[typings.awsSdk.elbv2Mod.HealthCheckPort] = js.native
  /**
    * The protocol to use to connect with the target.
    */
  var HealthCheckProtocol: js.UndefOr[ProtocolEnum] = js.native
  /**
    * The amount of time, in seconds, during which no response means a failed health check.
    */
  var HealthCheckTimeoutSeconds: js.UndefOr[typings.awsSdk.elbv2Mod.HealthCheckTimeoutSeconds] = js.native
  /**
    * The number of consecutive health checks successes required before considering an unhealthy target healthy.
    */
  var HealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.native
  /**
    * The Amazon Resource Names (ARN) of the load balancers that route traffic to this target group.
    */
  var LoadBalancerArns: js.UndefOr[typings.awsSdk.elbv2Mod.LoadBalancerArns] = js.native
  /**
    * The HTTP codes to use when checking for a successful response from a target.
    */
  var Matcher: js.UndefOr[typings.awsSdk.elbv2Mod.Matcher] = js.native
  /**
    * The port on which the targets are listening. Not used if the target is a Lambda function.
    */
  var Port: js.UndefOr[typings.awsSdk.elbv2Mod.Port] = js.native
  /**
    * The protocol to use for routing traffic to the targets.
    */
  var Protocol: js.UndefOr[ProtocolEnum] = js.native
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var TargetGroupArn: js.UndefOr[typings.awsSdk.elbv2Mod.TargetGroupArn] = js.native
  /**
    * The name of the target group.
    */
  var TargetGroupName: js.UndefOr[typings.awsSdk.elbv2Mod.TargetGroupName] = js.native
  /**
    * The type of target that you must specify when registering targets with this target group. The possible values are instance (targets are specified by instance ID) or ip (targets are specified by IP address).
    */
  var TargetType: js.UndefOr[TargetTypeEnum] = js.native
  /**
    * The number of consecutive health check failures required before considering the target unhealthy.
    */
  var UnhealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.native
  /**
    * The ID of the VPC for the targets.
    */
  var VpcId: js.UndefOr[typings.awsSdk.elbv2Mod.VpcId] = js.native
}

object TargetGroup {
  @scala.inline
  def apply(): TargetGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetGroup]
  }
  @scala.inline
  implicit class TargetGroupOps[Self <: TargetGroup] (val x: Self) extends AnyVal {
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
    def setLoadBalancerArnsVarargs(value: LoadBalancerArn*): Self = this.set("LoadBalancerArns", js.Array(value :_*))
    @scala.inline
    def setLoadBalancerArns(value: LoadBalancerArns): Self = this.set("LoadBalancerArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadBalancerArns: Self = this.set("LoadBalancerArns", js.undefined)
    @scala.inline
    def setMatcher(value: Matcher): Self = this.set("Matcher", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatcher: Self = this.set("Matcher", js.undefined)
    @scala.inline
    def setPort(value: Port): Self = this.set("Port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    @scala.inline
    def setProtocol(value: ProtocolEnum): Self = this.set("Protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("Protocol", js.undefined)
    @scala.inline
    def setTargetGroupArn(value: TargetGroupArn): Self = this.set("TargetGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetGroupArn: Self = this.set("TargetGroupArn", js.undefined)
    @scala.inline
    def setTargetGroupName(value: TargetGroupName): Self = this.set("TargetGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetGroupName: Self = this.set("TargetGroupName", js.undefined)
    @scala.inline
    def setTargetType(value: TargetTypeEnum): Self = this.set("TargetType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetType: Self = this.set("TargetType", js.undefined)
    @scala.inline
    def setUnhealthyThresholdCount(value: HealthCheckThresholdCount): Self = this.set("UnhealthyThresholdCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnhealthyThresholdCount: Self = this.set("UnhealthyThresholdCount", js.undefined)
    @scala.inline
    def setVpcId(value: VpcId): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
  
}

