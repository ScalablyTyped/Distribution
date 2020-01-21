package typings.baseui.buttonGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var selected: js.Array[Double]
}

object State {
  @scala.inline
  def apply(selected: js.Array[Double]): State = {
    val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[State]
  }
}

