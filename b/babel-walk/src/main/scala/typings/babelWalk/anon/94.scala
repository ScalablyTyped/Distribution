package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.JSXIdentifier
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `94`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[JSXIdentifier, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[JSXIdentifier, TState]] = js.undefined
}
object `94` {
  
  @scala.inline
  def apply[TState](): `94`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`94`[TState]]
  }
  
  @scala.inline
  implicit class `94MutableBuilder`[Self <: `94`[?], TState] (val x: Self & `94`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[JSXIdentifier], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[JSXIdentifier], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
