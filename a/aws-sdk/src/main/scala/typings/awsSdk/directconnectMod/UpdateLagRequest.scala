package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateLagRequest extends js.Object {
  /**
    * The ID of the LAG.
    */
  var lagId: LagId = js.native
  /**
    * The name of the LAG.
    */
  var lagName: js.UndefOr[LagName] = js.native
  /**
    * The minimum number of physical connections that must be operational for the LAG itself to be operational.
    */
  var minimumLinks: js.UndefOr[Count] = js.native
}

object UpdateLagRequest {
  @scala.inline
  def apply(lagId: LagId, lagName: LagName = null, minimumLinks: Int | Double = null): UpdateLagRequest = {
    val __obj = js.Dynamic.literal(lagId = lagId.asInstanceOf[js.Any])
    if (lagName != null) __obj.updateDynamic("lagName")(lagName.asInstanceOf[js.Any])
    if (minimumLinks != null) __obj.updateDynamic("minimumLinks")(minimumLinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLagRequest]
  }
}

