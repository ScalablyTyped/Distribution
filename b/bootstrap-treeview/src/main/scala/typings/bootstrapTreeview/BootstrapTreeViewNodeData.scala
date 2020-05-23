package typings.bootstrapTreeview

import typings.bootstrapTreeview.anon.Checked
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
  var state: js.UndefOr[Checked] = js.undefined
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
    nodeId: js.UndefOr[Double] = js.undefined,
    nodes: js.Array[BootstrapTreeViewNodeData] = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selectedIcon: String = null,
    state: Checked = null,
    tags: js.Array[String] = null,
    text: String = null
  ): BootstrapTreeViewNodeData = {
    val __obj = js.Dynamic.literal()
    if (backColor != null) __obj.updateDynamic("backColor")(backColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(nodeId)) __obj.updateDynamic("nodeId")(nodeId.get.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.get.asInstanceOf[js.Any])
    if (selectedIcon != null) __obj.updateDynamic("selectedIcon")(selectedIcon.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapTreeViewNodeData]
  }
}

