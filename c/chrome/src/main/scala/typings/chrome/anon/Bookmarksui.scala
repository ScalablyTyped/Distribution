package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bookmarksui extends js.Object {
  var bookmarks_ui: js.UndefOr[Removebookmarkshortcut] = js.undefined
}

object Bookmarksui {
  @scala.inline
  def apply(bookmarks_ui: Removebookmarkshortcut = null): Bookmarksui = {
    val __obj = js.Dynamic.literal()
    if (bookmarks_ui != null) __obj.updateDynamic("bookmarks_ui")(bookmarks_ui.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bookmarksui]
  }
}

