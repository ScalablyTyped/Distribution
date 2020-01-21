package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchTransitGatewayRoutesResult extends js.Object {
  /**
    * Indicates whether there are additional routes available.
    */
  var AdditionalRoutesAvailable: js.UndefOr[Boolean] = js.native
  /**
    * Information about the routes.
    */
  var Routes: js.UndefOr[TransitGatewayRouteList] = js.native
}

object SearchTransitGatewayRoutesResult {
  @scala.inline
  def apply(
    AdditionalRoutesAvailable: js.UndefOr[scala.Boolean] = js.undefined,
    Routes: TransitGatewayRouteList = null
  ): SearchTransitGatewayRoutesResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AdditionalRoutesAvailable)) __obj.updateDynamic("AdditionalRoutesAvailable")(AdditionalRoutesAvailable.asInstanceOf[js.Any])
    if (Routes != null) __obj.updateDynamic("Routes")(Routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchTransitGatewayRoutesResult]
  }
}

