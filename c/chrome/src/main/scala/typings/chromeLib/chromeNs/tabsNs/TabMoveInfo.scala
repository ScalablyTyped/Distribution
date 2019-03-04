package typings
package chromeLib.chromeNs.tabsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabMoveInfo extends js.Object {
  var fromIndex: scala.Double
  var toIndex: scala.Double
  var windowId: scala.Double
}

object TabMoveInfo {
  @scala.inline
  def apply(fromIndex: scala.Double, toIndex: scala.Double, windowId: scala.Double): TabMoveInfo = {
    val __obj = js.Dynamic.literal(fromIndex = fromIndex, toIndex = toIndex, windowId = windowId)
  
    __obj.asInstanceOf[TabMoveInfo]
  }
}

