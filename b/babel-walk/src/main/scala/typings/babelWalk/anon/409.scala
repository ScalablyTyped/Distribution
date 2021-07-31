package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.TSTypeAnnotation
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `409`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[TSTypeAnnotation, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[TSTypeAnnotation, TState]] = js.undefined
}
object `409` {
  
  @scala.inline
  def apply[TState](): `409`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`409`[TState]]
  }
  
  @scala.inline
  implicit class `409MutableBuilder`[Self <: `409`[?], TState] (val x: Self & `409`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TSTypeAnnotation], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TSTypeAnnotation], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
