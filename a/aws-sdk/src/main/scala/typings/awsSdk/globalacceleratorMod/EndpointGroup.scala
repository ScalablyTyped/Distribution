package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointGroup extends StObject {
  
  /**
    * The list of endpoint objects.
    */
  var EndpointDescriptions: js.UndefOr[typings.awsSdk.globalacceleratorMod.EndpointDescriptions] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint group.
    */
  var EndpointGroupArn: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The AWS Region where the endpoint group is located.
    */
  var EndpointGroupRegion: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The time—10 seconds or 30 seconds—between health checks for each endpoint. The default value is 30.
    */
  var HealthCheckIntervalSeconds: js.UndefOr[typings.awsSdk.globalacceleratorMod.HealthCheckIntervalSeconds] = js.undefined
  
  /**
    * If the protocol is HTTP/S, then this value provides the ping path that Global Accelerator uses for the destination on the endpoints for health checks. The default is slash (/).
    */
  var HealthCheckPath: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The port that Global Accelerator uses to perform health checks on endpoints that are part of this endpoint group.  The default port is the port for the listener that this endpoint group is associated with. If the listener port is a list, Global Accelerator uses the first specified port in the list of ports.
    */
  var HealthCheckPort: js.UndefOr[typings.awsSdk.globalacceleratorMod.HealthCheckPort] = js.undefined
  
  /**
    * The protocol that Global Accelerator uses to perform health checks on endpoints that are part of this endpoint group. The default value is TCP.
    */
  var HealthCheckProtocol: js.UndefOr[typings.awsSdk.globalacceleratorMod.HealthCheckProtocol] = js.undefined
  
  /**
    * Allows you to override the destination ports used to route traffic to an endpoint. Using a port override lets you to map a list of external destination ports (that your users send traffic to) to a list of internal destination ports that you want an application endpoint to receive traffic on. 
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
object EndpointGroup {
  
  @scala.inline
  def apply(): EndpointGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointGroup]
  }
  
  @scala.inline
  implicit class EndpointGroupMutableBuilder[Self <: EndpointGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointDescriptions(value: EndpointDescriptions): Self = StObject.set(x, "EndpointDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointDescriptionsUndefined: Self = StObject.set(x, "EndpointDescriptions", js.undefined)
    
    @scala.inline
    def setEndpointDescriptionsVarargs(value: EndpointDescription*): Self = StObject.set(x, "EndpointDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setEndpointGroupArn(value: GenericString): Self = StObject.set(x, "EndpointGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointGroupArnUndefined: Self = StObject.set(x, "EndpointGroupArn", js.undefined)
    
    @scala.inline
    def setEndpointGroupRegion(value: GenericString): Self = StObject.set(x, "EndpointGroupRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointGroupRegionUndefined: Self = StObject.set(x, "EndpointGroupRegion", js.undefined)
    
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
