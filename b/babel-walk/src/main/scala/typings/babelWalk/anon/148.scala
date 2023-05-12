package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSTypeElement
import typings.babelWalk.libMod.NodeType
import typings.babelWalk.libMod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `148`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSTypeElement, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[TSTypeElement, TState]] = js.undefined
}
object `148` {
  
  inline def apply[TState](): `148`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`148`[TState]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `148`[?], TState] (val x: Self & `148`[TState]) extends AnyVal {
    
    inline def setEnter(value: (/* node */ NodeType[TSTypeElement], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: (/* node */ NodeType[TSTypeElement], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
