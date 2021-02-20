package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.UnaryExpression
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `202`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[UnaryExpression, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[UnaryExpression, TState]] = js.native
}
object `202` {
  
  @scala.inline
  def apply[TState](): `202`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`202`[TState]]
  }
  
  @scala.inline
  implicit class `202MutableBuilder`[Self <: `202`[_], TState] (val x: Self with `202`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[UnaryExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[UnaryExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
