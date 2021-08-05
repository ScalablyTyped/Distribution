package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.UpdateExpression
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `108`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[UpdateExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[UpdateExpression, TState]] = js.undefined
}
object `108` {
  
  inline def apply[TState](): `108`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`108`[TState]]
  }
  
  extension [Self <: `108`[?], TState](x: Self & `108`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[UpdateExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[UpdateExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
