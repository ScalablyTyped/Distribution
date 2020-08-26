package typings.chrome.chrome.webNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebNavigationCallbackDetails extends js.Object {
  /** The ID of the tab in which the navigation is about to occur. */
  var tabId: Double = js.native
  /** The time when the browser was about to start the navigation, in milliseconds since the epoch. */
  var timeStamp: Double = js.native
}

object WebNavigationCallbackDetails {
  @scala.inline
  def apply(tabId: Double, timeStamp: Double): WebNavigationCallbackDetails = {
    val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebNavigationCallbackDetails]
  }
  @scala.inline
  implicit class WebNavigationCallbackDetailsOps[Self <: WebNavigationCallbackDetails] (val x: Self) extends AnyVal {
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
    def setTabId(value: Double): Self = this.set("tabId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeStamp(value: Double): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
  }
  
}

