package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyLocalGatewayRouteResult extends StObject {
  
  var Route: js.UndefOr[LocalGatewayRoute] = js.undefined
}
object ModifyLocalGatewayRouteResult {
  
  inline def apply(): ModifyLocalGatewayRouteResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyLocalGatewayRouteResult]
  }
  
  extension [Self <: ModifyLocalGatewayRouteResult](x: Self) {
    
    inline def setRoute(value: LocalGatewayRoute): Self = StObject.set(x, "Route", value.asInstanceOf[js.Any])
    
    inline def setRouteUndefined: Self = StObject.set(x, "Route", js.undefined)
  }
}
