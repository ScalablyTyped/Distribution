package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.InferredPredicate
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `438`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[InferredPredicate, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[InferredPredicate, TState]] = js.undefined
}
object `438` {
  
  @scala.inline
  def apply[TState](): `438`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`438`[TState]]
  }
  
  @scala.inline
  implicit class `438MutableBuilder`[Self <: `438`[?], TState] (val x: Self & `438`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[InferredPredicate], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[InferredPredicate], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
