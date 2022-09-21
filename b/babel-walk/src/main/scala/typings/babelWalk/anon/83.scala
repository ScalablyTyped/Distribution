package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.JSXOpeningElement
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `83`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[JSXOpeningElement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[JSXOpeningElement, TState]] = js.undefined
}
object `83` {
  
  inline def apply[TState](): `83`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`83`[TState]]
  }
  
  extension [Self <: `83`[?], TState](x: Self & `83`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[JSXOpeningElement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[JSXOpeningElement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
