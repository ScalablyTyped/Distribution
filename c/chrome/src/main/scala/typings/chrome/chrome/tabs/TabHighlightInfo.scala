package typings.chrome.chrome.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabHighlightInfo extends js.Object {
  var tabIds: js.Array[Double]
  var windowId: Double
}

object TabHighlightInfo {
  @scala.inline
  def apply(tabIds: js.Array[Double], windowId: Double): TabHighlightInfo = {
    val __obj = js.Dynamic.literal(tabIds = tabIds.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabHighlightInfo]
  }
}

