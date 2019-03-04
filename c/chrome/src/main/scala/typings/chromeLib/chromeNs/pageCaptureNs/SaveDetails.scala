package typings
package chromeLib.chromeNs.pageCaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveDetails extends js.Object {
  /** The id of the tab to save as MHTML. */
  var tabId: scala.Double
}

object SaveDetails {
  @scala.inline
  def apply(tabId: scala.Double): SaveDetails = {
    val __obj = js.Dynamic.literal(tabId = tabId)
  
    __obj.asInstanceOf[SaveDetails]
  }
}

