package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ImportAttribute
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `134`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ImportAttribute, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ImportAttribute, TState]] = js.undefined
}
object `134` {
  
  @scala.inline
  def apply[TState](): `134`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`134`[TState]]
  }
  
  @scala.inline
  implicit class `134MutableBuilder`[Self <: `134`[?], TState] (val x: Self & `134`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[ImportAttribute], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[ImportAttribute], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
