package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.JSXEmptyExpression
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `142`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[JSXEmptyExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[JSXEmptyExpression, TState]] = js.undefined
}
object `142` {
  
  inline def apply[TState](): `142`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`142`[TState]]
  }
  
  extension [Self <: `142`[?], TState](x: Self & `142`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[JSXEmptyExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[JSXEmptyExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
