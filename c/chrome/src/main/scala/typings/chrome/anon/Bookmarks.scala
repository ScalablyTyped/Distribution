package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bookmarks extends js.Object {
  
  var bookmarks: js.UndefOr[String] = js.native
  
  var history: js.UndefOr[String] = js.native
  
  var newtab: js.UndefOr[String] = js.native
}
object Bookmarks {
  
  @scala.inline
  def apply(): Bookmarks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bookmarks]
  }
  
  @scala.inline
  implicit class BookmarksOps[Self <: Bookmarks] (val x: Self) extends AnyVal {
    
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
    def setBookmarks(value: String): Self = this.set("bookmarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBookmarks: Self = this.set("bookmarks", js.undefined)
    
    @scala.inline
    def setHistory(value: String): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    
    @scala.inline
    def setNewtab(value: String): Self = this.set("newtab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewtab: Self = this.set("newtab", js.undefined)
  }
}
