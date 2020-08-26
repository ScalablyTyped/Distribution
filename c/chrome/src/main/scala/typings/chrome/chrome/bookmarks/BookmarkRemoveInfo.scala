package typings.chrome.chrome.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BookmarkRemoveInfo extends js.Object {
  var index: Double = js.native
  var node: BookmarkTreeNode = js.native
  var parentId: String = js.native
}

object BookmarkRemoveInfo {
  @scala.inline
  def apply(index: Double, node: BookmarkTreeNode, parentId: String): BookmarkRemoveInfo = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BookmarkRemoveInfo]
  }
  @scala.inline
  implicit class BookmarkRemoveInfoOps[Self <: BookmarkRemoveInfo] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: BookmarkTreeNode): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentId(value: String): Self = this.set("parentId", value.asInstanceOf[js.Any])
  }
  
}

