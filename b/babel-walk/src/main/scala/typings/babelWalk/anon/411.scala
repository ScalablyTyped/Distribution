package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.ImportSpecifier
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `411`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[ImportSpecifier, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[ImportSpecifier, TState]] = js.undefined
}
object `411` {
  
  @scala.inline
  def apply[TState](): `411`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`411`[TState]]
  }
  
  @scala.inline
  implicit class `411MutableBuilder`[Self <: `411`[?], TState] (val x: Self & `411`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[ImportSpecifier], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[ImportSpecifier], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
