package typings.deoxxaDashContentDashType.ContentType

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectOptions extends js.Object {
  var sortAccepted: js.UndefOr[Boolean] = js.undefined
  var sortAvailable: js.UndefOr[Boolean] = js.undefined
}

object SelectOptions {
  @scala.inline
  def apply(
    sortAccepted: js.UndefOr[Boolean] = js.undefined,
    sortAvailable: js.UndefOr[Boolean] = js.undefined
  ): SelectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sortAccepted)) __obj.updateDynamic("sortAccepted")(sortAccepted.asInstanceOf[js.Any])
    if (!js.isUndefined(sortAvailable)) __obj.updateDynamic("sortAvailable")(sortAvailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectOptions]
  }
}

