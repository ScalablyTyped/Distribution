package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DSWalkOptions extends js.Object {
  
  var enter: js.UndefOr[DSWalkEnterOrLeaveFn] = js.native
  
  var leave: js.UndefOr[DSWalkEnterOrLeaveFn] = js.native
}
object DSWalkOptions {
  
  @scala.inline
  def apply(): DSWalkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DSWalkOptions]
  }
  
  @scala.inline
  implicit class DSWalkOptionsOps[Self <: DSWalkOptions] (val x: Self) extends AnyVal {
    
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
    def setEnter(value: /* node */ DSNode => Unit): Self = this.set("enter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    
    @scala.inline
    def setLeave(value: /* node */ DSNode => Unit): Self = this.set("leave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLeave: Self = this.set("leave", js.undefined)
  }
}
