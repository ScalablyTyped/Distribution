package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bookmarksui extends js.Object {
  var bookmarks_ui: js.UndefOr[Anon_Removebookmarkshortcut] = js.undefined
}

object Anon_Bookmarksui {
  @scala.inline
  def apply(bookmarks_ui: Anon_Removebookmarkshortcut = null): Anon_Bookmarksui = {
    val __obj = js.Dynamic.literal()
    if (bookmarks_ui != null) __obj.updateDynamic("bookmarks_ui")(bookmarks_ui)
    __obj.asInstanceOf[Anon_Bookmarksui]
  }
}

