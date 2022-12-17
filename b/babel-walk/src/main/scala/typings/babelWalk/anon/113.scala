package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.UpdateExpression
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `113`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[UpdateExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[UpdateExpression, TState]] = js.undefined
}
object `113` {
  
  inline def apply[TState](): `113`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`113`[TState]]
  }
  
  extension [Self <: `113`[?], TState](x: Self & `113`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[UpdateExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[UpdateExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
