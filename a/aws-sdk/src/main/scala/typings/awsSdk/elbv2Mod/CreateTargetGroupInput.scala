package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTargetGroupInput extends js.Object {
  
  /**
    * Indicates whether health checks are enabled. If the target type is lambda, health checks are disabled by default but can be enabled. If the target type is instance or ip, health checks are always enabled and cannot be disabled.
    */
  var HealthCheckEnabled: js.UndefOr[typings.awsSdk.elbv2Mod.HealthCheckEnabled] = js.native
  
  /**
    * The approximate amount of time, in seconds, between health checks of an individual target. For TCP health checks, the supported values are 10 and 30 seconds. If the target type is instance or ip, the default is 30 seconds. If the target group protocol is GENEVE, the default is 10 seconds. If the target type is lambda, the default is 35 seconds.
    */
  var HealthCheckIntervalSeconds: js.UndefOr[typings.awsSdk.elbv2Mod.HealthCheckIntervalSeconds] = js.native
  
  /**
    * [HTTP/HTTPS health checks] The destination for health checks on the targets. [HTTP1 or HTTP2 protocol version] The ping path. The default is /. [GRPC protocol version] The path of a custom health check method with the format /package.service/method. The default is /AWS.ALB/healthcheck.
    */
  var HealthCheckPath: js.UndefOr[Path] = js.native
  
  /**
    * The port the load balancer uses when performing health checks on targets. If the protocol is HTTP, HTTPS, TCP, TLS, UDP, or TCP_UDP, the default is traffic-port, which is the port on which each target receives traffic from the load balancer. If the protocol is GENEVE, the default is port 80.
    */
  var HealthCheckPort: js.UndefOr[typings.awsSdk.elbv2Mod.HealthCheckPort] = js.native
  
  /**
    * The protocol the load balancer uses when performing health checks on targets. For Application Load Balancers, the default is HTTP. For Network Load Balancers and Gateway Load Balancers, the default is TCP. The TCP protocol is not supported for health checks if the protocol of the target group is HTTP or HTTPS. The GENEVE, TLS, UDP, and TCP_UDP protocols are not supported for health checks.
    */
  var HealthCheckProtocol: js.UndefOr[ProtocolEnum] = js.native
  
  /**
    * The amount of time, in seconds, during which no response from a target means a failed health check. For target groups with a protocol of HTTP, HTTPS, or GENEVE, the default is 5 seconds. For target groups with a protocol of TCP or TLS, this value must be 6 seconds for HTTP health checks and 10 seconds for TCP and HTTPS health checks. If the target type is lambda, the default is 30 seconds.
    */
  var HealthCheckTimeoutSeconds: js.UndefOr[typings.awsSdk.elbv2Mod.HealthCheckTimeoutSeconds] = js.native
  
  /**
    * The number of consecutive health checks successes required before considering an unhealthy target healthy. For target groups with a protocol of HTTP or HTTPS, the default is 5. For target groups with a protocol of TCP, TLS, or GENEVE, the default is 3. If the target type is lambda, the default is 5.
    */
  var HealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.native
  
  /**
    * [HTTP/HTTPS health checks] The HTTP or gRPC codes to use when checking for a successful response from a target.
    */
  var Matcher: js.UndefOr[typings.awsSdk.elbv2Mod.Matcher] = js.native
  
  /**
    * The name of the target group. This name must be unique per region per account, can have a maximum of 32 characters, must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
    */
  var Name: TargetGroupName = js.native
  
  /**
    * The port on which the targets receive traffic. This port is used unless you specify a port override when registering the target. If the target is a Lambda function, this parameter does not apply. If the protocol is GENEVE, the supported port is 6081.
    */
  var Port: js.UndefOr[typings.awsSdk.elbv2Mod.Port] = js.native
  
  /**
    * The protocol to use for routing traffic to the targets. For Application Load Balancers, the supported protocols are HTTP and HTTPS. For Network Load Balancers, the supported protocols are TCP, TLS, UDP, or TCP_UDP. For Gateway Load Balancers, the supported protocol is GENEVE. A TCP_UDP listener must be associated with a TCP_UDP target group. If the target is a Lambda function, this parameter does not apply.
    */
  var Protocol: js.UndefOr[ProtocolEnum] = js.native
  
  /**
    * [HTTP/HTTPS protocol] The protocol version. Specify GRPC to send requests to targets using gRPC. Specify HTTP2 to send requests to targets using HTTP/2. The default is HTTP1, which sends requests to targets using HTTP/1.1.
    */
  var ProtocolVersion: js.UndefOr[typings.awsSdk.elbv2Mod.ProtocolVersion] = js.native
  
  /**
    * The tags to assign to the target group.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The type of target that you must specify when registering targets with this target group. You can't specify targets for a target group using more than one target type.    instance - Register targets by instance ID. This is the default value.    ip - Register targets by IP address. You can specify IP addresses from the subnets of the virtual private cloud (VPC) for the target group, the RFC 1918 range (10.0.0.0/8, 172.16.0.0/12, and 192.168.0.0/16), and the RFC 6598 range (100.64.0.0/10). You can't specify publicly routable IP addresses.    lambda - Register a single Lambda function as a target.  
    */
  var TargetType: js.UndefOr[TargetTypeEnum] = js.native
  
  /**
    * The number of consecutive health check failures required before considering a target unhealthy. If the target group protocol is HTTP or HTTPS, the default is 2. If the target group protocol is TCP or TLS, this value must be the same as the healthy threshold count. If the target group protocol is GENEVE, the default is 3. If the target type is lambda, the default is 2.
    */
  var UnhealthyThresholdCount: js.UndefOr[HealthCheckThresholdCount] = js.native
  
  /**
    * The identifier of the virtual private cloud (VPC). If the target is a Lambda function, this parameter does not apply. Otherwise, this parameter is required.
    */
  var VpcId: js.UndefOr[typings.awsSdk.elbv2Mod.VpcId] = js.native
}
object CreateTargetGroupInput {
  
  @scala.inline
  def apply(Name: TargetGroupName): CreateTargetGroupInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTargetGroupInput]
  }
  
  @scala.inline
  implicit class CreateTargetGroupInputOps[Self <: CreateTargetGroupInput] (val x: Self) extends AnyVal {
    
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
    def setName(value: TargetGroupName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
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
    def setPort(value: Port): Self = this.set("Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    
    @scala.inline
    def setProtocol(value: ProtocolEnum): Self = this.set("Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("Protocol", js.undefined)
    
    @scala.inline
    def setProtocolVersion(value: ProtocolVersion): Self = this.set("ProtocolVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocolVersion: Self = this.set("ProtocolVersion", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
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
