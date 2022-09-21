package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWirelessGatewaysResponse extends StObject {
  
  /**
    * The token to use to get the next set of results, or null if there are no additional results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.iotwirelessMod.NextToken] = js.undefined
  
  /**
    * The ID of the wireless gateway.
    */
  var WirelessGatewayList: js.UndefOr[WirelessGatewayStatisticsList] = js.undefined
}
object ListWirelessGatewaysResponse {
  
  inline def apply(): ListWirelessGatewaysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWirelessGatewaysResponse]
  }
  
  extension [Self <: ListWirelessGatewaysResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWirelessGatewayList(value: WirelessGatewayStatisticsList): Self = StObject.set(x, "WirelessGatewayList", value.asInstanceOf[js.Any])
    
    inline def setWirelessGatewayListUndefined: Self = StObject.set(x, "WirelessGatewayList", js.undefined)
    
    inline def setWirelessGatewayListVarargs(value: WirelessGatewayStatistics*): Self = StObject.set(x, "WirelessGatewayList", js.Array(value*))
  }
}
