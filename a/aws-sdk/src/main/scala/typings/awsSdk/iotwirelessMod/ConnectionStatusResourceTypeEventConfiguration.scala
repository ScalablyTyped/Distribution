package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionStatusResourceTypeEventConfiguration extends StObject {
  
  /**
    * Connection status resource type event configuration object for enabling or disabling LoRaWAN related event topics.
    */
  var LoRaWAN: js.UndefOr[LoRaWANConnectionStatusResourceTypeEventConfiguration] = js.undefined
}
object ConnectionStatusResourceTypeEventConfiguration {
  
  inline def apply(): ConnectionStatusResourceTypeEventConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionStatusResourceTypeEventConfiguration]
  }
  
  extension [Self <: ConnectionStatusResourceTypeEventConfiguration](x: Self) {
    
    inline def setLoRaWAN(value: LoRaWANConnectionStatusResourceTypeEventConfiguration): Self = StObject.set(x, "LoRaWAN", value.asInstanceOf[js.Any])
    
    inline def setLoRaWANUndefined: Self = StObject.set(x, "LoRaWAN", js.undefined)
  }
}
