package typings.blueprintjsTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsResizable extends js.Object {
  var isResizable: Boolean
  var minSize: Double
}

object IsResizable {
  @scala.inline
  def apply(isResizable: Boolean, minSize: Double): IsResizable = {
    val __obj = js.Dynamic.literal(isResizable = isResizable.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsResizable]
  }
}

