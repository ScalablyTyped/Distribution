package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.AwaitExpression
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `123`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[AwaitExpression, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[AwaitExpression, TState]] = js.native
}
object `123` {
  
  @scala.inline
  def apply[TState](): `123`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`123`[TState]]
  }
  
  @scala.inline
  implicit class `123MutableBuilder`[Self <: `123`[_], TState] (val x: Self with `123`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[AwaitExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[AwaitExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
