package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ExpressionWrapper
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `518`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ExpressionWrapper, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ExpressionWrapper, TState]] = js.undefined
}
object `518` {
  
  inline def apply[TState](): `518`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`518`[TState]]
  }
  
  extension [Self <: `518`[?], TState](x: Self & `518`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ExpressionWrapper], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ExpressionWrapper], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
