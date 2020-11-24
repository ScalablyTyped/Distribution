package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletionTaskFailureReasonType extends js.Object {
  
  /**
    * A short description of the reason that the service-linked role deletion failed.
    */
  var Reason: js.UndefOr[ReasonType] = js.native
  
  /**
    * A list of objects that contains details about the service-linked role deletion failure, if that information is returned by the service. If the service-linked role has active sessions or if any resources that were used by the role have not been deleted from the linked service, the role can't be deleted. This parameter includes a list of the resources that are associated with the role and the Region in which the resources are being used.
    */
  var RoleUsageList: js.UndefOr[RoleUsageListType] = js.native
}
object DeletionTaskFailureReasonType {
  
  @scala.inline
  def apply(): DeletionTaskFailureReasonType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletionTaskFailureReasonType]
  }
  
  @scala.inline
  implicit class DeletionTaskFailureReasonTypeOps[Self <: DeletionTaskFailureReasonType] (val x: Self) extends AnyVal {
    
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
    def setReason(value: ReasonType): Self = this.set("Reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("Reason", js.undefined)
    
    @scala.inline
    def setRoleUsageListVarargs(value: RoleUsageType*): Self = this.set("RoleUsageList", js.Array(value :_*))
    
    @scala.inline
    def setRoleUsageList(value: RoleUsageListType): Self = this.set("RoleUsageList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleUsageList: Self = this.set("RoleUsageList", js.undefined)
  }
}
