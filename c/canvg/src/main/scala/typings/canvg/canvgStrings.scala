package typings.canvg

import typings.canvg.glyphElementMod.ArabicForm
import typings.canvg.viewPortMod.Axis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canvgStrings {
  
  @js.native
  sealed trait initial
    extends StObject
       with ArabicForm
  inline def initial: initial = "initial".asInstanceOf[initial]
  
  @js.native
  sealed trait isolated
    extends StObject
       with ArabicForm
  inline def isolated: isolated = "isolated".asInstanceOf[isolated]
  
  @js.native
  sealed trait medial
    extends StObject
       with ArabicForm
  inline def medial: medial = "medial".asInstanceOf[medial]
  
  @js.native
  sealed trait terminal
    extends StObject
       with ArabicForm
  inline def terminal: terminal = "terminal".asInstanceOf[terminal]
  
  @js.native
  sealed trait x
    extends StObject
       with Axis
  inline def x: x = "x".asInstanceOf[x]
  
  @js.native
  sealed trait y
    extends StObject
       with Axis
  inline def y: y = "y".asInstanceOf[y]
}
