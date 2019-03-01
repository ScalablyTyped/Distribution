package typings
package chromeLib.chromeNs.webNavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAllFrameDetails extends js.Object {
  /** The ID of the tab. */
  var tabId: scala.Double
}

object GetAllFrameDetails {
  @scala.inline
  def apply(tabId: scala.Double): GetAllFrameDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tabId")(tabId)
    __obj.asInstanceOf[GetAllFrameDetails]
  }
}

