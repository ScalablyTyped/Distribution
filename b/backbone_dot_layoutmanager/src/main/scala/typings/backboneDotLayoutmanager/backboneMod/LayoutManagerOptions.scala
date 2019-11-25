package typings.backboneDotLayoutmanager.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutManagerOptions extends js.Object {
  var el: js.UndefOr[Boolean] = js.undefined
  var manage: js.UndefOr[Boolean] = js.undefined
}

object LayoutManagerOptions {
  @scala.inline
  def apply(el: js.UndefOr[Boolean] = js.undefined, manage: js.UndefOr[Boolean] = js.undefined): LayoutManagerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(el)) __obj.updateDynamic("el")(el.asInstanceOf[js.Any])
    if (!js.isUndefined(manage)) __obj.updateDynamic("manage")(manage.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutManagerOptions]
  }
}

