package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.CallExpression
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `52`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[CallExpression, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[CallExpression, TState]] = js.native
}
object `52` {
  
  @scala.inline
  def apply[TState](): `52`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`52`[TState]]
  }
  
  @scala.inline
  implicit class `52MutableBuilder`[Self <: `52`[_], TState] (val x: Self with `52`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[CallExpression], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[CallExpression], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
