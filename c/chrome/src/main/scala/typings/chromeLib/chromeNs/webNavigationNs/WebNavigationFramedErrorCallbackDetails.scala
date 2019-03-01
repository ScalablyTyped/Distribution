package typings
package chromeLib.chromeNs.webNavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebNavigationFramedErrorCallbackDetails extends WebNavigationFramedCallbackDetails {
  /** The error description. */
  var error: java.lang.String
}

object WebNavigationFramedErrorCallbackDetails {
  @scala.inline
  def apply(
    error: java.lang.String,
    frameId: scala.Double,
    processId: scala.Double,
    tabId: scala.Double,
    timeStamp: scala.Double,
    url: java.lang.String
  ): WebNavigationFramedErrorCallbackDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("frameId")(frameId)
    __obj.updateDynamic("processId")(processId)
    __obj.updateDynamic("tabId")(tabId)
    __obj.updateDynamic("timeStamp")(timeStamp)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WebNavigationFramedErrorCallbackDetails]
  }
}

