package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.FunctionTypeAnnotation
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `345`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[FunctionTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[FunctionTypeAnnotation, TState]] = js.undefined
}
object `345` {
  
  inline def apply[TState](): `345`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`345`[TState]]
  }
  
  extension [Self <: `345`[?], TState](x: Self & `345`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[FunctionTypeAnnotation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[FunctionTypeAnnotation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
