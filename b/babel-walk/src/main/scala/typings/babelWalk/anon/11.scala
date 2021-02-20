package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.YieldExpression
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `11`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[YieldExpression, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[YieldExpression, TState]] = js.native
}
object `11` {
  
  @scala.inline
  def apply[TState](): `11`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`11`[TState]]
  }
  
  @scala.inline
  implicit class `11MutableBuilder`[Self <: `11`[_], TState] (val x: Self with `11`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[YieldExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[YieldExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
