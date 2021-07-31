package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.Identifier
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `394`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[Identifier, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[Identifier, TState]] = js.undefined
}
object `394` {
  
  @scala.inline
  def apply[TState](): `394`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`394`[TState]]
  }
  
  @scala.inline
  implicit class `394MutableBuilder`[Self <: `394`[?], TState] (val x: Self & `394`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[Identifier], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[Identifier], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
