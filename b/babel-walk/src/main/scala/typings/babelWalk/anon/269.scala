package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.FunctionTypeParam
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `269`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[FunctionTypeParam, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[FunctionTypeParam, TState]] = js.undefined
}
object `269` {
  
  inline def apply[TState](): `269`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`269`[TState]]
  }
  
  extension [Self <: `269`[?], TState](x: Self & `269`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[FunctionTypeParam], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[FunctionTypeParam], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
