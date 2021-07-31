package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.JSXClosingFragment
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `244`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[JSXClosingFragment, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[JSXClosingFragment, TState]] = js.undefined
}
object `244` {
  
  @scala.inline
  def apply[TState](): `244`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`244`[TState]]
  }
  
  @scala.inline
  implicit class `244MutableBuilder`[Self <: `244`[?], TState] (val x: Self & `244`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[JSXClosingFragment], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[JSXClosingFragment], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
