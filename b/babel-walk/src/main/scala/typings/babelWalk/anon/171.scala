package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.JSXFragment
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `171`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[JSXFragment, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[JSXFragment, TState]] = js.undefined
}
object `171` {
  
  @scala.inline
  def apply[TState](): `171`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`171`[TState]]
  }
  
  @scala.inline
  implicit class `171MutableBuilder`[Self <: `171`[?], TState] (val x: Self & `171`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[JSXFragment], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[JSXFragment], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
