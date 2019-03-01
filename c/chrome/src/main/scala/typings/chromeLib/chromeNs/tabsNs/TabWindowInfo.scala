package typings
package chromeLib.chromeNs.tabsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabWindowInfo extends js.Object {
  /** The ID of the window of where the tab is located. */
  var windowId: scala.Double
}

object TabWindowInfo {
  @scala.inline
  def apply(windowId: scala.Double): TabWindowInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("windowId")(windowId)
    __obj.asInstanceOf[TabWindowInfo]
  }
}

