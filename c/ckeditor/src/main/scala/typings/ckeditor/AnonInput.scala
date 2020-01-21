package typings.ckeditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInput extends js.Object {
  def input(): Unit
  def reset(): Unit
}

object AnonInput {
  @scala.inline
  def apply(input: () => Unit, reset: () => Unit): AnonInput = {
    val __obj = js.Dynamic.literal(input = js.Any.fromFunction0(input), reset = js.Any.fromFunction0(reset))
  
    __obj.asInstanceOf[AnonInput]
  }
}

