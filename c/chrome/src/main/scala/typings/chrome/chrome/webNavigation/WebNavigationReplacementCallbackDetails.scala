package typings.chrome.chrome.webNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebNavigationReplacementCallbackDetails extends WebNavigationCallbackDetails {
  /** The ID of the tab that was replaced. */
  var replacedTabId: Double
}

object WebNavigationReplacementCallbackDetails {
  @scala.inline
  def apply(replacedTabId: Double, tabId: Double, timeStamp: Double): WebNavigationReplacementCallbackDetails = {
    val __obj = js.Dynamic.literal(replacedTabId = replacedTabId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebNavigationReplacementCallbackDetails]
  }
}

