package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.JSXMemberExpression
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `227`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[JSXMemberExpression, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[JSXMemberExpression, TState]] = js.undefined
}
object `227` {
  
  inline def apply[TState](): `227`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`227`[TState]]
  }
  
  extension [Self <: `227`[?], TState](x: Self & `227`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[JSXMemberExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[JSXMemberExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
