package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bookmarks extends StObject {
  
  var bookmarks: js.UndefOr[String] = js.undefined
  
  var history: js.UndefOr[String] = js.undefined
  
  var newtab: js.UndefOr[String] = js.undefined
}
object Bookmarks {
  
  @scala.inline
  def apply(): Bookmarks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bookmarks]
  }
  
  @scala.inline
  implicit class BookmarksMutableBuilder[Self <: Bookmarks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBookmarks(value: String): Self = StObject.set(x, "bookmarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBookmarksUndefined: Self = StObject.set(x, "bookmarks", js.undefined)
    
    @scala.inline
    def setHistory(value: String): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    @scala.inline
    def setNewtab(value: String): Self = StObject.set(x, "newtab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewtabUndefined: Self = StObject.set(x, "newtab", js.undefined)
  }
}
