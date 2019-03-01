package typings
package chromeLib.chromeNs.bookmarksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BookmarkDestinationArg extends js.Object {
  var index: js.UndefOr[scala.Double] = js.undefined
  var parentId: js.UndefOr[java.lang.String] = js.undefined
}

object BookmarkDestinationArg {
  @scala.inline
  def apply(index: scala.Int | scala.Double = null, parentId: java.lang.String = null): BookmarkDestinationArg = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (parentId != null) __obj.updateDynamic("parentId")(parentId)
    __obj.asInstanceOf[BookmarkDestinationArg]
  }
}

