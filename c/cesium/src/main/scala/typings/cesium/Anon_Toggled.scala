package typings.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Toggled extends js.Object {
  var toggled: js.UndefOr[Boolean] = js.undefined
  var tooltip: js.UndefOr[String] = js.undefined
}

object Anon_Toggled {
  @scala.inline
  def apply(toggled: js.UndefOr[Boolean] = js.undefined, tooltip: String = null): Anon_Toggled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(toggled)) __obj.updateDynamic("toggled")(toggled.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Toggled]
  }
}

