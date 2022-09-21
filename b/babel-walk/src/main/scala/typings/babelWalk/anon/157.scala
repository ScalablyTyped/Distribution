package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.AssignmentExpression
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `157`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[AssignmentExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[AssignmentExpression, TState]] = js.undefined
}
object `157` {
  
  inline def apply[TState](): `157`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`157`[TState]]
  }
  
  extension [Self <: `157`[?], TState](x: Self & `157`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[AssignmentExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[AssignmentExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
