package typings.canvasConfetti

import typings.canvasConfetti.mod.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canvasConfettiStrings {
  
  @js.native
  sealed trait circle
    extends StObject
       with Shape
  inline def circle: circle = "circle".asInstanceOf[circle]
  
  @js.native
  sealed trait square
    extends StObject
       with Shape
  inline def square: square = "square".asInstanceOf[square]
  
  @js.native
  sealed trait star
    extends StObject
       with Shape
  inline def star: star = "star".asInstanceOf[star]
}
