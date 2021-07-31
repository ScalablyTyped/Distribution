package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.FunctionParent
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `510`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[FunctionParent, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[FunctionParent, TState]] = js.undefined
}
object `510` {
  
  @scala.inline
  def apply[TState](): `510`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`510`[TState]]
  }
  
  @scala.inline
  implicit class `510MutableBuilder`[Self <: `510`[?], TState] (val x: Self & `510`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[FunctionParent], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[FunctionParent], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
