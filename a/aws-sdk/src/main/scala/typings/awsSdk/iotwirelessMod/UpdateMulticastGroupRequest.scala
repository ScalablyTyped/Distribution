package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMulticastGroupRequest extends StObject {
  
  var Description: js.UndefOr[typings.awsSdk.iotwirelessMod.Description] = js.undefined
  
  var Id: MulticastGroupId
  
  var LoRaWAN: js.UndefOr[LoRaWANMulticast] = js.undefined
  
  var Name: js.UndefOr[MulticastGroupName] = js.undefined
}
object UpdateMulticastGroupRequest {
  
  inline def apply(Id: MulticastGroupId): UpdateMulticastGroupRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMulticastGroupRequest]
  }
  
  extension [Self <: UpdateMulticastGroupRequest](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: MulticastGroupId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setLoRaWAN(value: LoRaWANMulticast): Self = StObject.set(x, "LoRaWAN", value.asInstanceOf[js.Any])
    
    inline def setLoRaWANUndefined: Self = StObject.set(x, "LoRaWAN", js.undefined)
    
    inline def setName(value: MulticastGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
