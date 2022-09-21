package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.FlowPredicate
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `138`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[FlowPredicate, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[FlowPredicate, TState]] = js.undefined
}
object `138` {
  
  inline def apply[TState](): `138`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`138`[TState]]
  }
  
  extension [Self <: `138`[?], TState](x: Self & `138`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[FlowPredicate], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[FlowPredicate], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
