package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLocalGatewayRouteResult extends js.Object {
  /**
    * Information about the route.
    */
  var Route: js.UndefOr[LocalGatewayRoute] = js.native
}

object DeleteLocalGatewayRouteResult {
  @scala.inline
  def apply(Route: LocalGatewayRoute = null): DeleteLocalGatewayRouteResult = {
    val __obj = js.Dynamic.literal()
    if (Route != null) __obj.updateDynamic("Route")(Route.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLocalGatewayRouteResult]
  }
}

