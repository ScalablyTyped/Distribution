package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoRaWANJoinResourceTypeEventConfiguration extends StObject {
  
  /**
    * Denotes whether the wireless device join event topic is enabled or disabled.
    */
  var WirelessDeviceEventTopic: js.UndefOr[EventNotificationTopicStatus] = js.undefined
}
object LoRaWANJoinResourceTypeEventConfiguration {
  
  inline def apply(): LoRaWANJoinResourceTypeEventConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoRaWANJoinResourceTypeEventConfiguration]
  }
  
  extension [Self <: LoRaWANJoinResourceTypeEventConfiguration](x: Self) {
    
    inline def setWirelessDeviceEventTopic(value: EventNotificationTopicStatus): Self = StObject.set(x, "WirelessDeviceEventTopic", value.asInstanceOf[js.Any])
    
    inline def setWirelessDeviceEventTopicUndefined: Self = StObject.set(x, "WirelessDeviceEventTopic", js.undefined)
  }
}
