package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bookmarks extends js.Object {
  var bookmarks: js.UndefOr[String] = js.undefined
  var history: js.UndefOr[String] = js.undefined
  var newtab: js.UndefOr[String] = js.undefined
}

object Bookmarks {
  @scala.inline
  def apply(bookmarks: String = null, history: String = null, newtab: String = null): Bookmarks = {
    val __obj = js.Dynamic.literal()
    if (bookmarks != null) __obj.updateDynamic("bookmarks")(bookmarks.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (newtab != null) __obj.updateDynamic("newtab")(newtab.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bookmarks]
  }
}

