package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.BindExpression
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `85`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[BindExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[BindExpression, TState]] = js.undefined
}
object `85` {
  
  inline def apply[TState](): `85`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`85`[TState]]
  }
  
  extension [Self <: `85`[?], TState](x: Self & `85`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[BindExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[BindExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
