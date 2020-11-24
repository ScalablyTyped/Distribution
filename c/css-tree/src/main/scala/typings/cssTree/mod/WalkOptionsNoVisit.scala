package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WalkOptionsNoVisit extends js.Object {
  
  var enter: js.UndefOr[EnterOrLeaveFn[CssNode]] = js.native
  
  var leave: js.UndefOr[EnterOrLeaveFn[CssNode]] = js.native
  
  var reverse: js.UndefOr[Boolean] = js.native
}
object WalkOptionsNoVisit {
  
  @scala.inline
  def apply(): WalkOptionsNoVisit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WalkOptionsNoVisit]
  }
  
  @scala.inline
  implicit class WalkOptionsNoVisitOps[Self <: WalkOptionsNoVisit] (val x: Self) extends AnyVal {
    
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
    def setEnter(value: EnterOrLeaveFn[CssNode]): Self = this.set("enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    
    @scala.inline
    def setLeave(value: EnterOrLeaveFn[CssNode]): Self = this.set("leave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeave: Self = this.set("leave", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
  }
}
