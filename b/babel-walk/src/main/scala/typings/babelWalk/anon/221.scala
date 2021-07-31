package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ClassProperty
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `221`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ClassProperty, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ClassProperty, TState]] = js.undefined
}
object `221` {
  
  @scala.inline
  def apply[TState](): `221`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`221`[TState]]
  }
  
  @scala.inline
  implicit class `221MutableBuilder`[Self <: `221`[?], TState] (val x: Self & `221`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[ClassProperty], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[ClassProperty], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
