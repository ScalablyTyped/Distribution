package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEndpointGroupRequest extends StObject {
  
  /**
    * The list of endpoint objects.
    */
  var EndpointConfigurations: js.UndefOr[typings.awsSdk.globalacceleratorMod.EndpointConfigurations] = js.undefined
  
  /**
    * The AWS Region where the endpoint group is located. A listener can have only one endpoint group in a specific Region.
    */
  var EndpointGroupRegion: GenericString
  
  /**
    * The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
    */
  var HealthCheckIntervalSeconds: js.UndefOr[typings.awsSdk.globalacceleratorMod.HealthCheckIntervalSeconds] = js.undefined
  
  /**
    * If the protocol is HTTP/S, then this specifies the path that is the destination for health check targets. The default value is slash (/).
    */
  var HealthCheckPath: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The port that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default port is the listener port that this endpoint group is associated with. If listener port is a list of ports, Global Accelerator uses the first port in the list.
    */
  var HealthCheckPort: js.UndefOr[typings.awsSdk.globalacceleratorMod.HealthCheckPort] = js.undefined
  
  /**
    * The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default value is TCP.
    */
  var HealthCheckProtocol: js.UndefOr[typings.awsSdk.globalacceleratorMod.HealthCheckProtocol] = js.undefined
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of the request.
    */
  var IdempotencyToken: typings.awsSdk.globalacceleratorMod.IdempotencyToken
  
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: GenericString
  
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
object CreateEndpointGroupRequest {
  
  inline def apply(EndpointGroupRegion: GenericString, IdempotencyToken: IdempotencyToken, ListenerArn: GenericString): CreateEndpointGroupRequest = {
    val __obj = js.Dynamic.literal(EndpointGroupRegion = EndpointGroupRegion.asInstanceOf[js.Any], IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], ListenerArn = ListenerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEndpointGroupRequest]
  }
  
  extension [Self <: CreateEndpointGroupRequest](x: Self) {
    
    inline def setEndpointConfigurations(value: EndpointConfigurations): Self = StObject.set(x, "EndpointConfigurations", value.asInstanceOf[js.Any])
    
    inline def setEndpointConfigurationsUndefined: Self = StObject.set(x, "EndpointConfigurations", js.undefined)
    
    inline def setEndpointConfigurationsVarargs(value: EndpointConfiguration*): Self = StObject.set(x, "EndpointConfigurations", js.Array(value :_*))
    
    inline def setEndpointGroupRegion(value: GenericString): Self = StObject.set(x, "EndpointGroupRegion", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckIntervalSeconds(value: HealthCheckIntervalSeconds): Self = StObject.set(x, "HealthCheckIntervalSeconds", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckIntervalSecondsUndefined: Self = StObject.set(x, "HealthCheckIntervalSeconds", js.undefined)
    
    inline def setHealthCheckPath(value: GenericString): Self = StObject.set(x, "HealthCheckPath", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckPathUndefined: Self = StObject.set(x, "HealthCheckPath", js.undefined)
    
    inline def setHealthCheckPort(value: HealthCheckPort): Self = StObject.set(x, "HealthCheckPort", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckPortUndefined: Self = StObject.set(x, "HealthCheckPort", js.undefined)
    
    inline def setHealthCheckProtocol(value: HealthCheckProtocol): Self = StObject.set(x, "HealthCheckProtocol", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckProtocolUndefined: Self = StObject.set(x, "HealthCheckProtocol", js.undefined)
    
    inline def setIdempotencyToken(value: IdempotencyToken): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    inline def setListenerArn(value: GenericString): Self = StObject.set(x, "ListenerArn", value.asInstanceOf[js.Any])
    
    inline def setPortOverrides(value: PortOverrides): Self = StObject.set(x, "PortOverrides", value.asInstanceOf[js.Any])
    
    inline def setPortOverridesUndefined: Self = StObject.set(x, "PortOverrides", js.undefined)
    
    inline def setPortOverridesVarargs(value: PortOverride*): Self = StObject.set(x, "PortOverrides", js.Array(value :_*))
    
    inline def setThresholdCount(value: ThresholdCount): Self = StObject.set(x, "ThresholdCount", value.asInstanceOf[js.Any])
    
    inline def setThresholdCountUndefined: Self = StObject.set(x, "ThresholdCount", js.undefined)
    
    inline def setTrafficDialPercentage(value: TrafficDialPercentage): Self = StObject.set(x, "TrafficDialPercentage", value.asInstanceOf[js.Any])
    
    inline def setTrafficDialPercentageUndefined: Self = StObject.set(x, "TrafficDialPercentage", js.undefined)
  }
}
