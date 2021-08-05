package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLocalGatewayRouteResult extends StObject {
  
  /**
    * Information about the route.
    */
  var Route: js.UndefOr[LocalGatewayRoute] = js.undefined
}
object DeleteLocalGatewayRouteResult {
  
  inline def apply(): DeleteLocalGatewayRouteResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteLocalGatewayRouteResult]
  }
  
  extension [Self <: DeleteLocalGatewayRouteResult](x: Self) {
    
    inline def setRoute(value: LocalGatewayRoute): Self = StObject.set(x, "Route", value.asInstanceOf[js.Any])
    
    inline def setRouteUndefined: Self = StObject.set(x, "Route", js.undefined)
  }
}
