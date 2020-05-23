package typings.chrome.chrome.browserAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupDetails extends js.Object {
  /** The html file to show in a popup. If set to the empty string (''), no popup is shown. */
  var popup: String
  /** Optional. Limits the change to when a particular tab is selected. Automatically resets when the tab is closed.  */
  var tabId: js.UndefOr[Double] = js.undefined
}

object PopupDetails {
  @scala.inline
  def apply(popup: String, tabId: js.UndefOr[Double] = js.undefined): PopupDetails = {
    val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any])
    if (!js.isUndefined(tabId)) __obj.updateDynamic("tabId")(tabId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupDetails]
  }
}

