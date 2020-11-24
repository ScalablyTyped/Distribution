package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.EnumMember
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `17`[TState] extends js.Object {
  
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
  implicit class `17Ops`[Self <: `17`[_], TState] (val x: Self with `17`[TState]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnter(value: (/* node */ NodeType[EnumMember], TState) => Unit): Self = this.set("enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[EnumMember], TState) => Unit): Self = this.set("exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteExit: Self = this.set("exit", js.undefined)
  }
}
