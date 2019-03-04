package typings
package chromeLib.chromeNs.pageActionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupDetails extends js.Object {
  /** The html file to show in a popup. If set to the empty string (''), no popup is shown. */
  var popup: java.lang.String
  /** The id of the tab for which you want to modify the page action. */
  var tabId: scala.Double
}

object PopupDetails {
  @scala.inline
  def apply(popup: java.lang.String, tabId: scala.Double): PopupDetails = {
    val __obj = js.Dynamic.literal(popup = popup, tabId = tabId)
  
    __obj.asInstanceOf[PopupDetails]
  }
}

