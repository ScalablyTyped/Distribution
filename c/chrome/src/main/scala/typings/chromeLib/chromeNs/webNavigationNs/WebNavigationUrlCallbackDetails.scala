package typings
package chromeLib.chromeNs.webNavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebNavigationUrlCallbackDetails extends WebNavigationCallbackDetails {
  var url: java.lang.String
}

object WebNavigationUrlCallbackDetails {
  @scala.inline
  def apply(tabId: scala.Double, timeStamp: scala.Double, url: java.lang.String): WebNavigationUrlCallbackDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tabId")(tabId)
    __obj.updateDynamic("timeStamp")(timeStamp)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WebNavigationUrlCallbackDetails]
  }
}

