package typings
package chromeLib.chromeNs.webNavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebNavigationCallbackDetails extends js.Object {
  /** The ID of the tab in which the navigation is about to occur. */
  var tabId: scala.Double
  /** The time when the browser was about to start the navigation, in milliseconds since the epoch. */
  var timeStamp: scala.Double
}

object WebNavigationCallbackDetails {
  @scala.inline
  def apply(tabId: scala.Double, timeStamp: scala.Double): WebNavigationCallbackDetails = {
    val __obj = js.Dynamic.literal(tabId = tabId, timeStamp = timeStamp)
  
    __obj.asInstanceOf[WebNavigationCallbackDetails]
  }
}

