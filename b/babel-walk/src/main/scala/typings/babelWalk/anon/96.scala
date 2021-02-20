package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.BinaryExpression
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `96`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[BinaryExpression, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[BinaryExpression, TState]] = js.native
}
object `96` {
  
  @scala.inline
  def apply[TState](): `96`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`96`[TState]]
  }
  
  @scala.inline
  implicit class `96MutableBuilder`[Self <: `96`[_], TState] (val x: Self with `96`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[BinaryExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[BinaryExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
