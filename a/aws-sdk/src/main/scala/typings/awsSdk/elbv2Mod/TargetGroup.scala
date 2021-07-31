package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetGroup extends StObject {
  
  /**
    * Indicates whether health checks are enabled.
    */
  var HealthCheckEnabled: js.UndefOr[typings.awsSdk.elbv2Mod.HealthCheckEnabled] = js.undefined
  
  /**
    * The approximate amount of time, in seconds, between health checks of an individual target.
    */
  var HealthCheckIntervalSeconds: js.UndefOr[typings.awsSdk.elbv2Mod.HealthCheckIntervalSeconds] = js.undefined
  
  /**
    * The destination for health checks on the targets.
    */
  var HealthCheckPath: js.UndefOr[Path] = js.undefined
  
  /**
    * The port to use to connect with the target.
    */
  var HealthCheckPort: js.UndefOr[typings.awsSdk.elbv2Mod.HealthCheckPort] = js.undefined
  
  /**
    * The protocol to use to connect with the target. The GENEVE, TLS, UDP, and TCP_UDP protocols are not supported for health checks.
    */
  var HealthCheckProtocol: js.UndefOr[ProtocolEnum] = js.undefined
  
  /**
    * The amount of time, in seconds, during which no response means a failed health check.
    */
  var HealthCheckTimeoutSeconds: js.UndefOr[typings.awsSdk.elbv2Mod.HealthCheckTimeoutSeconds] = js.undefined
  
  /**
    * The number of consecutive health checks successes required before considering an unhealthy target healthy.
    */
  var HealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined
  
  /**
    * The Amazon Resource Names (ARN) of the load balancers that route traffic to this target group.
    */
  var LoadBalancerArns: js.UndefOr[typings.awsSdk.elbv2Mod.LoadBalancerArns] = js.undefined
  
  /**
    * The HTTP or gRPC codes to use when checking for a successful response from a target.
    */
  var Matcher: js.UndefOr[typings.awsSdk.elbv2Mod.Matcher] = js.undefined
  
  /**
    * The port on which the targets are listening. Not used if the target is a Lambda function.
    */
  var Port: js.UndefOr[typings.awsSdk.elbv2Mod.Port] = js.undefined
  
  /**
    * The protocol to use for routing traffic to the targets.
    */
  var Protocol: js.UndefOr[ProtocolEnum] = js.undefined
  
  /**
    * [HTTP/HTTPS protocol] The protocol version. The possible values are GRPC, HTTP1, and HTTP2.
    */
  var ProtocolVersion: js.UndefOr[typings.awsSdk.elbv2Mod.ProtocolVersion] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var TargetGroupArn: js.UndefOr[typings.awsSdk.elbv2Mod.TargetGroupArn] = js.undefined
  
  /**
    * The name of the target group.
    */
  var TargetGroupName: js.UndefOr[typings.awsSdk.elbv2Mod.TargetGroupName] = js.undefined
  
  /**
    * The type of target that you must specify when registering targets with this target group. The possible values are instance (register targets by instance ID), ip (register targets by IP address), or lambda (register a single Lambda function as a target).
    */
  var TargetType: js.UndefOr[TargetTypeEnum] = js.undefined
  
  /**
    * The number of consecutive health check failures required before considering the target unhealthy.
    */
  var UnhealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.undefined
  
  /**
    * The ID of the VPC for the targets.
    */
  var VpcId: js.UndefOr[typings.awsSdk.elbv2Mod.VpcId] = js.undefined
}
object TargetGroup {
  
  @scala.inline
  def apply(): TargetGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetGroup]
  }
  
  @scala.inline
  implicit class TargetGroupMutableBuilder[Self <: TargetGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthCheckEnabled(value: HealthCheckEnabled): Self = StObject.set(x, "HealthCheckEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckEnabledUndefined: Self = StObject.set(x, "HealthCheckEnabled", js.undefined)
    
    @scala.inline
    def setHealthCheckIntervalSeconds(value: HealthCheckIntervalSeconds): Self = StObject.set(x, "HealthCheckIntervalSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckIntervalSecondsUndefined: Self = StObject.set(x, "HealthCheckIntervalSeconds", js.undefined)
    
    @scala.inline
    def setHealthCheckPath(value: Path): Self = StObject.set(x, "HealthCheckPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckPathUndefined: Self = StObject.set(x, "HealthCheckPath", js.undefined)
    
    @scala.inline
    def setHealthCheckPort(value: HealthCheckPort): Self = StObject.set(x, "HealthCheckPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckPortUndefined: Self = StObject.set(x, "HealthCheckPort", js.undefined)
    
    @scala.inline
    def setHealthCheckProtocol(value: ProtocolEnum): Self = StObject.set(x, "HealthCheckProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckProtocolUndefined: Self = StObject.set(x, "HealthCheckProtocol", js.undefined)
    
    @scala.inline
    def setHealthCheckTimeoutSeconds(value: HealthCheckTimeoutSeconds): Self = StObject.set(x, "HealthCheckTimeoutSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckTimeoutSecondsUndefined: Self = StObject.set(x, "HealthCheckTimeoutSeconds", js.undefined)
    
    @scala.inline
    def setHealthyThresholdCount(value: HealthCheckThresholdCount): Self = StObject.set(x, "HealthyThresholdCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthyThresholdCountUndefined: Self = StObject.set(x, "HealthyThresholdCount", js.undefined)
    
    @scala.inline
    def setLoadBalancerArns(value: LoadBalancerArns): Self = StObject.set(x, "LoadBalancerArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerArnsUndefined: Self = StObject.set(x, "LoadBalancerArns", js.undefined)
    
    @scala.inline
    def setLoadBalancerArnsVarargs(value: LoadBalancerArn*): Self = StObject.set(x, "LoadBalancerArns", js.Array(value :_*))
    
    @scala.inline
    def setMatcher(value: Matcher): Self = StObject.set(x, "Matcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatcherUndefined: Self = StObject.set(x, "Matcher", js.undefined)
    
    @scala.inline
    def setPort(value: Port): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    @scala.inline
    def setProtocol(value: ProtocolEnum): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    @scala.inline
    def setProtocolVersion(value: ProtocolVersion): Self = StObject.set(x, "ProtocolVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolVersionUndefined: Self = StObject.set(x, "ProtocolVersion", js.undefined)
    
    @scala.inline
    def setTargetGroupArn(value: TargetGroupArn): Self = StObject.set(x, "TargetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroupArnUndefined: Self = StObject.set(x, "TargetGroupArn", js.undefined)
    
    @scala.inline
    def setTargetGroupName(value: TargetGroupName): Self = StObject.set(x, "TargetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroupNameUndefined: Self = StObject.set(x, "TargetGroupName", js.undefined)
    
    @scala.inline
    def setTargetType(value: TargetTypeEnum): Self = StObject.set(x, "TargetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetTypeUndefined: Self = StObject.set(x, "TargetType", js.undefined)
    
    @scala.inline
    def setUnhealthyThresholdCount(value: HealthCheckThresholdCount): Self = StObject.set(x, "UnhealthyThresholdCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnhealthyThresholdCountUndefined: Self = StObject.set(x, "UnhealthyThresholdCount", js.undefined)
    
    @scala.inline
    def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
