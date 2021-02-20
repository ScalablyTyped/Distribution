package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ObjectMember
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `147`[TState] extends StObject {
  
  var enter: js.UndefOr[SimpleFunction[ObjectMember, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[ObjectMember, TState]] = js.native
}
object `147` {
  
  @scala.inline
  def apply[TState](): `147`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`147`[TState]]
  }
  
  @scala.inline
  implicit class `147MutableBuilder`[Self <: `147`[_], TState] (val x: Self with `147`[TState]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[ObjectMember], TState) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[ObjectMember], TState) => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
