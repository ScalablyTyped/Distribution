package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gamepad extends js.Object {
  val displayId: scala.Double
}

object Gamepad {
  @scala.inline
  def apply(displayId: scala.Double): Gamepad = {
    val __obj = js.Dynamic.literal(displayId = displayId)
  
    __obj.asInstanceOf[Gamepad]
  }
}

