package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayListItem extends StObject {
  
  /**
    * The frequency to use for the gateways when sending a downlink message to the wireless device.
    */
  var DownlinkFrequency: typings.awsSdk.iotwirelessMod.DownlinkFrequency
  
  /**
    * The ID of the wireless gateways that you want to add to the list of gateways when sending downlink messages.
    */
  var GatewayId: WirelessGatewayId
}
object GatewayListItem {
  
  inline def apply(DownlinkFrequency: DownlinkFrequency, GatewayId: WirelessGatewayId): GatewayListItem = {
    val __obj = js.Dynamic.literal(DownlinkFrequency = DownlinkFrequency.asInstanceOf[js.Any], GatewayId = GatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayListItem]
  }
  
  extension [Self <: GatewayListItem](x: Self) {
    
    inline def setDownlinkFrequency(value: DownlinkFrequency): Self = StObject.set(x, "DownlinkFrequency", value.asInstanceOf[js.Any])
    
    inline def setGatewayId(value: WirelessGatewayId): Self = StObject.set(x, "GatewayId", value.asInstanceOf[js.Any])
  }
}
