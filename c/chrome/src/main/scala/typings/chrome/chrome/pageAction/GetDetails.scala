package typings.chrome.chrome.pageAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDetails extends js.Object {
  /** Specify the tab to get the title from. */
  var tabId: Double
}

object GetDetails {
  @scala.inline
  def apply(tabId: Double): GetDetails = {
    val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDetails]
  }
}

