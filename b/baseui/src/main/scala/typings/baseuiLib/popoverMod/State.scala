package typings
package baseuiLib.popoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var isOpen: scala.Boolean
}

object State {
  @scala.inline
  def apply(isOpen: scala.Boolean): State = {
    val __obj = js.Dynamic.literal(isOpen = isOpen)
  
    __obj.asInstanceOf[State]
  }
}

