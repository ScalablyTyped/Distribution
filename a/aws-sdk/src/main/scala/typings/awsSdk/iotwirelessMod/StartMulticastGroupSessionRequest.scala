package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartMulticastGroupSessionRequest extends StObject {
  
  var Id: MulticastGroupId
  
  var LoRaWAN: LoRaWANMulticastSession
}
object StartMulticastGroupSessionRequest {
  
  inline def apply(Id: MulticastGroupId, LoRaWAN: LoRaWANMulticastSession): StartMulticastGroupSessionRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], LoRaWAN = LoRaWAN.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMulticastGroupSessionRequest]
  }
  
  extension [Self <: StartMulticastGroupSessionRequest](x: Self) {
    
    inline def setId(value: MulticastGroupId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setLoRaWAN(value: LoRaWANMulticastSession): Self = StObject.set(x, "LoRaWAN", value.asInstanceOf[js.Any])
  }
}
