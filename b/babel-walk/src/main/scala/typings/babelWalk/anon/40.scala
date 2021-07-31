package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.FlowType
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `40`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[FlowType, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[FlowType, TState]] = js.undefined
}
object `40` {
  
  @scala.inline
  def apply[TState](): `40`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`40`[TState]]
  }
  
  @scala.inline
  implicit class `40MutableBuilder`[Self <: `40`[?], TState] (val x: Self & `40`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[FlowType], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[FlowType], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
