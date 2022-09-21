package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEventConfigurationByResourceTypesRequest extends StObject {
  
  /**
    * Connection status resource type event configuration object for enabling and disabling wireless gateway topic.
    */
  var ConnectionStatus: js.UndefOr[ConnectionStatusResourceTypeEventConfiguration] = js.undefined
  
  /**
    * Device registration state resource type event configuration object for enabling and disabling wireless gateway topic.
    */
  var DeviceRegistrationState: js.UndefOr[DeviceRegistrationStateResourceTypeEventConfiguration] = js.undefined
  
  /**
    * Join resource type event configuration object for enabling and disabling wireless device topic.
    */
  var Join: js.UndefOr[JoinResourceTypeEventConfiguration] = js.undefined
  
  /**
    * Message delivery status resource type event configuration object for enabling and disabling wireless device topic.
    */
  var MessageDeliveryStatus: js.UndefOr[MessageDeliveryStatusResourceTypeEventConfiguration] = js.undefined
  
  /**
    * Proximity resource type event configuration object for enabling and disabling wireless gateway topic.
    */
  var Proximity: js.UndefOr[ProximityResourceTypeEventConfiguration] = js.undefined
}
object UpdateEventConfigurationByResourceTypesRequest {
  
  inline def apply(): UpdateEventConfigurationByResourceTypesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEventConfigurationByResourceTypesRequest]
  }
  
  extension [Self <: UpdateEventConfigurationByResourceTypesRequest](x: Self) {
    
    inline def setConnectionStatus(value: ConnectionStatusResourceTypeEventConfiguration): Self = StObject.set(x, "ConnectionStatus", value.asInstanceOf[js.Any])
    
    inline def setConnectionStatusUndefined: Self = StObject.set(x, "ConnectionStatus", js.undefined)
    
    inline def setDeviceRegistrationState(value: DeviceRegistrationStateResourceTypeEventConfiguration): Self = StObject.set(x, "DeviceRegistrationState", value.asInstanceOf[js.Any])
    
    inline def setDeviceRegistrationStateUndefined: Self = StObject.set(x, "DeviceRegistrationState", js.undefined)
    
    inline def setJoin(value: JoinResourceTypeEventConfiguration): Self = StObject.set(x, "Join", value.asInstanceOf[js.Any])
    
    inline def setJoinUndefined: Self = StObject.set(x, "Join", js.undefined)
    
    inline def setMessageDeliveryStatus(value: MessageDeliveryStatusResourceTypeEventConfiguration): Self = StObject.set(x, "MessageDeliveryStatus", value.asInstanceOf[js.Any])
    
    inline def setMessageDeliveryStatusUndefined: Self = StObject.set(x, "MessageDeliveryStatus", js.undefined)
    
    inline def setProximity(value: ProximityResourceTypeEventConfiguration): Self = StObject.set(x, "Proximity", value.asInstanceOf[js.Any])
    
    inline def setProximityUndefined: Self = StObject.set(x, "Proximity", js.undefined)
  }
}
