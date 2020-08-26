package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bookmarksui extends js.Object {
  var bookmarks_ui: js.UndefOr[Removebookmarkshortcut] = js.native
}

object Bookmarksui {
  @scala.inline
  def apply(): Bookmarksui = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bookmarksui]
  }
  @scala.inline
  implicit class BookmarksuiOps[Self <: Bookmarksui] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBookmarks_ui(value: Removebookmarkshortcut): Self = this.set("bookmarks_ui", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBookmarks_ui: Self = this.set("bookmarks_ui", js.undefined)
  }
  
}

