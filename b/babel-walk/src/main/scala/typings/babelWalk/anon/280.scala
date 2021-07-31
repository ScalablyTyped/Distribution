package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.EnumBody
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `280`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[EnumBody, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[EnumBody, TState]] = js.undefined
}
object `280` {
  
  @scala.inline
  def apply[TState](): `280`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`280`[TState]]
  }
  
  @scala.inline
  implicit class `280MutableBuilder`[Self <: `280`[?], TState] (val x: Self & `280`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[EnumBody], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[EnumBody], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
