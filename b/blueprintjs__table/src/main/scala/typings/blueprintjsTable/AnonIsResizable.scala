package typings.blueprintjsTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsResizable extends js.Object {
  var isResizable: Boolean
  var minSize: Double
}

object AnonIsResizable {
  @scala.inline
  def apply(isResizable: Boolean, minSize: Double): AnonIsResizable = {
    val __obj = js.Dynamic.literal(isResizable = isResizable.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsResizable]
  }
}

