package typings.chrome.chrome.tabs

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
    val __obj = js.Dynamic.literal(fromIndex = fromIndex.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabMoveInfo]
  }
}

