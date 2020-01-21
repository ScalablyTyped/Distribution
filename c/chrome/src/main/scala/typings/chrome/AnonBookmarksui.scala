package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBookmarksui extends js.Object {
  var bookmarks_ui: js.UndefOr[AnonRemovebookmarkshortcut] = js.undefined
}

object AnonBookmarksui {
  @scala.inline
  def apply(bookmarks_ui: AnonRemovebookmarkshortcut = null): AnonBookmarksui = {
    val __obj = js.Dynamic.literal()
    if (bookmarks_ui != null) __obj.updateDynamic("bookmarks_ui")(bookmarks_ui.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBookmarksui]
  }
}

