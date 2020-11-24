package typings.chrome.chrome.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightInfo extends js.Object {
  
  /** One or more tab indices to highlight. */
  var tabs: Double | js.Array[Double] = js.native
  
  /** Optional. The window that contains the tabs. */
  var windowId: js.UndefOr[Double] = js.native
}
object HighlightInfo {
  
  @scala.inline
  def apply(tabs: Double | js.Array[Double]): HighlightInfo = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightInfo]
  }
  
  @scala.inline
  implicit class HighlightInfoOps[Self <: HighlightInfo] (val x: Self) extends AnyVal {
    
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
    def setTabsVarargs(value: Double*): Self = this.set("tabs", js.Array(value :_*))
    
    @scala.inline
    def setTabs(value: Double | js.Array[Double]): Self = this.set("tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowId(value: Double): Self = this.set("windowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowId: Self = this.set("windowId", js.undefined)
  }
}
