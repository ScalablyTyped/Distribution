package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.ObjectTypeAnnotation
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `378`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[ObjectTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[ObjectTypeAnnotation, TState]] = js.undefined
}
object `378` {
  
  @scala.inline
  def apply[TState](): `378`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`378`[TState]]
  }
  
  @scala.inline
  implicit class `378MutableBuilder`[Self <: `378`[?], TState] (val x: Self & `378`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[ObjectTypeAnnotation], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[ObjectTypeAnnotation], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
