package typings
package baseuiLib.selectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var value: Value
}

object State {
  @scala.inline
  def apply(value: Value): State = {
    val __obj = js.Dynamic.literal(value = value)
  
    __obj.asInstanceOf[State]
  }
}

