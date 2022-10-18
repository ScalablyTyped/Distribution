package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ParenthesizedExpression
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `540`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ParenthesizedExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ParenthesizedExpression, TState]] = js.undefined
}
object `540` {
  
  inline def apply[TState](): `540`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`540`[TState]]
  }
  
  extension [Self <: `540`[?], TState](x: Self & `540`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ParenthesizedExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ParenthesizedExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
