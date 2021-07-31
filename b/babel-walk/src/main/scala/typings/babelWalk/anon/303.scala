package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.ForInStatement
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `303`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[ForInStatement, TState]] = js.undefined
  
  var exit: js.UndefOr[AncestorFunction[ForInStatement, TState]] = js.undefined
}
object `303` {
  
  @scala.inline
  def apply[TState](): `303`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`303`[TState]]
  }
  
  @scala.inline
  implicit class `303MutableBuilder`[Self <: `303`[?], TState] (val x: Self & `303`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[ForInStatement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[ForInStatement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
