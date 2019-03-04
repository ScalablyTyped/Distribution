package typings
package chromeLib.chromeNs.webNavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebNavigationReplacementCallbackDetails extends WebNavigationCallbackDetails {
  /** The ID of the tab that was replaced. */
  var replacedTabId: scala.Double
}

object WebNavigationReplacementCallbackDetails {
  @scala.inline
  def apply(replacedTabId: scala.Double, tabId: scala.Double, timeStamp: scala.Double): WebNavigationReplacementCallbackDetails = {
    val __obj = js.Dynamic.literal(replacedTabId = replacedTabId, tabId = tabId, timeStamp = timeStamp)
  
    __obj.asInstanceOf[WebNavigationReplacementCallbackDetails]
  }
}

