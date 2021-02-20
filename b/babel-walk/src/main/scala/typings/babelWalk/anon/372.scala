package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.BindExpression
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `372`[TState] extends StObject {
  
  var enter: js.UndefOr[AncestorFunction[BindExpression, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[BindExpression, TState]] = js.native
}
object `372` {
  
  @scala.inline
  def apply[TState](): `372`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`372`[TState]]
  }
  
  @scala.inline
  implicit class `372MutableBuilder`[Self <: `372`[_], TState] (val x: Self with `372`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[BindExpression], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[BindExpression], TState, /* ancestors */ js.Array[Node]) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
