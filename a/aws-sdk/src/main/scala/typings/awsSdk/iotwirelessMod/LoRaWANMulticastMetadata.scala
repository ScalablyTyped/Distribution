package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoRaWANMulticastMetadata extends StObject {
  
  var FPort: js.UndefOr[typings.awsSdk.iotwirelessMod.FPort] = js.undefined
}
object LoRaWANMulticastMetadata {
  
  inline def apply(): LoRaWANMulticastMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoRaWANMulticastMetadata]
  }
  
  extension [Self <: LoRaWANMulticastMetadata](x: Self) {
    
    inline def setFPort(value: FPort): Self = StObject.set(x, "FPort", value.asInstanceOf[js.Any])
    
    inline def setFPortUndefined: Self = StObject.set(x, "FPort", js.undefined)
  }
}
