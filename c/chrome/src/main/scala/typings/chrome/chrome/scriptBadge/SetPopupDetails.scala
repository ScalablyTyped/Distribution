package typings.chrome.chrome.scriptBadge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetPopupDetails extends js.Object {
  var popup: String
  var tabId: Double
}

object SetPopupDetails {
  @scala.inline
  def apply(popup: String, tabId: Double): SetPopupDetails = {
    val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPopupDetails]
  }
}

