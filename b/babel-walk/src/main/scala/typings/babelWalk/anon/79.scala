package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.LogicalExpression
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `79`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[LogicalExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[LogicalExpression, TState]] = js.undefined
}
object `79` {
  
  inline def apply[TState](): `79`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`79`[TState]]
  }
  
  extension [Self <: `79`[?], TState](x: Self & `79`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[LogicalExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[LogicalExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
