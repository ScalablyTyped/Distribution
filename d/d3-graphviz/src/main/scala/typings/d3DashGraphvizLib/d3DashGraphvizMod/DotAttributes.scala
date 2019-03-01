package typings
package d3DashGraphvizLib.d3DashGraphvizMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotAttributes extends js.Object {
  var URL: js.UndefOr[js.Any] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
}

object DotAttributes {
  @scala.inline
  def apply(URL: js.Any = null, style: js.Any = null, tooltip: js.Any = null): DotAttributes = {
    val __obj = js.Dynamic.literal()
    if (URL != null) __obj.updateDynamic("URL")(URL)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[DotAttributes]
  }
}

