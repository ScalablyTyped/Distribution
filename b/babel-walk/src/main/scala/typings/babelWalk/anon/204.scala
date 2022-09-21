package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.JSXElement
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `204`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[JSXElement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[JSXElement, TState]] = js.undefined
}
object `204` {
  
  inline def apply[TState](): `204`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`204`[TState]]
  }
  
  extension [Self <: `204`[?], TState](x: Self & `204`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[JSXElement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[JSXElement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
