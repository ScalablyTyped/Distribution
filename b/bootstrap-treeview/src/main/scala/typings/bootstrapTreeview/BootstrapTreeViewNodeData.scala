package typings.bootstrapTreeview

import typings.bootstrapTreeview.anon.Checked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapTreeViewNodeData extends js.Object {
  var backColor: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var href: js.UndefOr[String] = js.native
  var icon: js.UndefOr[String] = js.native
  var nodeId: js.UndefOr[Double] = js.native
  var nodes: js.UndefOr[js.Array[BootstrapTreeViewNodeData]] = js.native
  var selectable: js.UndefOr[Boolean] = js.native
  var selectedIcon: js.UndefOr[String] = js.native
  var state: js.UndefOr[Checked] = js.native
  var tags: js.UndefOr[js.Array[String]] = js.native
  var text: js.UndefOr[String] = js.native
}

object BootstrapTreeViewNodeData {
  @scala.inline
  def apply(): BootstrapTreeViewNodeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BootstrapTreeViewNodeData]
  }
  @scala.inline
  implicit class BootstrapTreeViewNodeDataOps[Self <: BootstrapTreeViewNodeData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackColor(value: String): Self = this.set("backColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackColor: Self = this.set("backColor", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setNodeId(value: Double): Self = this.set("nodeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeId: Self = this.set("nodeId", js.undefined)
    @scala.inline
    def setNodesVarargs(value: BootstrapTreeViewNodeData*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[BootstrapTreeViewNodeData]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodes: Self = this.set("nodes", js.undefined)
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    @scala.inline
    def setSelectedIcon(value: String): Self = this.set("selectedIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedIcon: Self = this.set("selectedIcon", js.undefined)
    @scala.inline
    def setState(value: Checked): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

