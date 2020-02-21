package typings.canvasConfetti

import typings.canvasConfetti.mod.shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object canvasConfettiStrings {
  @js.native
  sealed trait circle extends shape
  
  @js.native
  sealed trait square extends shape
  
  @scala.inline
  def circle: circle = "circle".asInstanceOf[circle]
  @scala.inline
  def square: square = "square".asInstanceOf[square]
}

