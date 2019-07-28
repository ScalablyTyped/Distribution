package typings.chrome.chromeNs.tabsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabMoveInfo extends js.Object {
  var fromIndex: Double
  var toIndex: Double
  var windowId: Double
}

object TabMoveInfo {
  @scala.inline
  def apply(fromIndex: Double, toIndex: Double, windowId: Double): TabMoveInfo = {
    val __obj = js.Dynamic.literal(fromIndex = fromIndex, toIndex = toIndex, windowId = windowId)
  
    __obj.asInstanceOf[TabMoveInfo]
  }
}

