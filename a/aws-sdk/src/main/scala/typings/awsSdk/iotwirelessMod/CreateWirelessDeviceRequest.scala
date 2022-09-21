package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWirelessDeviceRequest extends StObject {
  
  /**
    * Each resource must have a unique client request token. If you try to create a new resource with the same token as a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will automatically generate a unique client request. 
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.iotwirelessMod.ClientRequestToken] = js.undefined
  
  /**
    * The description of the new resource.
    */
  var Description: js.UndefOr[typings.awsSdk.iotwirelessMod.Description] = js.undefined
  
  /**
    * The name of the destination to assign to the new wireless device.
    */
  var DestinationName: typings.awsSdk.iotwirelessMod.DestinationName
  
  /**
    * The device configuration information to use to create the wireless device.
    */
  var LoRaWAN: js.UndefOr[LoRaWANDevice] = js.undefined
  
  /**
    * The name of the new resource.
    */
  var Name: js.UndefOr[WirelessDeviceName] = js.undefined
  
  /**
    * The tags to attach to the new wireless device. Tags are metadata that you can use to manage a resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The wireless device type.
    */
  var Type: WirelessDeviceType
}
object CreateWirelessDeviceRequest {
  
  inline def apply(DestinationName: DestinationName, Type: WirelessDeviceType): CreateWirelessDeviceRequest = {
    val __obj = js.Dynamic.literal(DestinationName = DestinationName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWirelessDeviceRequest]
  }
  
  extension [Self <: CreateWirelessDeviceRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDestinationName(value: DestinationName): Self = StObject.set(x, "DestinationName", value.asInstanceOf[js.Any])
    
    inline def setLoRaWAN(value: LoRaWANDevice): Self = StObject.set(x, "LoRaWAN", value.asInstanceOf[js.Any])
    
    inline def setLoRaWANUndefined: Self = StObject.set(x, "LoRaWAN", js.undefined)
    
    inline def setName(value: WirelessDeviceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setType(value: WirelessDeviceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
