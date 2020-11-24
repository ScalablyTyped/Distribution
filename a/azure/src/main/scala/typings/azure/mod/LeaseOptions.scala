package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeaseOptions extends AccessConditionsOptions {
  
  var leaseDuration: js.UndefOr[String] = js.native
  
  var proposedLeaseId: js.UndefOr[String] = js.native
}
object LeaseOptions {
  
  @scala.inline
  def apply(): LeaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeaseOptions]
  }
  
  @scala.inline
  implicit class LeaseOptionsOps[Self <: LeaseOptions] (val x: Self) extends AnyVal {
    
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
    def setLeaseDuration(value: String): Self = this.set("leaseDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeaseDuration: Self = this.set("leaseDuration", js.undefined)
    
    @scala.inline
    def setProposedLeaseId(value: String): Self = this.set("proposedLeaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProposedLeaseId: Self = this.set("proposedLeaseId", js.undefined)
  }
}
