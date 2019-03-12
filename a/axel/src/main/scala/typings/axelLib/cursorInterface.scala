package typings
package axelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cursorInterface extends js.Object {
  def off(): scala.Unit
  def on(): scala.Unit
  def reset(): scala.Unit
  def restore(): scala.Unit
}

object cursorInterface {
  @scala.inline
  def apply(off: () => scala.Unit, on: () => scala.Unit, reset: () => scala.Unit, restore: () => scala.Unit): cursorInterface = {
    val __obj = js.Dynamic.literal(off = js.Any.fromFunction0(off), on = js.Any.fromFunction0(on), reset = js.Any.fromFunction0(reset), restore = js.Any.fromFunction0(restore))
  
    __obj.asInstanceOf[cursorInterface]
  }
}

