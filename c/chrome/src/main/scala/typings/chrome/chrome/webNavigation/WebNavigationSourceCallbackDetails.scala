package typings.chrome.chrome.webNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebNavigationSourceCallbackDetails extends WebNavigationUrlCallbackDetails {
  /** The ID of the frame with sourceTabId in which the navigation is triggered. 0 indicates the main frame. */
  var sourceFrameId: Double = js.native
  /**
    * The ID of the process runs the renderer for the source tab.
    * @since Chrome 22.
    */
  var sourceProcessId: Double = js.native
  /** The ID of the tab in which the navigation is triggered. */
  var sourceTabId: Double = js.native
}

object WebNavigationSourceCallbackDetails {
  @scala.inline
  def apply(
    sourceFrameId: Double,
    sourceProcessId: Double,
    sourceTabId: Double,
    tabId: Double,
    timeStamp: Double,
    url: String
  ): WebNavigationSourceCallbackDetails = {
    val __obj = js.Dynamic.literal(sourceFrameId = sourceFrameId.asInstanceOf[js.Any], sourceProcessId = sourceProcessId.asInstanceOf[js.Any], sourceTabId = sourceTabId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebNavigationSourceCallbackDetails]
  }
  @scala.inline
  implicit class WebNavigationSourceCallbackDetailsOps[Self <: WebNavigationSourceCallbackDetails] (val x: Self) extends AnyVal {
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
    def setSourceFrameId(value: Double): Self = this.set("sourceFrameId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceProcessId(value: Double): Self = this.set("sourceProcessId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceTabId(value: Double): Self = this.set("sourceTabId", value.asInstanceOf[js.Any])
  }
  
}

