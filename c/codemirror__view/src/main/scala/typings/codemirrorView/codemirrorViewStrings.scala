package typings.codemirrorView

import typings.codemirrorView.mod.ScrollStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codemirrorViewStrings {
  
  @js.native
  sealed trait Alt extends StObject
  inline def Alt: Alt = "Alt".asInstanceOf[Alt]
  
  @js.native
  sealed trait Control extends StObject
  inline def Control: Control = "Control".asInstanceOf[Control]
  
  @js.native
  sealed trait Meta extends StObject
  inline def Meta: Meta = "Meta".asInstanceOf[Meta]
  
  @js.native
  sealed trait Shift extends StObject
  inline def Shift: Shift = "Shift".asInstanceOf[Shift]
  
  @js.native
  sealed trait absolute extends StObject
  inline def absolute: absolute = "absolute".asInstanceOf[absolute]
  
  @js.native
  sealed trait center
    extends StObject
       with ScrollStrategy
  inline def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait end
    extends StObject
       with ScrollStrategy
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait fixed extends StObject
  inline def fixed: fixed = "fixed".asInstanceOf[fixed]
  
  @js.native
  sealed trait nearest
    extends StObject
       with ScrollStrategy
  inline def nearest: nearest = "nearest".asInstanceOf[nearest]
  
  @js.native
  sealed trait start
    extends StObject
       with ScrollStrategy
  inline def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait touch extends StObject
  inline def touch: touch = "touch".asInstanceOf[touch]
}
