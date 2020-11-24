package typings.babelWalk.anon

import typings.babelWalk.babelWalkStrings.TSTypePredicate
import typings.babelWalk.mod.NodeType
import typings.babelWalk.mod.SimpleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `213`[TState] extends js.Object {
  
  var enter: js.UndefOr[SimpleFunction[TSTypePredicate, TState]] = js.native
  
  var exit: js.UndefOr[SimpleFunction[TSTypePredicate, TState]] = js.native
}
object `213` {
  
  @scala.inline
  def apply[TState](): `213`[TState] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`213`[TState]]
  }
  
  @scala.inline
  implicit class `213Ops`[Self <: `213`[_], TState] (val x: Self with `213`[TState]) extends AnyVal {
    
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
    def setEnter(value: (/* node */ NodeType[TSTypePredicate], TState) => Unit): Self = this.set("enter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    
    @scala.inline
    def setExit(value: (/* node */ NodeType[TSTypePredicate], TState) => Unit): Self = this.set("exit", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteExit: Self = this.set("exit", js.undefined)
  }
}
