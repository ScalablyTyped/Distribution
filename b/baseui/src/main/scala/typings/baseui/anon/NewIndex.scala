package typings.baseui.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewIndex extends js.Object {
  var newIndex: Double
  var newState: js.Array[ReactNode]
  var oldIndex: Double
}

object NewIndex {
  @scala.inline
  def apply(newIndex: Double, newState: js.Array[ReactNode], oldIndex: Double): NewIndex = {
    val __obj = js.Dynamic.literal(newIndex = newIndex.asInstanceOf[js.Any], newState = newState.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewIndex]
  }
}

