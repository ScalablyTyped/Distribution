package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.DoExpression
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `557`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[DoExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[DoExpression, TState]] = js.undefined
}
object `557` {
  
  inline def apply[TState](): `557`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`557`[TState]]
  }
  
  extension [Self <: `557`[?], TState](x: Self & `557`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[DoExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[DoExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
