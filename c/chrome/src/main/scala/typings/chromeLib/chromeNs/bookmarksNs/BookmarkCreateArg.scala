package typings
package chromeLib.chromeNs.bookmarksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BookmarkCreateArg extends js.Object {
  var index: js.UndefOr[scala.Double] = js.undefined
  /** Optional. Defaults to the Other Bookmarks folder.  */
  var parentId: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object BookmarkCreateArg {
  @scala.inline
  def apply(
    index: scala.Int | scala.Double = null,
    parentId: java.lang.String = null,
    title: java.lang.String = null,
    url: java.lang.String = null
  ): BookmarkCreateArg = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (parentId != null) __obj.updateDynamic("parentId")(parentId)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[BookmarkCreateArg]
  }
}

