package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoRaWANJoinEventNotificationConfigurations extends StObject {
  
  /**
    * Denotes whether the Dev EUI join event topic is enabled or disabled.
    */
  var DevEuiEventTopic: js.UndefOr[EventNotificationTopicStatus] = js.undefined
}
object LoRaWANJoinEventNotificationConfigurations {
  
  inline def apply(): LoRaWANJoinEventNotificationConfigurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoRaWANJoinEventNotificationConfigurations]
  }
  
  extension [Self <: LoRaWANJoinEventNotificationConfigurations](x: Self) {
    
    inline def setDevEuiEventTopic(value: EventNotificationTopicStatus): Self = StObject.set(x, "DevEuiEventTopic", value.asInstanceOf[js.Any])
    
    inline def setDevEuiEventTopicUndefined: Self = StObject.set(x, "DevEuiEventTopic", js.undefined)
  }
}
