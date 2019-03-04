package typings
package chromeLib.chromeNs.bookmarksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BookmarkMoveInfo extends js.Object {
  var index: scala.Double
  var oldIndex: scala.Double
  var oldParentId: java.lang.String
  var parentId: java.lang.String
}

object BookmarkMoveInfo {
  @scala.inline
  def apply(
    index: scala.Double,
    oldIndex: scala.Double,
    oldParentId: java.lang.String,
    parentId: java.lang.String
  ): BookmarkMoveInfo = {
    val __obj = js.Dynamic.literal(index = index, oldIndex = oldIndex, oldParentId = oldParentId, parentId = parentId)
  
    __obj.asInstanceOf[BookmarkMoveInfo]
  }
}

