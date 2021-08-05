package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.FunctionTypeAnnotation
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `46`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[FunctionTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[FunctionTypeAnnotation, TState]] = js.undefined
}
object `46` {
  
  inline def apply[TState](): `46`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`46`[TState]]
  }
  
  extension [Self <: `46`[?], TState](x: Self & `46`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[FunctionTypeAnnotation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[FunctionTypeAnnotation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
