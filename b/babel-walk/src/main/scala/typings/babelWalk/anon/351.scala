package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.TSVoidKeyword
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `351`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[TSVoidKeyword, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[TSVoidKeyword, TState]] = js.undefined
}
object `351` {
  
  @scala.inline
  def apply[TState](): `351`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`351`[TState]]
  }
  
  @scala.inline
  implicit class `351MutableBuilder`[Self <: `351`[?], TState] (val x: Self & `351`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TSVoidKeyword], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TSVoidKeyword], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
