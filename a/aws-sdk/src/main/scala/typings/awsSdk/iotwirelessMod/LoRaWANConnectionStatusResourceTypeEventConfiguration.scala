package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoRaWANConnectionStatusResourceTypeEventConfiguration extends StObject {
  
  /**
    * Denotes whether the wireless gateway connection status event topic is enabled or disabled.
    */
  var WirelessGatewayEventTopic: js.UndefOr[EventNotificationTopicStatus] = js.undefined
}
object LoRaWANConnectionStatusResourceTypeEventConfiguration {
  
  inline def apply(): LoRaWANConnectionStatusResourceTypeEventConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoRaWANConnectionStatusResourceTypeEventConfiguration]
  }
  
  extension [Self <: LoRaWANConnectionStatusResourceTypeEventConfiguration](x: Self) {
    
    inline def setWirelessGatewayEventTopic(value: EventNotificationTopicStatus): Self = StObject.set(x, "WirelessGatewayEventTopic", value.asInstanceOf[js.Any])
    
    inline def setWirelessGatewayEventTopicUndefined: Self = StObject.set(x, "WirelessGatewayEventTopic", js.undefined)
  }
}
