package typings.canvasConfetti

import typings.canvasConfetti.mod.shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canvasConfettiStrings {
  
  @scala.inline
  def circle: circle = "circle".asInstanceOf[circle]
  
  @scala.inline
  def square: square = "square".asInstanceOf[square]
  
  @js.native
  sealed trait circle extends shape
  
  @js.native
  sealed trait square extends shape
}
