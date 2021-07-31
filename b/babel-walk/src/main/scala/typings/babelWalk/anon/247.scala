package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.IntersectionTypeAnnotation
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `247`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[IntersectionTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[SimpleFunction[IntersectionTypeAnnotation, TState]] = js.undefined
}
object `247` {
  
  @scala.inline
  def apply[TState](): `247`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`247`[TState]]
  }
  
  @scala.inline
  implicit class `247MutableBuilder`[Self <: `247`[?], TState] (val x: Self & `247`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[IntersectionTypeAnnotation], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[IntersectionTypeAnnotation], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
