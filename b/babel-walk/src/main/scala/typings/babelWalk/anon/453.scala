package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.InferredPredicate
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `453`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[InferredPredicate, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[InferredPredicate, TState]] = js.undefined
}
object `453` {
  
  inline def apply[TState](): `453`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`453`[TState]]
  }
  
  extension [Self <: `453`[?], TState](x: Self & `453`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[InferredPredicate], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[InferredPredicate], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
