package typings
package chromeLib.chromeNs.browserActionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabDetails extends js.Object {
  /** Optional. Specify the tab to get the information. If no tab is specified, the non-tab-specific information is returned.  */
  var tabId: js.UndefOr[scala.Double] = js.undefined
}

object TabDetails {
  @scala.inline
  def apply(tabId: scala.Int | scala.Double = null): TabDetails = {
    val __obj = js.Dynamic.literal()
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabDetails]
  }
}

