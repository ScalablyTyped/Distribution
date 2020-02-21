package typings.canvasConfetti.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.canvasConfetti.canvasConfettiStrings.square
  - typings.canvasConfetti.canvasConfettiStrings.circle
*/
trait shape extends js.Object

object shape {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def circle: typings.canvasConfetti.canvasConfettiStrings.circle = this.cast("circle")
  @scala.inline
  def square: typings.canvasConfetti.canvasConfettiStrings.square = this.cast("square")
}

