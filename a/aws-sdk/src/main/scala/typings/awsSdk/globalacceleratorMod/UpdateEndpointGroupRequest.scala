package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEndpointGroupRequest extends StObject {
  
  /**
    * The list of endpoint objects. A resource must be valid and active when you add it as an endpoint.
    */
  var EndpointConfigurations: js.UndefOr[typings.awsSdk.globalacceleratorMod.EndpointConfigurations] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint group.
    */
  var EndpointGroupArn: GenericString
  
  /**
    * The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
    */
  var HealthCheckIntervalSeconds: js.UndefOr[typings.awsSdk.globalacceleratorMod.HealthCheckIntervalSeconds] = js.undefined
  
  /**
    * If the protocol is HTTP/S, then this specifies the path that is the destination for health check targets. The default value is slash (/).
    */
  var HealthCheckPath: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The port that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default port is the listener port that this endpoint group is associated with. If the listener port is a list of ports, Global Accelerator uses the first port in the list.
    */
  var HealthCheckPort: js.UndefOr[typings.awsSdk.globalacceleratorMod.HealthCheckPort] = js.undefined
  
  /**
    * The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default value is TCP.
    */
  var HealthCheckProtocol: js.UndefOr[typings.awsSdk.globalacceleratorMod.HealthCheckProtocol] = js.undefined
  
  /**
    * Override specific listener ports used to route traffic to endpoints that are part of this endpoint group. For example, you can create a port override in which the listener receives user traffic on ports 80 and 443, but your accelerator routes that traffic to ports 1080 and 1443, respectively, on the endpoints. For more information, see  Port overrides in the AWS Global Accelerator Developer Guide.
    */
  var PortOverrides: js.UndefOr[typings.awsSdk.globalacceleratorMod.PortOverrides] = js.undefined
  
  /**
    * The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. The default value is 3.
    */
  var ThresholdCount: js.UndefOr[typings.awsSdk.globalacceleratorMod.ThresholdCount] = js.undefined
  
  /**
    * The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups for this listener.  Use this action to increase (dial up) or decrease (dial down) traffic to a specific Region. The percentage is applied to the traffic that would otherwise have been routed to the Region based on optimal routing. The default value is 100.
    */
  var TrafficDialPercentage: js.UndefOr[typings.awsSdk.globalacceleratorMod.TrafficDialPercentage] = js.undefined
}
object UpdateEndpointGroupRequest {
  
  @scala.inline
  def apply(EndpointGroupArn: GenericString): UpdateEndpointGroupRequest = {
    val __obj = js.Dynamic.literal(EndpointGroupArn = EndpointGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEndpointGroupRequest]
  }
  
  @scala.inline
  implicit class UpdateEndpointGroupRequestMutableBuilder[Self <: UpdateEndpointGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointConfigurations(value: EndpointConfigurations): Self = StObject.set(x, "EndpointConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointConfigurationsUndefined: Self = StObject.set(x, "EndpointConfigurations", js.undefined)
    
    @scala.inline
    def setEndpointConfigurationsVarargs(value: EndpointConfiguration*): Self = StObject.set(x, "EndpointConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setEndpointGroupArn(value: GenericString): Self = StObject.set(x, "EndpointGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckIntervalSeconds(value: HealthCheckIntervalSeconds): Self = StObject.set(x, "HealthCheckIntervalSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckIntervalSecondsUndefined: Self = StObject.set(x, "HealthCheckIntervalSeconds", js.undefined)
    
    @scala.inline
    def setHealthCheckPath(value: GenericString): Self = StObject.set(x, "HealthCheckPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckPathUndefined: Self = StObject.set(x, "HealthCheckPath", js.undefined)
    
    @scala.inline
    def setHealthCheckPort(value: HealthCheckPort): Self = StObject.set(x, "HealthCheckPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckPortUndefined: Self = StObject.set(x, "HealthCheckPort", js.undefined)
    
    @scala.inline
    def setHealthCheckProtocol(value: HealthCheckProtocol): Self = StObject.set(x, "HealthCheckProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckProtocolUndefined: Self = StObject.set(x, "HealthCheckProtocol", js.undefined)
    
    @scala.inline
    def setPortOverrides(value: PortOverrides): Self = StObject.set(x, "PortOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortOverridesUndefined: Self = StObject.set(x, "PortOverrides", js.undefined)
    
    @scala.inline
    def setPortOverridesVarargs(value: PortOverride*): Self = StObject.set(x, "PortOverrides", js.Array(value :_*))
    
    @scala.inline
    def setThresholdCount(value: ThresholdCount): Self = StObject.set(x, "ThresholdCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdCountUndefined: Self = StObject.set(x, "ThresholdCount", js.undefined)
    
    @scala.inline
    def setTrafficDialPercentage(value: TrafficDialPercentage): Self = StObject.set(x, "TrafficDialPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficDialPercentageUndefined: Self = StObject.set(x, "TrafficDialPercentage", js.undefined)
  }
}
