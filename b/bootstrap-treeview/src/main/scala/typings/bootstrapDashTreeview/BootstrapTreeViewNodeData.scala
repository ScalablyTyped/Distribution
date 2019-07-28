package typings.bootstrapDashTreeview

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapTreeViewNodeData extends js.Object {
  var backColor: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var nodeId: js.UndefOr[Double] = js.undefined
  var nodes: js.UndefOr[js.Array[BootstrapTreeViewNodeData]] = js.undefined
  var selectable: js.UndefOr[Boolean] = js.undefined
  var selectedIcon: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[Anon_Checked] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object BootstrapTreeViewNodeData {
  @scala.inline
  def apply(
    backColor: String = null,
    color: String = null,
    href: String = null,
    icon: String = null,
    nodeId: Int | Double = null,
    nodes: js.Array[BootstrapTreeViewNodeData] = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selectedIcon: String = null,
    state: Anon_Checked = null,
    tags: js.Array[String] = null,
    text: String = null
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

