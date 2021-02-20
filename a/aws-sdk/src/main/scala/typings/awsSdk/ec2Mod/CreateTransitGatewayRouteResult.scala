package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTransitGatewayRouteResult extends StObject {
  
  /**
    * Information about the route.
    */
  var Route: js.UndefOr[TransitGatewayRoute] = js.native
}
object CreateTransitGatewayRouteResult {
  
  @scala.inline
  def apply(): CreateTransitGatewayRouteResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTransitGatewayRouteResult]
  }
  
  @scala.inline
  implicit class CreateTransitGatewayRouteResultMutableBuilder[Self <: CreateTransitGatewayRouteResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoute(value: TransitGatewayRoute): Self = StObject.set(x, "Route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteUndefined: Self = StObject.set(x, "Route", js.undefined)
  }
}
