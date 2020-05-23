package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OldIndex extends js.Object {
  var newIndex: Double
  var oldIndex: Double
}

object OldIndex {
  @scala.inline
  def apply(newIndex: Double, oldIndex: Double): OldIndex = {
    val __obj = js.Dynamic.literal(newIndex = newIndex.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldIndex]
  }
}

