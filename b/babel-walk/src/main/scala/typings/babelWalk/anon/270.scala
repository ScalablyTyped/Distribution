package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.FunctionTypeParam
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `270`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[FunctionTypeParam, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[FunctionTypeParam, TState]] = js.undefined
}
object `270` {
  
  inline def apply[TState](): `270`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`270`[TState]]
  }
  
  extension [Self <: `270`[?], TState](x: Self & `270`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[FunctionTypeParam], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[FunctionTypeParam], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
