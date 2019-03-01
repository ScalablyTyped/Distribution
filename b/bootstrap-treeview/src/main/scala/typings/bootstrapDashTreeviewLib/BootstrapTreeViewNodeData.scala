package typings
package bootstrapDashTreeviewLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapTreeViewNodeData extends js.Object {
  var backColor: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var href: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var nodeId: js.UndefOr[scala.Double] = js.undefined
  var nodes: js.UndefOr[js.Array[BootstrapTreeViewNodeData]] = js.undefined
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  var selectedIcon: js.UndefOr[java.lang.String] = js.undefined
  var state: js.UndefOr[Anon_Checked] = js.undefined
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object BootstrapTreeViewNodeData {
  @scala.inline
  def apply(
    backColor: java.lang.String = null,
    color: java.lang.String = null,
    href: java.lang.String = null,
    icon: java.lang.String = null,
    nodeId: scala.Int | scala.Double = null,
    nodes: js.Array[BootstrapTreeViewNodeData] = null,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    selectedIcon: java.lang.String = null,
    state: Anon_Checked = null,
    tags: js.Array[java.lang.String] = null,
    text: java.lang.String = null
  ): BootstrapTreeViewNodeData = {
    val __obj = js.Dynamic.literal()
    if (backColor != null) __obj.updateDynamic("backColor")(backColor)
    if (color != null) __obj.updateDynamic("color")(color)
    if (href != null) __obj.updateDynamic("href")(href)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (nodeId != null) __obj.updateDynamic("nodeId")(nodeId.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (selectedIcon != null) __obj.updateDynamic("selectedIcon")(selectedIcon)
    if (state != null) __obj.updateDynamic("state")(state)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[BootstrapTreeViewNodeData]
  }
}

