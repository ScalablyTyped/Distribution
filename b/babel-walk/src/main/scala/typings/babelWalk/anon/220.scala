package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.EnumDefaultedMember
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `220`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[EnumDefaultedMember, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[EnumDefaultedMember, TState]] = js.native
}
object `220` {
  
  @scala.inline
  def apply[TState](): `220`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`220`[TState]]
  }
  
  @scala.inline
  implicit class `220MutableBuilder`[Self <: `220`[_], TState] (val x: Self with `220`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[EnumDefaultedMember], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[EnumDefaultedMember], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
