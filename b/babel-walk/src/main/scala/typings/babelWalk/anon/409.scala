package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.UpdateExpression
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `409`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[UpdateExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[UpdateExpression, TState]] = js.undefined
}
object `409` {
  
  inline def apply[TState](): `409`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`409`[TState]]
  }
  
  extension [Self <: `409`[?], TState](x: Self & `409`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[UpdateExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[UpdateExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
