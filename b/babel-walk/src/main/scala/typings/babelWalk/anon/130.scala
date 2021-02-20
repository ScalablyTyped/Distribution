package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSTypeQuery
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `130`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[TSTypeQuery, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[TSTypeQuery, TState]] = js.native
}
object `130` {
  
  @scala.inline
  def apply[TState](): `130`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`130`[TState]]
  }
  
  @scala.inline
  implicit class `130MutableBuilder`[Self <: `130`[_], TState] (val x: Self with `130`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[TSTypeQuery], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TSTypeQuery], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
