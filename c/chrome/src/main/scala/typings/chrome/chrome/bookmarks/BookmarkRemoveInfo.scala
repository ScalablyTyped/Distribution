package typings.chrome.chrome.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BookmarkRemoveInfo extends js.Object {
  var index: Double
  var node: BookmarkTreeNode
  var parentId: String
}

object BookmarkRemoveInfo {
  @scala.inline
  def apply(index: Double, node: BookmarkTreeNode, parentId: String): BookmarkRemoveInfo = {
    val __obj = js.Dynamic.literal(index = index, node = node, parentId = parentId)
  
    __obj.asInstanceOf[BookmarkRemoveInfo]
  }
}

