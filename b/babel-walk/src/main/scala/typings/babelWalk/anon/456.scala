package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.AssignmentExpression
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `456`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[AssignmentExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[AssignmentExpression, TState]] = js.undefined
}
object `456` {
  
  inline def apply[TState](): `456`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`456`[TState]]
  }
  
  extension [Self <: `456`[?], TState](x: Self & `456`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[AssignmentExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[AssignmentExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
