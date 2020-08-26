package typings.chrome.chrome.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BookmarkMoveInfo extends js.Object {
  var index: Double = js.native
  var oldIndex: Double = js.native
  var oldParentId: String = js.native
  var parentId: String = js.native
}

object BookmarkMoveInfo {
  @scala.inline
  def apply(index: Double, oldIndex: Double, oldParentId: String, parentId: String): BookmarkMoveInfo = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any], oldParentId = oldParentId.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BookmarkMoveInfo]
  }
  @scala.inline
  implicit class BookmarkMoveInfoOps[Self <: BookmarkMoveInfo] (val x: Self) extends AnyVal {
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
    def setOldIndex(value: Double): Self = this.set("oldIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldParentId(value: String): Self = this.set("oldParentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentId(value: String): Self = this.set("parentId", value.asInstanceOf[js.Any])
  }
  
}

