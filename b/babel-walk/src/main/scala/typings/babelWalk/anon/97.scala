package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.ForXStatement
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `97`[TState] extends js.Object {
  
  var enter: js.UndefOr[SimpleFunction[ForXStatement, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[ForXStatement, TState]] = js.native
}
object `97` {
  
  @scala.inline
  def apply[TState](): `97`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`97`[TState]]
  }
  
  @scala.inline
  implicit class `97Ops`[Self <: `97`[_], TState] (val x: Self with `97`[TState]) extends AnyVal {
    
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
    def setEnter(value: (/* node */ NodeType[ForXStatement], TState) => Unit): Self = this.set("enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[ForXStatement], TState) => Unit): Self = this.set("exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteExit: Self = this.set("exit", js.undefined)
  }
}
