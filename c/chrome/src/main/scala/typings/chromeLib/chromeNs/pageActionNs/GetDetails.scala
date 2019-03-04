package typings
package chromeLib.chromeNs.pageActionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDetails extends js.Object {
  /** Specify the tab to get the title from. */
  var tabId: scala.Double
}

object GetDetails {
  @scala.inline
  def apply(tabId: scala.Double): GetDetails = {
    val __obj = js.Dynamic.literal(tabId = tabId)
  
    __obj.asInstanceOf[GetDetails]
  }
}

