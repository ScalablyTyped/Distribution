package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileTree extends js.Object {
  var rootNode: FileTreeNode
  var selectedNode: FileTreeNode
}

object FileTree {
  @scala.inline
  def apply(rootNode: FileTreeNode, selectedNode: FileTreeNode): FileTree = {
    val __obj = js.Dynamic.literal(rootNode = rootNode.asInstanceOf[js.Any], selectedNode = selectedNode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileTree]
  }
}

