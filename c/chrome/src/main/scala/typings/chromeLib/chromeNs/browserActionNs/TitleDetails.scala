package typings
package chromeLib.chromeNs.browserActionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TitleDetails extends js.Object {
  /** Optional. Limits the change to when a particular tab is selected. Automatically resets when the tab is closed.  */
  var tabId: js.UndefOr[scala.Double] = js.undefined
  /** The string the browser action should display when moused over. */
  var title: java.lang.String
}

object TitleDetails {
  @scala.inline
  def apply(title: java.lang.String, tabId: scala.Int | scala.Double = null): TitleDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("title")(title)
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleDetails]
  }
}

