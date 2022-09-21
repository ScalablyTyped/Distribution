package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSInstantiationExpression
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `257`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSInstantiationExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSInstantiationExpression, TState]] = js.undefined
}
object `257` {
  
  inline def apply[TState](): `257`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`257`[TState]]
  }
  
  extension [Self <: `257`[?], TState](x: Self & `257`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSInstantiationExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSInstantiationExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
