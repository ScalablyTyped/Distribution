package typings
package chromeLib.chromeNs.tabsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabActiveInfo extends js.Object {
  /** The ID of the tab that has become active. */
  var tabId: scala.Double
  /** The ID of the window the active tab changed inside of. */
  var windowId: scala.Double
}

object TabActiveInfo {
  @scala.inline
  def apply(tabId: scala.Double, windowId: scala.Double): TabActiveInfo = {
    val __obj = js.Dynamic.literal(tabId = tabId, windowId = windowId)
  
    __obj.asInstanceOf[TabActiveInfo]
  }
}

