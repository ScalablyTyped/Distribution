package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.While
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `315`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[While, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[While, TState]] = js.undefined
}
object `315` {
  
  @scala.inline
  def apply[TState](): `315`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`315`[TState]]
  }
  
  @scala.inline
  implicit class `315MutableBuilder`[Self <: `315`[?], TState] (val x: Self & `315`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[While], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[While], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
