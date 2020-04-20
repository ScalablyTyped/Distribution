package typings.chrome.chrome.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabActiveInfo extends js.Object {
  /** The ID of the tab that has become active. */
  var tabId: Double
  /** The ID of the window the active tab changed inside of. */
  var windowId: Double
}

object TabActiveInfo {
  @scala.inline
  def apply(tabId: Double, windowId: Double): TabActiveInfo = {
    val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabActiveInfo]
  }
}

