package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MulticastWirelessMetadata extends StObject {
  
  var LoRaWAN: js.UndefOr[LoRaWANMulticastMetadata] = js.undefined
}
object MulticastWirelessMetadata {
  
  inline def apply(): MulticastWirelessMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MulticastWirelessMetadata]
  }
  
  extension [Self <: MulticastWirelessMetadata](x: Self) {
    
    inline def setLoRaWAN(value: LoRaWANMulticastMetadata): Self = StObject.set(x, "LoRaWAN", value.asInstanceOf[js.Any])
    
    inline def setLoRaWANUndefined: Self = StObject.set(x, "LoRaWAN", js.undefined)
  }
}
