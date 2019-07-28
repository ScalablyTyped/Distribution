package typings.chrome.chromeNs.webNavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebNavigationUrlCallbackDetails extends WebNavigationCallbackDetails {
  var url: String
}

object WebNavigationUrlCallbackDetails {
  @scala.inline
  def apply(tabId: Double, timeStamp: Double, url: String): WebNavigationUrlCallbackDetails = {
    val __obj = js.Dynamic.literal(tabId = tabId, timeStamp = timeStamp, url = url)
  
    __obj.asInstanceOf[WebNavigationUrlCallbackDetails]
  }
}

