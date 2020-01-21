package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTransitGatewayRouteResult extends js.Object {
  /**
    * Information about the route.
    */
  var Route: js.UndefOr[TransitGatewayRoute] = js.native
}

object CreateTransitGatewayRouteResult {
  @scala.inline
  def apply(Route: TransitGatewayRoute = null): CreateTransitGatewayRouteResult = {
    val __obj = js.Dynamic.literal()
    if (Route != null) __obj.updateDynamic("Route")(Route.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransitGatewayRouteResult]
  }
}

