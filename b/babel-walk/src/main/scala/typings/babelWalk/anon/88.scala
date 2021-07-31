package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ObjectTypeSpreadProperty
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `88`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ObjectTypeSpreadProperty, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ObjectTypeSpreadProperty, TState]] = js.undefined
}
object `88` {
  
  @scala.inline
  def apply[TState](): `88`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`88`[TState]]
  }
  
  @scala.inline
  implicit class `88MutableBuilder`[Self <: `88`[?], TState] (val x: Self & `88`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[ObjectTypeSpreadProperty], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[ObjectTypeSpreadProperty], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
