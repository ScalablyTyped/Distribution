package typings.chrome.chrome.history

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryItem extends js.Object {
  
  /** The unique identifier for the item. */
  var id: String = js.native
  
  /** Optional. When this page was last loaded, represented in milliseconds since the epoch. */
  var lastVisitTime: js.UndefOr[Double] = js.native
  
  /** Optional. The title of the page when it was last loaded. */
  var title: js.UndefOr[String] = js.native
  
  /** Optional. The number of times the user has navigated to this page by typing in the address. */
  var typedCount: js.UndefOr[Double] = js.native
  
  /** Optional. The URL navigated to by a user. */
  var url: js.UndefOr[String] = js.native
  
  /** Optional. The number of times the user has navigated to this page. */
  var visitCount: js.UndefOr[Double] = js.native
}
object HistoryItem {
  
  @scala.inline
  def apply(id: String): HistoryItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryItem]
  }
  
  @scala.inline
  implicit class HistoryItemOps[Self <: HistoryItem] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastVisitTime(value: Double): Self = this.set("lastVisitTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastVisitTime: Self = this.set("lastVisitTime", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTypedCount(value: Double): Self = this.set("typedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypedCount: Self = this.set("typedCount", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setVisitCount(value: Double): Self = this.set("visitCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitCount: Self = this.set("visitCount", js.undefined)
  }
}
