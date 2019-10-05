package typings.chrome.chrome.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BookmarkMoveInfo extends js.Object {
  var index: Double
  var oldIndex: Double
  var oldParentId: String
  var parentId: String
}

object BookmarkMoveInfo {
  @scala.inline
  def apply(index: Double, oldIndex: Double, oldParentId: String, parentId: String): BookmarkMoveInfo = {
    val __obj = js.Dynamic.literal(index = index, oldIndex = oldIndex, oldParentId = oldParentId, parentId = parentId)
  
    __obj.asInstanceOf[BookmarkMoveInfo]
  }
}

