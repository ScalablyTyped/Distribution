package typings.chrome.chrome.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabAttachInfo extends js.Object {
  var newPosition: Double
  var newWindowId: Double
}

object TabAttachInfo {
  @scala.inline
  def apply(newPosition: Double, newWindowId: Double): TabAttachInfo = {
    val __obj = js.Dynamic.literal(newPosition = newPosition.asInstanceOf[js.Any], newWindowId = newWindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabAttachInfo]
  }
}

