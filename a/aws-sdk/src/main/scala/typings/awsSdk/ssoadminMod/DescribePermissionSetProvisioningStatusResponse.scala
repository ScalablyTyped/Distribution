package typings.awsSdk.ssoadminMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePermissionSetProvisioningStatusResponse extends js.Object {
  
  /**
    * The status object for the permission set provisioning operation.
    */
  var PermissionSetProvisioningStatus: js.UndefOr[typings.awsSdk.ssoadminMod.PermissionSetProvisioningStatus] = js.native
}
object DescribePermissionSetProvisioningStatusResponse {
  
  @scala.inline
  def apply(): DescribePermissionSetProvisioningStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePermissionSetProvisioningStatusResponse]
  }
  
  @scala.inline
  implicit class DescribePermissionSetProvisioningStatusResponseOps[Self <: DescribePermissionSetProvisioningStatusResponse] (val x: Self) extends AnyVal {
    
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
    def setPermissionSetProvisioningStatus(value: PermissionSetProvisioningStatus): Self = this.set("PermissionSetProvisioningStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionSetProvisioningStatus: Self = this.set("PermissionSetProvisioningStatus", js.undefined)
  }
}
