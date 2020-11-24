package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.EnumDefaultedMember
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `507`[TState] extends js.Object {
  
  var enter: js.UndefOr[AncestorFunction[EnumDefaultedMember, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[EnumDefaultedMember, TState]] = js.native
}
object `507` {
  
  @scala.inline
  def apply[TState](): `507`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`507`[TState]]
  }
  
  @scala.inline
  implicit class `507Ops`[Self <: `507`[_], TState] (val x: Self with `507`[TState]) extends AnyVal {
    
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
    def setEnter(value: (/* node */ NodeType[EnumDefaultedMember], TState, /* ancestors */ js.Array[Node]) => Unit): Self = this.set("enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[EnumDefaultedMember], TState, /* ancestors */ js.Array[Node]) => Unit): Self = this.set("exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteExit: Self = this.set("exit", js.undefined)
  }
}
