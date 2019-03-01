package typings
package chromeLib.chromeNs.browserActionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeTextDetails extends js.Object {
  /** Optional. Limits the change to when a particular tab is selected. Automatically resets when the tab is closed.  */
  var tabId: js.UndefOr[scala.Double] = js.undefined
  /** Any number of characters can be passed, but only about four can fit in the space. */
  var text: java.lang.String
}

object BadgeTextDetails {
  @scala.inline
  def apply(text: java.lang.String, tabId: scala.Int | scala.Double = null): BadgeTextDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text")(text)
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeTextDetails]
  }
}

