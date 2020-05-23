package typings.ckeditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Input extends js.Object {
  def input(): Unit
  def reset(): Unit
}

object Input {
  @scala.inline
  def apply(input: () => Unit, reset: () => Unit): Input = {
    val __obj = js.Dynamic.literal(input = js.Any.fromFunction0(input), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[Input]
  }
}

