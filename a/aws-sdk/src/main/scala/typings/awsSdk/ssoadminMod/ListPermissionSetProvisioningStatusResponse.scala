package typings.awsSdk.ssoadminMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPermissionSetProvisioningStatusResponse extends js.Object {
  
  /**
    * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make subsequent calls.
    */
  var NextToken: js.UndefOr[Token] = js.native
  
  /**
    * The status object for the permission set provisioning operation.
    */
  var PermissionSetsProvisioningStatus: js.UndefOr[PermissionSetProvisioningStatusList] = js.native
}
object ListPermissionSetProvisioningStatusResponse {
  
  @scala.inline
  def apply(): ListPermissionSetProvisioningStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPermissionSetProvisioningStatusResponse]
  }
  
  @scala.inline
  implicit class ListPermissionSetProvisioningStatusResponseOps[Self <: ListPermissionSetProvisioningStatusResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setPermissionSetsProvisioningStatusVarargs(value: PermissionSetProvisioningStatusMetadata*): Self = this.set("PermissionSetsProvisioningStatus", js.Array(value :_*))
    
    @scala.inline
    def setPermissionSetsProvisioningStatus(value: PermissionSetProvisioningStatusList): Self = this.set("PermissionSetsProvisioningStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionSetsProvisioningStatus: Self = this.set("PermissionSetsProvisioningStatus", js.undefined)
  }
}
