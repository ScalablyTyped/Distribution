package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoRaWANGatewayMetadata extends StObject {
  
  /**
    * The gateway's EUI value.
    */
  var GatewayEui: js.UndefOr[typings.awsSdk.iotwirelessMod.GatewayEui] = js.undefined
  
  /**
    * The RSSI value.
    */
  var Rssi: js.UndefOr[Double] = js.undefined
  
  /**
    * The SNR value.
    */
  var Snr: js.UndefOr[Double] = js.undefined
}
object LoRaWANGatewayMetadata {
  
  inline def apply(): LoRaWANGatewayMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoRaWANGatewayMetadata]
  }
  
  extension [Self <: LoRaWANGatewayMetadata](x: Self) {
    
    inline def setGatewayEui(value: GatewayEui): Self = StObject.set(x, "GatewayEui", value.asInstanceOf[js.Any])
    
    inline def setGatewayEuiUndefined: Self = StObject.set(x, "GatewayEui", js.undefined)
    
    inline def setRssi(value: Double): Self = StObject.set(x, "Rssi", value.asInstanceOf[js.Any])
    
    inline def setRssiUndefined: Self = StObject.set(x, "Rssi", js.undefined)
    
    inline def setSnr(value: Double): Self = StObject.set(x, "Snr", value.asInstanceOf[js.Any])
    
    inline def setSnrUndefined: Self = StObject.set(x, "Snr", js.undefined)
  }
}
