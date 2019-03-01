package typings
package chromeLib.chromeNs.webNavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebNavigationParentedCallbackDetails extends WebNavigationFramedCallbackDetails {
  /**
    * ID of frame that wraps the frame. Set to -1 of no parent frame exists.
    * @since Chrome 24.
    */
  var parentFrameId: scala.Double
}

object WebNavigationParentedCallbackDetails {
  @scala.inline
  def apply(
    frameId: scala.Double,
    parentFrameId: scala.Double,
    processId: scala.Double,
    tabId: scala.Double,
    timeStamp: scala.Double,
    url: java.lang.String
  ): WebNavigationParentedCallbackDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("frameId")(frameId)
    __obj.updateDynamic("parentFrameId")(parentFrameId)
    __obj.updateDynamic("processId")(processId)
    __obj.updateDynamic("tabId")(tabId)
    __obj.updateDynamic("timeStamp")(timeStamp)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WebNavigationParentedCallbackDetails]
  }
}

