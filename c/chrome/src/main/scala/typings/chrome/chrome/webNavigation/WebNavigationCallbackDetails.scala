package typings.chrome.chrome.webNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebNavigationCallbackDetails extends js.Object {
  /** The ID of the tab in which the navigation is about to occur. */
  var tabId: Double
  /** The time when the browser was about to start the navigation, in milliseconds since the epoch. */
  var timeStamp: Double
}

object WebNavigationCallbackDetails {
  @scala.inline
  def apply(tabId: Double, timeStamp: Double): WebNavigationCallbackDetails = {
    val __obj = js.Dynamic.literal(tabId = tabId, timeStamp = timeStamp)
  
    __obj.asInstanceOf[WebNavigationCallbackDetails]
  }
}

