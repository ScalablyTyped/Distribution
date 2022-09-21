package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WirelessGatewayStatistics extends StObject {
  
  /**
    * The Amazon Resource Name of the resource.
    */
  var Arn: js.UndefOr[WirelessGatewayArn] = js.undefined
  
  /**
    * The description of the resource.
    */
  var Description: js.UndefOr[typings.awsSdk.iotwirelessMod.Description] = js.undefined
  
  /**
    * The ID of the wireless gateway reporting the data.
    */
  var Id: js.UndefOr[WirelessGatewayId] = js.undefined
  
  /**
    * The date and time when the most recent uplink was received.
    */
  var LastUplinkReceivedAt: js.UndefOr[ISODateTimeString] = js.undefined
  
  /**
    * LoRaWAN gateway info.
    */
  var LoRaWAN: js.UndefOr[LoRaWANGateway] = js.undefined
  
  /**
    * The name of the resource.
    */
  var Name: js.UndefOr[WirelessGatewayName] = js.undefined
}
object WirelessGatewayStatistics {
  
  inline def apply(): WirelessGatewayStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WirelessGatewayStatistics]
  }
  
  extension [Self <: WirelessGatewayStatistics](x: Self) {
    
    inline def setArn(value: WirelessGatewayArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: WirelessGatewayId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLastUplinkReceivedAt(value: ISODateTimeString): Self = StObject.set(x, "LastUplinkReceivedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUplinkReceivedAtUndefined: Self = StObject.set(x, "LastUplinkReceivedAt", js.undefined)
    
    inline def setLoRaWAN(value: LoRaWANGateway): Self = StObject.set(x, "LoRaWAN", value.asInstanceOf[js.Any])
    
    inline def setLoRaWANUndefined: Self = StObject.set(x, "LoRaWAN", js.undefined)
    
    inline def setName(value: WirelessGatewayName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
