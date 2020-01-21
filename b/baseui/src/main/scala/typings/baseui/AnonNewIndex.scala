package typings.baseui

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNewIndex extends js.Object {
  var newIndex: Double
  var newState: js.Array[ReactNode]
  var oldIndex: Double
}

object AnonNewIndex {
  @scala.inline
  def apply(newIndex: Double, newState: js.Array[ReactNode], oldIndex: Double): AnonNewIndex = {
    val __obj = js.Dynamic.literal(newIndex = newIndex.asInstanceOf[js.Any], newState = newState.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNewIndex]
  }
}

