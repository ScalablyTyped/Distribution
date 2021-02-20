package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteLocalGatewayRouteResult extends StObject {
  
  /**
    * Information about the route.
    */
  var Route: js.UndefOr[LocalGatewayRoute] = js.native
}
object DeleteLocalGatewayRouteResult {
  
  @scala.inline
  def apply(): DeleteLocalGatewayRouteResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteLocalGatewayRouteResult]
  }
  
  @scala.inline
  implicit class DeleteLocalGatewayRouteResultMutableBuilder[Self <: DeleteLocalGatewayRouteResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoute(value: LocalGatewayRoute): Self = StObject.set(x, "Route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteUndefined: Self = StObject.set(x, "Route", js.undefined)
  }
}
