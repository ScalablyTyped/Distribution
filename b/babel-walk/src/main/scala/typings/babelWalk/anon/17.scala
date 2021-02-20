package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.EnumMember
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `17`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[EnumMember, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[EnumMember, TState]] = js.native
}
object `17` {
  
  @scala.inline
  def apply[TState](): `17`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`17`[TState]]
  }
  
  @scala.inline
  implicit class `17MutableBuilder`[Self <: `17`[_], TState] (val x: Self with `17`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[EnumMember], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[EnumMember], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
