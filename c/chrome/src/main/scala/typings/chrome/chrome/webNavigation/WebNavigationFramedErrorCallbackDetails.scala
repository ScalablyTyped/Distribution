package typings.chrome.chrome.webNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebNavigationFramedErrorCallbackDetails extends WebNavigationFramedCallbackDetails {
  /** The error description. */
  var error: String
}

object WebNavigationFramedErrorCallbackDetails {
  @scala.inline
  def apply(error: String, frameId: Double, processId: Double, tabId: Double, timeStamp: Double, url: String): WebNavigationFramedErrorCallbackDetails = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], frameId = frameId.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebNavigationFramedErrorCallbackDetails]
  }
}

