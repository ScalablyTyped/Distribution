package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateEndpointGroupRequest extends js.Object {
  
  /**
    * The list of endpoint objects.
    */
  var EndpointConfigurations: js.UndefOr[typings.awsSdk.globalacceleratorMod.EndpointConfigurations] = js.native
  
  /**
    * The AWS Region where the endpoint group is located. A listener can have only one endpoint group in a specific Region.
    */
  var EndpointGroupRegion: GenericString = js.native
  
  /**
    * The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
    */
  var HealthCheckIntervalSeconds: js.UndefOr[typings.awsSdk.globalacceleratorMod.HealthCheckIntervalSeconds] = js.native
  
  /**
    * If the protocol is HTTP/S, then this specifies the path that is the destination for health check targets. The default value is slash (/).
    */
  var HealthCheckPath: js.UndefOr[GenericString] = js.native
  
  /**
    * The port that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default port is the listener port that this endpoint group is associated with. If listener port is a list of ports, Global Accelerator uses the first port in the list.
    */
  var HealthCheckPort: js.UndefOr[typings.awsSdk.globalacceleratorMod.HealthCheckPort] = js.native
  
  /**
    * The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default value is TCP.
    */
  var HealthCheckProtocol: js.UndefOr[typings.awsSdk.globalacceleratorMod.HealthCheckProtocol] = js.native
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of the request.
    */
  var IdempotencyToken: typings.awsSdk.globalacceleratorMod.IdempotencyToken = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: GenericString = js.native
  
  /**
    * Override specific listener ports used to route traffic to endpoints that are part of this endpoint group. For example, you can create a port override in which the listener receives user traffic on ports 80 and 443, but your accelerator routes that traffic to ports 1080 and 1443, respectively, on the endpoints. For more information, see  Port overrides in the AWS Global Accelerator Developer Guide.
    */
  var PortOverrides: js.UndefOr[typings.awsSdk.globalacceleratorMod.PortOverrides] = js.native
  
  /**
    * The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. The default value is 3.
    */
  var ThresholdCount: js.UndefOr[typings.awsSdk.globalacceleratorMod.ThresholdCount] = js.native
  
  /**
    * The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups for this listener.  Use this action to increase (dial up) or decrease (dial down) traffic to a specific Region. The percentage is applied to the traffic that would otherwise have been routed to the Region based on optimal routing. The default value is 100.
    */
  var TrafficDialPercentage: js.UndefOr[typings.awsSdk.globalacceleratorMod.TrafficDialPercentage] = js.native
}
object CreateEndpointGroupRequest {
  
  @scala.inline
  def apply(EndpointGroupRegion: GenericString, IdempotencyToken: IdempotencyToken, ListenerArn: GenericString): CreateEndpointGroupRequest = {
    val __obj = js.Dynamic.literal(EndpointGroupRegion = EndpointGroupRegion.asInstanceOf[js.Any], IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], ListenerArn = ListenerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEndpointGroupRequest]
  }
  
  @scala.inline
  implicit class CreateEndpointGroupRequestOps[Self <: CreateEndpointGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndpointGroupRegion(value: GenericString): Self = this.set("EndpointGroupRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdempotencyToken(value: IdempotencyToken): Self = this.set("IdempotencyToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenerArn(value: GenericString): Self = this.set("ListenerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointConfigurationsVarargs(value: EndpointConfiguration*): Self = this.set("EndpointConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setEndpointConfigurations(value: EndpointConfigurations): Self = this.set("EndpointConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointConfigurations: Self = this.set("EndpointConfigurations", js.undefined)
    
    @scala.inline
    def setHealthCheckIntervalSeconds(value: HealthCheckIntervalSeconds): Self = this.set("HealthCheckIntervalSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckIntervalSeconds: Self = this.set("HealthCheckIntervalSeconds", js.undefined)
    
    @scala.inline
    def setHealthCheckPath(value: GenericString): Self = this.set("HealthCheckPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckPath: Self = this.set("HealthCheckPath", js.undefined)
    
    @scala.inline
    def setHealthCheckPort(value: HealthCheckPort): Self = this.set("HealthCheckPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckPort: Self = this.set("HealthCheckPort", js.undefined)
    
    @scala.inline
    def setHealthCheckProtocol(value: HealthCheckProtocol): Self = this.set("HealthCheckProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckProtocol: Self = this.set("HealthCheckProtocol", js.undefined)
    
    @scala.inline
    def setPortOverridesVarargs(value: PortOverride*): Self = this.set("PortOverrides", js.Array(value :_*))
    
    @scala.inline
    def setPortOverrides(value: PortOverrides): Self = this.set("PortOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortOverrides: Self = this.set("PortOverrides", js.undefined)
    
    @scala.inline
    def setThresholdCount(value: ThresholdCount): Self = this.set("ThresholdCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThresholdCount: Self = this.set("ThresholdCount", js.undefined)
    
    @scala.inline
    def setTrafficDialPercentage(value: TrafficDialPercentage): Self = this.set("TrafficDialPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrafficDialPercentage: Self = this.set("TrafficDialPercentage", js.undefined)
  }
}
