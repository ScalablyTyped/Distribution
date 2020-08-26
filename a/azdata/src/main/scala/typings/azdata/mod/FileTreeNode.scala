package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileTreeNode extends js.Object {
  var children: js.Array[FileTreeNode] = js.native
  var fullPath: String = js.native
  var isExpanded: Boolean = js.native
  var isFile: Boolean = js.native
  var name: String = js.native
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
  @scala.inline
  implicit class FileTreeNodeOps[Self <: FileTreeNode] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: FileTreeNode*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[FileTreeNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullPath(value: String): Self = this.set("fullPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsExpanded(value: Boolean): Self = this.set("isExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFile(value: Boolean): Self = this.set("isFile", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

