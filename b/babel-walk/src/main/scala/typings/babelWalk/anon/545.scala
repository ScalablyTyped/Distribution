package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.TSParenthesizedType
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `545`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[TSParenthesizedType, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[TSParenthesizedType, TState]] = js.undefined
}
object `545` {
  
  @scala.inline
  def apply[TState](): `545`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`545`[TState]]
  }
  
  @scala.inline
  implicit class `545MutableBuilder`[Self <: `545`[?], TState] (val x: Self & `545`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TSParenthesizedType], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TSParenthesizedType], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
