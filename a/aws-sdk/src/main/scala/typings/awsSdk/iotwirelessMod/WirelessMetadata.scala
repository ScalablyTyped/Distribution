package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WirelessMetadata extends StObject {
  
  /**
    * LoRaWAN device info.
    */
  var LoRaWAN: js.UndefOr[LoRaWANSendDataToDevice] = js.undefined
  
  /**
    * The Sidewalk account credentials.
    */
  var Sidewalk: js.UndefOr[SidewalkSendDataToDevice] = js.undefined
}
object WirelessMetadata {
  
  inline def apply(): WirelessMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WirelessMetadata]
  }
  
  extension [Self <: WirelessMetadata](x: Self) {
    
    inline def setLoRaWAN(value: LoRaWANSendDataToDevice): Self = StObject.set(x, "LoRaWAN", value.asInstanceOf[js.Any])
    
    inline def setLoRaWANUndefined: Self = StObject.set(x, "LoRaWAN", js.undefined)
    
    inline def setSidewalk(value: SidewalkSendDataToDevice): Self = StObject.set(x, "Sidewalk", value.asInstanceOf[js.Any])
    
    inline def setSidewalkUndefined: Self = StObject.set(x, "Sidewalk", js.undefined)
  }
}
