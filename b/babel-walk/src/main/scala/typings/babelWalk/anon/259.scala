package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.FunctionTypeParam
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `259`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[FunctionTypeParam, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[FunctionTypeParam, TState]] = js.undefined
}
object `259` {
  
  inline def apply[TState](): `259`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`259`[TState]]
  }
  
  extension [Self <: `259`[?], TState](x: Self & `259`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[FunctionTypeParam], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[FunctionTypeParam], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
