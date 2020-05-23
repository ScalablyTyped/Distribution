package typings.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItem extends js.Object {
  /** Indicates this item should be drawn with a check. */
  var checked: js.UndefOr[Boolean] = js.undefined
  /** Indicates this item is enabled. */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** String that will be passed to callbacks referencing this MenuItem. */
  var id: String
  /** Optional. Text displayed in the menu for this item. */
  var label: js.UndefOr[String] = js.undefined
  /** Optional. The type of menu item. */
  var style: js.UndefOr[String] = js.undefined
  /** Optional. Indicates this item is visible. */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object MenuItem {
  @scala.inline
  def apply(
    id: String,
    checked: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    style: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): MenuItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItem]
  }
}

