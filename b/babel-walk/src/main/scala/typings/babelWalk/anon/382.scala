package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.JSXOpeningElement
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `382`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[JSXOpeningElement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[JSXOpeningElement, TState]] = js.undefined
}
object `382` {
  
  inline def apply[TState](): `382`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`382`[TState]]
  }
  
  extension [Self <: `382`[?], TState](x: Self & `382`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[JSXOpeningElement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[JSXOpeningElement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
