package typings
package baseuiLib.sliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var value: js.Array[scala.Double]
}

object State {
  @scala.inline
  def apply(value: js.Array[scala.Double]): State = {
    val __obj = js.Dynamic.literal(value = value)
  
    __obj.asInstanceOf[State]
  }
}

