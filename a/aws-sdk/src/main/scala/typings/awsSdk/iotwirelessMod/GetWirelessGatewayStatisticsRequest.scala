package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWirelessGatewayStatisticsRequest extends StObject {
  
  /**
    * The ID of the wireless gateway for which to get the data.
    */
  var WirelessGatewayId: typings.awsSdk.iotwirelessMod.WirelessGatewayId
}
object GetWirelessGatewayStatisticsRequest {
  
  inline def apply(WirelessGatewayId: WirelessGatewayId): GetWirelessGatewayStatisticsRequest = {
    val __obj = js.Dynamic.literal(WirelessGatewayId = WirelessGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWirelessGatewayStatisticsRequest]
  }
  
  extension [Self <: GetWirelessGatewayStatisticsRequest](x: Self) {
    
    inline def setWirelessGatewayId(value: WirelessGatewayId): Self = StObject.set(x, "WirelessGatewayId", value.asInstanceOf[js.Any])
  }
}
