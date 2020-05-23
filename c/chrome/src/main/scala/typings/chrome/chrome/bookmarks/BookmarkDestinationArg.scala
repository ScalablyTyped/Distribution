package typings.chrome.chrome.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BookmarkDestinationArg extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var parentId: js.UndefOr[String] = js.undefined
}

object BookmarkDestinationArg {
  @scala.inline
  def apply(index: js.UndefOr[Double] = js.undefined, parentId: String = null): BookmarkDestinationArg = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BookmarkDestinationArg]
  }
}

