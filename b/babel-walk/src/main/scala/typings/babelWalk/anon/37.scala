package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.JSXExpressionContainer
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `37`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[JSXExpressionContainer, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[JSXExpressionContainer, TState]] = js.undefined
}
object `37` {
  
  inline def apply[TState](): `37`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`37`[TState]]
  }
  
  extension [Self <: `37`[?], TState](x: Self & `37`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[JSXExpressionContainer], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[JSXExpressionContainer], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
