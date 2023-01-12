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
  
  inline def apply(): Bookmarks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bookmarks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bookmarks] (val x: Self) extends AnyVal {
    
    inline def setBookmarks(value: String): Self = StObject.set(x, "bookmarks", value.asInstanceOf[js.Any])
    
    inline def setBookmarksUndefined: Self = StObject.set(x, "bookmarks", js.undefined)
    
    inline def setHistory(value: String): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setNewtab(value: String): Self = StObject.set(x, "newtab", value.asInstanceOf[js.Any])
    
    inline def setNewtabUndefined: Self = StObject.set(x, "newtab", js.undefined)
  }
}
