package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWirelessGatewayResponse extends StObject {
  
  /**
    * The Amazon Resource Name of the resource.
    */
  var Arn: js.UndefOr[WirelessGatewayArn] = js.undefined
  
  /**
    * The description of the resource.
    */
  var Description: js.UndefOr[typings.awsSdk.iotwirelessMod.Description] = js.undefined
  
  /**
    * The ID of the wireless gateway.
    */
  var Id: js.UndefOr[WirelessGatewayId] = js.undefined
  
  /**
    * Information about the wireless gateway.
    */
  var LoRaWAN: js.UndefOr[LoRaWANGateway] = js.undefined
  
  /**
    * The name of the resource.
    */
  var Name: js.UndefOr[WirelessGatewayName] = js.undefined
  
  /**
    * The ARN of the thing associated with the wireless gateway.
    */
  var ThingArn: js.UndefOr[typings.awsSdk.iotwirelessMod.ThingArn] = js.undefined
  
  /**
    * The name of the thing associated with the wireless gateway. The value is empty if a thing isn't associated with the gateway.
    */
  var ThingName: js.UndefOr[typings.awsSdk.iotwirelessMod.ThingName] = js.undefined
}
object GetWirelessGatewayResponse {
  
  inline def apply(): GetWirelessGatewayResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWirelessGatewayResponse]
  }
  
  extension [Self <: GetWirelessGatewayResponse](x: Self) {
    
    inline def setArn(value: WirelessGatewayArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: WirelessGatewayId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLoRaWAN(value: LoRaWANGateway): Self = StObject.set(x, "LoRaWAN", value.asInstanceOf[js.Any])
    
    inline def setLoRaWANUndefined: Self = StObject.set(x, "LoRaWAN", js.undefined)
    
    inline def setName(value: WirelessGatewayName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setThingArn(value: ThingArn): Self = StObject.set(x, "ThingArn", value.asInstanceOf[js.Any])
    
    inline def setThingArnUndefined: Self = StObject.set(x, "ThingArn", js.undefined)
    
    inline def setThingName(value: ThingName): Self = StObject.set(x, "ThingName", value.asInstanceOf[js.Any])
    
    inline def setThingNameUndefined: Self = StObject.set(x, "ThingName", js.undefined)
  }
}
