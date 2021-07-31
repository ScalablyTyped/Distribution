package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.EmptyStatement
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `405`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[EmptyStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[EmptyStatement, TState]] = js.undefined
}
object `405` {
  
  @scala.inline
  def apply[TState](): `405`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`405`[TState]]
  }
  
  @scala.inline
  implicit class `405MutableBuilder`[Self <: `405`[?], TState] (val x: Self & `405`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[EmptyStatement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[EmptyStatement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
