package typings.baseui.buttonGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitialState extends js.Object {
  var selected: Double | js.Array[Double]
}

object InitialState {
  @scala.inline
  def apply(selected: Double | js.Array[Double]): InitialState = {
    val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InitialState]
  }
}

