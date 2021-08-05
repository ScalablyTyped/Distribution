package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.YieldExpression
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `11`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[YieldExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[YieldExpression, TState]] = js.undefined
}
object `11` {
  
  inline def apply[TState](): `11`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`11`[TState]]
  }
  
  extension [Self <: `11`[?], TState](x: Self & `11`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[YieldExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[YieldExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
