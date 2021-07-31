package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ClassPrivateProperty
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `261`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ClassPrivateProperty, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[ClassPrivateProperty, TState]] = js.undefined
}
object `261` {
  
  @scala.inline
  def apply[TState](): `261`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`261`[TState]]
  }
  
  @scala.inline
  implicit class `261MutableBuilder`[Self <: `261`[?], TState] (val x: Self & `261`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[ClassPrivateProperty], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[ClassPrivateProperty], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
