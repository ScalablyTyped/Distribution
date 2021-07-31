package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.WithStatement
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `391`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[WithStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[WithStatement, TState]] = js.undefined
}
object `391` {
  
  @scala.inline
  def apply[TState](): `391`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`391`[TState]]
  }
  
  @scala.inline
  implicit class `391MutableBuilder`[Self <: `391`[?], TState] (val x: Self & `391`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[WithStatement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[WithStatement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
