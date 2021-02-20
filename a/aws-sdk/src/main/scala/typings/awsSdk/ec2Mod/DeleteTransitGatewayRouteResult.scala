package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTransitGatewayRouteResult extends StObject {
  
  /**
    * Information about the route.
    */
  var Route: js.UndefOr[TransitGatewayRoute] = js.native
}
object DeleteTransitGatewayRouteResult {
  
  @scala.inline
  def apply(): DeleteTransitGatewayRouteResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTransitGatewayRouteResult]
  }
  
  @scala.inline
  implicit class DeleteTransitGatewayRouteResultMutableBuilder[Self <: DeleteTransitGatewayRouteResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoute(value: TransitGatewayRoute): Self = StObject.set(x, "Route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteUndefined: Self = StObject.set(x, "Route", js.undefined)
  }
}
