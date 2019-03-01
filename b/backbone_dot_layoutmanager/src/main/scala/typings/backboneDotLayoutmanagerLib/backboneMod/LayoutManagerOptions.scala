package typings
package backboneDotLayoutmanagerLib.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutManagerOptions extends js.Object {
  var el: js.UndefOr[scala.Boolean] = js.undefined
  var manage: js.UndefOr[scala.Boolean] = js.undefined
}

object LayoutManagerOptions {
  @scala.inline
  def apply(el: js.UndefOr[scala.Boolean] = js.undefined, manage: js.UndefOr[scala.Boolean] = js.undefined): LayoutManagerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(el)) __obj.updateDynamic("el")(el)
    if (!js.isUndefined(manage)) __obj.updateDynamic("manage")(manage)
    __obj.asInstanceOf[LayoutManagerOptions]
  }
}

