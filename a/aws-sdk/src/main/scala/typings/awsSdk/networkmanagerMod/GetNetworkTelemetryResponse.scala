package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkTelemetryResponse extends StObject {
  
  /**
    * The network telemetry.
    */
  var NetworkTelemetry: js.UndefOr[NetworkTelemetryList] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.networkmanagerMod.NextToken] = js.undefined
}
object GetNetworkTelemetryResponse {
  
  inline def apply(): GetNetworkTelemetryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNetworkTelemetryResponse]
  }
  
  extension [Self <: GetNetworkTelemetryResponse](x: Self) {
    
    inline def setNetworkTelemetry(value: NetworkTelemetryList): Self = StObject.set(x, "NetworkTelemetry", value.asInstanceOf[js.Any])
    
    inline def setNetworkTelemetryUndefined: Self = StObject.set(x, "NetworkTelemetry", js.undefined)
    
    inline def setNetworkTelemetryVarargs(value: NetworkTelemetry*): Self = StObject.set(x, "NetworkTelemetry", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
