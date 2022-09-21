package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMulticastGroupRequest extends StObject {
  
  /**
    * Each resource must have a unique client request token. If you try to create a new resource with the same token as a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will automatically generate a unique client request. 
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.iotwirelessMod.ClientRequestToken] = js.undefined
  
  /**
    * The description of the multicast group.
    */
  var Description: js.UndefOr[typings.awsSdk.iotwirelessMod.Description] = js.undefined
  
  var LoRaWAN: LoRaWANMulticast
  
  var Name: js.UndefOr[MulticastGroupName] = js.undefined
  
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateMulticastGroupRequest {
  
  inline def apply(LoRaWAN: LoRaWANMulticast): CreateMulticastGroupRequest = {
    val __obj = js.Dynamic.literal(LoRaWAN = LoRaWAN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMulticastGroupRequest]
  }
  
  extension [Self <: CreateMulticastGroupRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLoRaWAN(value: LoRaWANMulticast): Self = StObject.set(x, "LoRaWAN", value.asInstanceOf[js.Any])
    
    inline def setName(value: MulticastGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
