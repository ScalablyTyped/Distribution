package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSTypeElement
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `141`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSTypeElement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSTypeElement, TState]] = js.undefined
}
object `141` {
  
  inline def apply[TState](): `141`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`141`[TState]]
  }
  
  extension [Self <: `141`[?], TState](x: Self & `141`[TState]) {
    
    inline def setEnter(value: (/* node */ NodeType[TSTypeElement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSTypeElement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
