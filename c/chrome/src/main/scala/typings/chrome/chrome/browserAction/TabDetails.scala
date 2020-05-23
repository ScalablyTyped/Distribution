package typings.chrome.chrome.browserAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabDetails extends js.Object {
  /** Optional. Specify the tab to get the information. If no tab is specified, the non-tab-specific information is returned.  */
  var tabId: js.UndefOr[Double] = js.undefined
}

object TabDetails {
  @scala.inline
  def apply(tabId: js.UndefOr[Double] = js.undefined): TabDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(tabId)) __obj.updateDynamic("tabId")(tabId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabDetails]
  }
}

