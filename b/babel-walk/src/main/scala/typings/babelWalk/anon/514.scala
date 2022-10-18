package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.BooleanTypeAnnotation
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `514`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[BooleanTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[BooleanTypeAnnotation, TState]] = js.undefined
}
object `514` {
  
  inline def apply[TState](): `514`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`514`[TState]]
  }
  
  extension [Self <: `514`[?], TState](x: Self & `514`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[BooleanTypeAnnotation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[BooleanTypeAnnotation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
