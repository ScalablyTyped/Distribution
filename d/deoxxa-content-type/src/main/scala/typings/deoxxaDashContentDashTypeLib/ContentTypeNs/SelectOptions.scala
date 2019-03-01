package typings
package deoxxaDashContentDashTypeLib.ContentTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectOptions extends js.Object {
  var sortAccepted: js.UndefOr[scala.Boolean] = js.undefined
  var sortAvailable: js.UndefOr[scala.Boolean] = js.undefined
}

object SelectOptions {
  @scala.inline
  def apply(
    sortAccepted: js.UndefOr[scala.Boolean] = js.undefined,
    sortAvailable: js.UndefOr[scala.Boolean] = js.undefined
  ): SelectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sortAccepted)) __obj.updateDynamic("sortAccepted")(sortAccepted)
    if (!js.isUndefined(sortAvailable)) __obj.updateDynamic("sortAvailable")(sortAvailable)
    __obj.asInstanceOf[SelectOptions]
  }
}

