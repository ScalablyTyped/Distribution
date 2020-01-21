package typings.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonToggled extends js.Object {
  var toggled: js.UndefOr[Boolean] = js.undefined
  var tooltip: js.UndefOr[String] = js.undefined
}

object AnonToggled {
  @scala.inline
  def apply(toggled: js.UndefOr[Boolean] = js.undefined, tooltip: String = null): AnonToggled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(toggled)) __obj.updateDynamic("toggled")(toggled.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonToggled]
  }
}

