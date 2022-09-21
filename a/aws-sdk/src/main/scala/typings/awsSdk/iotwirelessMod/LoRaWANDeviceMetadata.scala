package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoRaWANDeviceMetadata extends StObject {
  
  /**
    * The DataRate value.
    */
  var DataRate: js.UndefOr[Integer] = js.undefined
  
  /**
    * The DevEUI value.
    */
  var DevEui: js.UndefOr[typings.awsSdk.iotwirelessMod.DevEui] = js.undefined
  
  /**
    * The FPort value.
    */
  var FPort: js.UndefOr[Integer] = js.undefined
  
  /**
    * The device's channel frequency in Hz.
    */
  var Frequency: js.UndefOr[Integer] = js.undefined
  
  /**
    * Information about the gateways accessed by the device.
    */
  var Gateways: js.UndefOr[LoRaWANGatewayMetadataList] = js.undefined
  
  /**
    * The date and time of the metadata.
    */
  var Timestamp: js.UndefOr[ISODateTimeString] = js.undefined
}
object LoRaWANDeviceMetadata {
  
  inline def apply(): LoRaWANDeviceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoRaWANDeviceMetadata]
  }
  
  extension [Self <: LoRaWANDeviceMetadata](x: Self) {
    
    inline def setDataRate(value: Integer): Self = StObject.set(x, "DataRate", value.asInstanceOf[js.Any])
    
    inline def setDataRateUndefined: Self = StObject.set(x, "DataRate", js.undefined)
    
    inline def setDevEui(value: DevEui): Self = StObject.set(x, "DevEui", value.asInstanceOf[js.Any])
    
    inline def setDevEuiUndefined: Self = StObject.set(x, "DevEui", js.undefined)
    
    inline def setFPort(value: Integer): Self = StObject.set(x, "FPort", value.asInstanceOf[js.Any])
    
    inline def setFPortUndefined: Self = StObject.set(x, "FPort", js.undefined)
    
    inline def setFrequency(value: Integer): Self = StObject.set(x, "Frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "Frequency", js.undefined)
    
    inline def setGateways(value: LoRaWANGatewayMetadataList): Self = StObject.set(x, "Gateways", value.asInstanceOf[js.Any])
    
    inline def setGatewaysUndefined: Self = StObject.set(x, "Gateways", js.undefined)
    
    inline def setGatewaysVarargs(value: LoRaWANGatewayMetadata*): Self = StObject.set(x, "Gateways", js.Array(value*))
    
    inline def setTimestamp(value: ISODateTimeString): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
