package typings
package chromeLib.chromeNs.bookmarksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BookmarkChangeInfo extends js.Object {
  var title: java.lang.String
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object BookmarkChangeInfo {
  @scala.inline
  def apply(title: java.lang.String, url: java.lang.String = null): BookmarkChangeInfo = {
    val __obj = js.Dynamic.literal(title = title)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[BookmarkChangeInfo]
  }
}

