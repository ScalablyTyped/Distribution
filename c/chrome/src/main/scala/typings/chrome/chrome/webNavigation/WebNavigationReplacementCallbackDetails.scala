package typings.chrome.chrome.webNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebNavigationReplacementCallbackDetails extends WebNavigationCallbackDetails {
  
  /** The ID of the tab that was replaced. */
  var replacedTabId: Double = js.native
}
object WebNavigationReplacementCallbackDetails {
  
  @scala.inline
  def apply(replacedTabId: Double, tabId: Double, timeStamp: Double): WebNavigationReplacementCallbackDetails = {
    val __obj = js.Dynamic.literal(replacedTabId = replacedTabId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebNavigationReplacementCallbackDetails]
  }
  
  @scala.inline
  implicit class WebNavigationReplacementCallbackDetailsOps[Self <: WebNavigationReplacementCallbackDetails] (val x: Self) extends AnyVal {
    
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
    def setReplacedTabId(value: Double): Self = this.set("replacedTabId", value.asInstanceOf[js.Any])
  }
}
