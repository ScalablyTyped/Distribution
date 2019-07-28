package typings.chrome.chromeNs.bookmarksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BookmarkChangesArg extends js.Object {
  var title: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object BookmarkChangesArg {
  @scala.inline
  def apply(title: String = null, url: String = null): BookmarkChangesArg = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[BookmarkChangesArg]
  }
}

