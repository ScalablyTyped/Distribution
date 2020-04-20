package typings.chrome.chrome.pageCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveDetails extends js.Object {
  /** The id of the tab to save as MHTML. */
  var tabId: Double
}

object SaveDetails {
  @scala.inline
  def apply(tabId: Double): SaveDetails = {
    val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveDetails]
  }
}

