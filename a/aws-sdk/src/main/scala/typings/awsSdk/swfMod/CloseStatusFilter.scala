package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloseStatusFilter extends js.Object {
  
  /**
    *  The close status that must match the close status of an execution for it to meet the criteria of this filter.
    */
  var status: CloseStatus = js.native
}
object CloseStatusFilter {
  
  @scala.inline
  def apply(status: CloseStatus): CloseStatusFilter = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseStatusFilter]
  }
  
  @scala.inline
  implicit class CloseStatusFilterOps[Self <: CloseStatusFilter] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: CloseStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
