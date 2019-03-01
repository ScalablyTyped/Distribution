package typings
package chromeLib.chromeNs.inputNs.imeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItem extends js.Object {
  /** Indicates this item should be drawn with a check. */
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates this item is enabled. */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** String that will be passed to callbacks referencing this MenuItem. */
  var id: java.lang.String
  /** Optional. Text displayed in the menu for this item. */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. The type of menu item. */
  var style: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. Indicates this item is visible. */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object MenuItem {
  @scala.inline
  def apply(
    id: java.lang.String,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String = null,
    style: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): MenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (label != null) __obj.updateDynamic("label")(label)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[MenuItem]
  }
}

