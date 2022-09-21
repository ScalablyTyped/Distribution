package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.InferredPredicate
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `156`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[InferredPredicate, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[InferredPredicate, TState]] = js.undefined
}
object `156` {
  
  inline def apply[TState](): `156`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`156`[TState]]
  }
  
  extension [Self <: `156`[?], TState](x: Self & `156`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[InferredPredicate], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[InferredPredicate], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
