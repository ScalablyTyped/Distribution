package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Toggled extends js.Object {
  var toggled: js.UndefOr[Boolean] = js.undefined
  var tooltip: js.UndefOr[String] = js.undefined
}

object Toggled {
  @scala.inline
  def apply(toggled: js.UndefOr[Boolean] = js.undefined, tooltip: String = null): Toggled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(toggled)) __obj.updateDynamic("toggled")(toggled.get.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Toggled]
  }
}

