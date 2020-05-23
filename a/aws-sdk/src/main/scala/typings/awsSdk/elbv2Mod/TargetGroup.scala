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
  def apply(
    HealthCheckEnabled: js.UndefOr[HealthCheckEnabled] = js.undefined,
    HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds] = js.undefined,
    HealthCheckPath: Path = null,
    HealthCheckPort: HealthCheckPort = null,
    HealthCheckProtocol: ProtocolEnum = null,
    HealthCheckTimeoutSeconds: js.UndefOr[HealthCheckTimeoutSeconds] = js.undefined,
    HealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined,
    LoadBalancerArns: LoadBalancerArns = null,
    Matcher: Matcher = null,
    Port: js.UndefOr[Port] = js.undefined,
    Protocol: ProtocolEnum = null,
    TargetGroupArn: TargetGroupArn = null,
    TargetGroupName: TargetGroupName = null,
    TargetType: TargetTypeEnum = null,
    UnhealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined,
    VpcId: VpcId = null
  ): TargetGroup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(HealthCheckEnabled)) __obj.updateDynamic("HealthCheckEnabled")(HealthCheckEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(HealthCheckIntervalSeconds)) __obj.updateDynamic("HealthCheckIntervalSeconds")(HealthCheckIntervalSeconds.get.asInstanceOf[js.Any])
    if (HealthCheckPath != null) __obj.updateDynamic("HealthCheckPath")(HealthCheckPath.asInstanceOf[js.Any])
    if (HealthCheckPort != null) __obj.updateDynamic("HealthCheckPort")(HealthCheckPort.asInstanceOf[js.Any])
    if (HealthCheckProtocol != null) __obj.updateDynamic("HealthCheckProtocol")(HealthCheckProtocol.asInstanceOf[js.Any])
    if (!js.isUndefined(HealthCheckTimeoutSeconds)) __obj.updateDynamic("HealthCheckTimeoutSeconds")(HealthCheckTimeoutSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(HealthyThresholdCount)) __obj.updateDynamic("HealthyThresholdCount")(HealthyThresholdCount.get.asInstanceOf[js.Any])
    if (LoadBalancerArns != null) __obj.updateDynamic("LoadBalancerArns")(LoadBalancerArns.asInstanceOf[js.Any])
    if (Matcher != null) __obj.updateDynamic("Matcher")(Matcher.asInstanceOf[js.Any])
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port.get.asInstanceOf[js.Any])
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol.asInstanceOf[js.Any])
    if (TargetGroupArn != null) __obj.updateDynamic("TargetGroupArn")(TargetGroupArn.asInstanceOf[js.Any])
    if (TargetGroupName != null) __obj.updateDynamic("TargetGroupName")(TargetGroupName.asInstanceOf[js.Any])
    if (TargetType != null) __obj.updateDynamic("TargetType")(TargetType.asInstanceOf[js.Any])
    if (!js.isUndefined(UnhealthyThresholdCount)) __obj.updateDynamic("UnhealthyThresholdCount")(UnhealthyThresholdCount.get.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetGroup]
  }
}

