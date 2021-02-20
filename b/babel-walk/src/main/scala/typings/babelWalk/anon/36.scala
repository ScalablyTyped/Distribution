package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.JSXExpressionContainer
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `36`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[JSXExpressionContainer, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[JSXExpressionContainer, TState]] = js.native
}
object `36` {
  
  @scala.inline
  def apply[TState](): `36`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`36`[TState]]
  }
  
  @scala.inline
  implicit class `36MutableBuilder`[Self <: `36`[_], TState] (val x: Self with `36`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[JSXExpressionContainer], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[JSXExpressionContainer], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
