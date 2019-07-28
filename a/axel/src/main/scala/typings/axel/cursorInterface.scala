package typings.axel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cursorInterface extends js.Object {
  def off(): Unit
  def on(): Unit
  def reset(): Unit
  def restore(): Unit
}

object cursorInterface {
  @scala.inline
  def apply(off: () => Unit, on: () => Unit, reset: () => Unit, restore: () => Unit): cursorInterface = {
    val __obj = js.Dynamic.literal(off = js.Any.fromFunction0(off), on = js.Any.fromFunction0(on), reset = js.Any.fromFunction0(reset), restore = js.Any.fromFunction0(restore))
  
    __obj.asInstanceOf[cursorInterface]
  }
}

