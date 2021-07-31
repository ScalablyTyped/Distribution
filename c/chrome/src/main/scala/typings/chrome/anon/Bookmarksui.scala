package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bookmarksui extends StObject {
  
  var bookmarks_ui: js.UndefOr[Removebookmarkshortcut] = js.undefined
}
object Bookmarksui {
  
  @scala.inline
  def apply(): Bookmarksui = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bookmarksui]
  }
  
  @scala.inline
  implicit class BookmarksuiMutableBuilder[Self <: Bookmarksui] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBookmarks_ui(value: Removebookmarkshortcut): Self = StObject.set(x, "bookmarks_ui", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBookmarks_uiUndefined: Self = StObject.set(x, "bookmarks_ui", js.undefined)
  }
}
