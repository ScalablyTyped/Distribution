package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.CompletionStatement
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `562`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[CompletionStatement, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[CompletionStatement, TState]] = js.native
}
object `562` {
  
  @scala.inline
  def apply[TState](): `562`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`562`[TState]]
  }
  
  @scala.inline
  implicit class `562MutableBuilder`[Self <: `562`[_], TState] (val x: Self with `562`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[CompletionStatement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[CompletionStatement], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
