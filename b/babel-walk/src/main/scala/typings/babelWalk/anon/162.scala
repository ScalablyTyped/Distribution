package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.EmptyTypeAnnotation
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `162`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[EmptyTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[EmptyTypeAnnotation, TState]] = js.undefined
}
object `162` {
  
  @scala.inline
  def apply[TState](): `162`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`162`[TState]]
  }
  
  @scala.inline
  implicit class `162MutableBuilder`[Self <: `162`[?], TState] (val x: Self & `162`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[EmptyTypeAnnotation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[EmptyTypeAnnotation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
