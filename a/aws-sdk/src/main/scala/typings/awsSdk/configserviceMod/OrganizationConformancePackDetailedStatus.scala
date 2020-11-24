package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationConformancePackDetailedStatus extends js.Object {
  
  /**
    * The 12-digit account ID of a member account.
    */
  var AccountId: typings.awsSdk.configserviceMod.AccountId = js.native
  
  /**
    * The name of conformance pack deployed in the member account.
    */
  var ConformancePackName: StringWithCharLimit256 = js.native
  
  /**
    * An error code that is returned when conformance pack creation or deletion failed in the member account. 
    */
  var ErrorCode: js.UndefOr[String] = js.native
  
  /**
    * An error message indicating that conformance pack account creation or deletion has failed due to an error in the member account. 
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  
  /**
    * The timestamp of the last status update.
    */
  var LastUpdateTime: js.UndefOr[Date] = js.native
  
  /**
    * Indicates deployment status for conformance pack in a member account. When master account calls PutOrganizationConformancePack action for the first time, conformance pack status is created in the member account. When master account calls PutOrganizationConformancePack action for the second time, conformance pack status is updated in the member account. Conformance pack status is deleted when the master account deletes OrganizationConformancePack and disables service access for config-multiaccountsetup.amazonaws.com.   AWS Config sets the state of the conformance pack to:    CREATE_SUCCESSFUL when conformance pack has been created in the member account.     CREATE_IN_PROGRESS when conformance pack is being created in the member account.    CREATE_FAILED when conformance pack creation has failed in the member account.    DELETE_FAILED when conformance pack deletion has failed in the member account.    DELETE_IN_PROGRESS when conformance pack is being deleted in the member account.    DELETE_SUCCESSFUL when conformance pack has been deleted in the member account.     UPDATE_SUCCESSFUL when conformance pack has been updated in the member account.    UPDATE_IN_PROGRESS when conformance pack is being updated in the member account.    UPDATE_FAILED when conformance pack deletion has failed in the member account.  
    */
  var Status: OrganizationResourceDetailedStatus = js.native
}
object OrganizationConformancePackDetailedStatus {
  
  @scala.inline
  def apply(
    AccountId: AccountId,
    ConformancePackName: StringWithCharLimit256,
    Status: OrganizationResourceDetailedStatus
  ): OrganizationConformancePackDetailedStatus = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ConformancePackName = ConformancePackName.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationConformancePackDetailedStatus]
  }
  
  @scala.inline
  implicit class OrganizationConformancePackDetailedStatusOps[Self <: OrganizationConformancePackDetailedStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConformancePackName(value: StringWithCharLimit256): Self = this.set("ConformancePackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: OrganizationResourceDetailedStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCode(value: String): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    
    @scala.inline
    def setLastUpdateTime(value: Date): Self = this.set("LastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdateTime: Self = this.set("LastUpdateTime", js.undefined)
  }
}
