package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ArrayExpression
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `362`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ArrayExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ArrayExpression, TState]] = js.undefined
}
object `362` {
  
  inline def apply[TState](): `362`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`362`[TState]]
  }
  
  extension [Self <: `362`[?], TState](x: Self & `362`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[ArrayExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[ArrayExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
