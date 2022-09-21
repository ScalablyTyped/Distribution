package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEventConfigurationByResourceTypesResponse extends StObject {
  
  /**
    * Resource type event configuration for the connection status event.
    */
  var ConnectionStatus: js.UndefOr[ConnectionStatusResourceTypeEventConfiguration] = js.undefined
  
  /**
    * Resource type event configuration for the device registration state event.
    */
  var DeviceRegistrationState: js.UndefOr[DeviceRegistrationStateResourceTypeEventConfiguration] = js.undefined
  
  /**
    * Resource type event configuration for the join event.
    */
  var Join: js.UndefOr[JoinResourceTypeEventConfiguration] = js.undefined
  
  /**
    * Resource type event configuration object for the message delivery status event.
    */
  var MessageDeliveryStatus: js.UndefOr[MessageDeliveryStatusResourceTypeEventConfiguration] = js.undefined
  
  /**
    * Resource type event configuration for the proximity event.
    */
  var Proximity: js.UndefOr[ProximityResourceTypeEventConfiguration] = js.undefined
}
object GetEventConfigurationByResourceTypesResponse {
  
  inline def apply(): GetEventConfigurationByResourceTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEventConfigurationByResourceTypesResponse]
  }
  
  extension [Self <: GetEventConfigurationByResourceTypesResponse](x: Self) {
    
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
