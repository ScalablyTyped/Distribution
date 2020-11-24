package typings.babelWalk.anon

import typings.babelTypes.mod.Node
import typings.babelWalk.babelWalkStrings.TypeParameterInstantiation
import typings.babelWalk.mod.AncestorFunction
import typings.babelWalk.mod.NodeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `569`[TState] extends js.Object {
  
  var enter: js.UndefOr[AncestorFunction[TypeParameterInstantiation, TState]] = js.native
  
  var exit: js.UndefOr[AncestorFunction[TypeParameterInstantiation, TState]] = js.native
}
object `569` {
  
  @scala.inline
  def apply[TState](): `569`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`569`[TState]]
  }
  
  @scala.inline
  implicit class `569Ops`[Self <: `569`[_], TState] (val x: Self with `569`[TState]) extends AnyVal {
    
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
    def setEnter(
      value: (/* node */ NodeType[TypeParameterInstantiation], TState, /* ancestors */ js.Array[Node]) => Unit
    ): Self = this.set("enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    
    @scala.inline
    def setExit(
      value: (/* node */ NodeType[TypeParameterInstantiation], TState, /* ancestors */ js.Array[Node]) => Unit
    ): Self = this.set("exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteExit: Self = this.set("exit", js.undefined)
  }
}
