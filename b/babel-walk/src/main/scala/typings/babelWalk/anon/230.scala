package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.FunctionExpression
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `230`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[FunctionExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[FunctionExpression, TState]] = js.undefined
}
object `230` {
  
  inline def apply[TState](): `230`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`230`[TState]]
  }
  
  extension [Self <: `230`[?], TState](x: Self & `230`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[FunctionExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[FunctionExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
