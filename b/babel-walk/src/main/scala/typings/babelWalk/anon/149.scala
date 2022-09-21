package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.JSXClosingElement
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `149`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[JSXClosingElement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[JSXClosingElement, TState]] = js.undefined
}
object `149` {
  
  inline def apply[TState](): `149`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`149`[TState]]
  }
  
  extension [Self <: `149`[?], TState](x: Self & `149`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[JSXClosingElement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[JSXClosingElement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
