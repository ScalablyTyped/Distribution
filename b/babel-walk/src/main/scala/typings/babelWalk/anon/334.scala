package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.JSXExpressionContainer
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `334`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[JSXExpressionContainer, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[JSXExpressionContainer, TState]] = js.undefined
}
object `334` {
  
  inline def apply[TState](): `334`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`334`[TState]]
  }
  
  extension [Self <: `334`[?], TState](x: Self & `334`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[JSXExpressionContainer], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[JSXExpressionContainer], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
