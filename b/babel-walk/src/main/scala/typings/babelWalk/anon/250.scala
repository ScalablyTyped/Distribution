package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.DoExpression
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `250`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[DoExpression, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[DoExpression, TState]] = js.native
}
object `250` {
  
  @scala.inline
  def apply[TState](): `250`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`250`[TState]]
  }
  
  @scala.inline
  implicit class `250MutableBuilder`[Self <: `250`[_], TState] (val x: Self with `250`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[DoExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[DoExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
