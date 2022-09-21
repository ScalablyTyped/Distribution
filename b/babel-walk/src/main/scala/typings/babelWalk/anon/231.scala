package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.FunctionParent
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `231`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[FunctionParent, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[FunctionParent, TState]] = js.undefined
}
object `231` {
  
  inline def apply[TState](): `231`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`231`[TState]]
  }
  
  extension [Self <: `231`[?], TState](x: Self & `231`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[FunctionParent], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[FunctionParent], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
