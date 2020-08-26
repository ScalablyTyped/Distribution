package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileTree extends js.Object {
  var rootNode: FileTreeNode = js.native
  var selectedNode: FileTreeNode = js.native
}

object FileTree {
  @scala.inline
  def apply(rootNode: FileTreeNode, selectedNode: FileTreeNode): FileTree = {
    val __obj = js.Dynamic.literal(rootNode = rootNode.asInstanceOf[js.Any], selectedNode = selectedNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileTree]
  }
  @scala.inline
  implicit class FileTreeOps[Self <: FileTree] (val x: Self) extends AnyVal {
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
    def setRootNode(value: FileTreeNode): Self = this.set("rootNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedNode(value: FileTreeNode): Self = this.set("selectedNode", value.asInstanceOf[js.Any])
  }
  
}

