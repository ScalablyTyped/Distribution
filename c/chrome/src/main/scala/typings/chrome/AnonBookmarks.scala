package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBookmarks extends js.Object {
  var bookmarks: js.UndefOr[String] = js.undefined
  var history: js.UndefOr[String] = js.undefined
  var newtab: js.UndefOr[String] = js.undefined
}

object AnonBookmarks {
  @scala.inline
  def apply(bookmarks: String = null, history: String = null, newtab: String = null): AnonBookmarks = {
    val __obj = js.Dynamic.literal()
    if (bookmarks != null) __obj.updateDynamic("bookmarks")(bookmarks.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (newtab != null) __obj.updateDynamic("newtab")(newtab.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBookmarks]
  }
}

