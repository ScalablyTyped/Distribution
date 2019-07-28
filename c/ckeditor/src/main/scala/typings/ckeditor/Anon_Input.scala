package typings.ckeditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Input extends js.Object {
  def input(): Unit
  def reset(): Unit
}

object Anon_Input {
  @scala.inline
  def apply(input: () => Unit, reset: () => Unit): Anon_Input = {
    val __obj = js.Dynamic.literal(input = js.Any.fromFunction0(input), reset = js.Any.fromFunction0(reset))
  
    __obj.asInstanceOf[Anon_Input]
  }
}

