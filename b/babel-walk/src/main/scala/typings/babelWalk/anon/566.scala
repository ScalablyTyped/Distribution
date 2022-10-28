package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.StringLiteralTypeAnnotation
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `566`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[StringLiteralTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[StringLiteralTypeAnnotation, TState]] = js.undefined
}
object `566` {
  
  inline def apply[TState](): `566`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`566`[TState]]
  }
  
  extension [Self <: `566`[?], TState](x: Self & `566`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[StringLiteralTypeAnnotation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[StringLiteralTypeAnnotation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
