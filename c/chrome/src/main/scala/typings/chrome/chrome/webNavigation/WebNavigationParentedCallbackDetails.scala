package typings.chrome.chrome.webNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebNavigationParentedCallbackDetails extends WebNavigationFramedCallbackDetails {
  /**
    * ID of frame that wraps the frame. Set to -1 of no parent frame exists.
    * @since Chrome 24.
    */
  var parentFrameId: Double
}

object WebNavigationParentedCallbackDetails {
  @scala.inline
  def apply(
    frameId: Double,
    parentFrameId: Double,
    processId: Double,
    tabId: Double,
    timeStamp: Double,
    url: String
  ): WebNavigationParentedCallbackDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebNavigationParentedCallbackDetails]
  }
}

