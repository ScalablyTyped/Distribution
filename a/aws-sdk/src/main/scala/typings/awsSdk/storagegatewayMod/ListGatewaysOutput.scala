package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGatewaysOutput extends StObject {
  
  /**
    * An array of GatewayInfo objects.
    */
  var Gateways: js.UndefOr[typings.awsSdk.storagegatewayMod.Gateways] = js.undefined
  
  /**
    * Use the marker in your next request to fetch the next set of gateways in the list. If there are no more gateways to list, this field does not appear in the response.
    */
  var Marker: js.UndefOr[typings.awsSdk.storagegatewayMod.Marker] = js.undefined
}
object ListGatewaysOutput {
  
  inline def apply(): ListGatewaysOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGatewaysOutput]
  }
  
  extension [Self <: ListGatewaysOutput](x: Self) {
    
    inline def setGateways(value: Gateways): Self = StObject.set(x, "Gateways", value.asInstanceOf[js.Any])
    
    inline def setGatewaysUndefined: Self = StObject.set(x, "Gateways", js.undefined)
    
    inline def setGatewaysVarargs(value: GatewayInfo*): Self = StObject.set(x, "Gateways", js.Array(value :_*))
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
