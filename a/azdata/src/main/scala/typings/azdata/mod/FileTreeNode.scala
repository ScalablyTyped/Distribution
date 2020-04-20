package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileTreeNode extends js.Object {
  var children: js.Array[FileTreeNode]
  var fullPath: String
  var isExpanded: Boolean
  var isFile: Boolean
  var name: String
}

object FileTreeNode {
  @scala.inline
  def apply(
    children: js.Array[FileTreeNode],
    fullPath: String,
    isExpanded: Boolean,
    isFile: Boolean,
    name: String
  ): FileTreeNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], fullPath = fullPath.asInstanceOf[js.Any], isExpanded = isExpanded.asInstanceOf[js.Any], isFile = isFile.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileTreeNode]
  }
}

