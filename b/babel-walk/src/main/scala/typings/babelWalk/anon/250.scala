package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.DoExpression
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `250`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[DoExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[DoExpression, TState]] = js.undefined
}
object `250` {
  
  inline def apply[TState](): `250`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`250`[TState]]
  }
  
  extension [Self <: `250`[?], TState](x: Self & `250`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[DoExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[DoExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
