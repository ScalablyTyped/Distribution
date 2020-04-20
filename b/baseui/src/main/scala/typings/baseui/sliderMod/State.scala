package typings.baseui.sliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var value: js.Array[Double]
}

object State {
  @scala.inline
  def apply(value: js.Array[Double]): State = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

