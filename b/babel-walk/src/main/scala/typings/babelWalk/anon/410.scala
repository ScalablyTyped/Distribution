package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.AwaitExpression
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `410`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[AwaitExpression, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[AwaitExpression, TState]] = js.native
}
object `410` {
  
  @scala.inline
  def apply[TState](): `410`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`410`[TState]]
  }
  
  @scala.inline
  implicit class `410MutableBuilder`[Self <: `410`[_], TState] (val x: Self with `410`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[AwaitExpression], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[AwaitExpression], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
