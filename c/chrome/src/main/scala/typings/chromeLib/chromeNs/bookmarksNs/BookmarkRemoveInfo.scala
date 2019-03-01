package typings
package chromeLib.chromeNs.bookmarksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BookmarkRemoveInfo extends js.Object {
  var index: scala.Double
  var node: BookmarkTreeNode
  var parentId: java.lang.String
}

object BookmarkRemoveInfo {
  @scala.inline
  def apply(index: scala.Double, node: BookmarkTreeNode, parentId: java.lang.String): BookmarkRemoveInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("node")(node)
    __obj.updateDynamic("parentId")(parentId)
    __obj.asInstanceOf[BookmarkRemoveInfo]
  }
}

