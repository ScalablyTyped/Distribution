package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationConformancePackStatus extends StObject {
  
  /**
    * An error code that is returned when organization conformance pack creation or deletion has failed in a member account. 
    */
  var ErrorCode: js.UndefOr[String] = js.undefined
  
  /**
    * An error message indicating that organization conformance pack creation or deletion failed due to an error. 
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp of the last update.
    */
  var LastUpdateTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The name that you assign to organization conformance pack.
    */
  var OrganizationConformancePackName: typings.awsSdk.configserviceMod.OrganizationConformancePackName
  
  /**
    * Indicates deployment status of an organization conformance pack. When master account calls PutOrganizationConformancePack for the first time, conformance pack status is created in all the member accounts. When master account calls PutOrganizationConformancePack for the second time, conformance pack status is updated in all the member accounts. Additionally, conformance pack status is updated when one or more member accounts join or leave an organization. Conformance pack status is deleted when the master account deletes OrganizationConformancePack in all the member accounts and disables service access for config-multiaccountsetup.amazonaws.com. AWS Config sets the state of the conformance pack to:    CREATE_SUCCESSFUL when an organization conformance pack has been successfully created in all the member accounts.     CREATE_IN_PROGRESS when an organization conformance pack creation is in progress.    CREATE_FAILED when an organization conformance pack creation failed in one or more member accounts within that organization.    DELETE_FAILED when an organization conformance pack deletion failed in one or more member accounts within that organization.    DELETE_IN_PROGRESS when an organization conformance pack deletion is in progress.    DELETE_SUCCESSFUL when an organization conformance pack has been successfully deleted from all the member accounts.    UPDATE_SUCCESSFUL when an organization conformance pack has been successfully updated in all the member accounts.    UPDATE_IN_PROGRESS when an organization conformance pack update is in progress.    UPDATE_FAILED when an organization conformance pack update failed in one or more member accounts within that organization.  
    */
  var Status: OrganizationResourceStatus
}
object OrganizationConformancePackStatus {
  
  @scala.inline
  def apply(
    OrganizationConformancePackName: OrganizationConformancePackName,
    Status: OrganizationResourceStatus
  ): OrganizationConformancePackStatus = {
    val __obj = js.Dynamic.literal(OrganizationConformancePackName = OrganizationConformancePackName.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationConformancePackStatus]
  }
  
  @scala.inline
  implicit class OrganizationConformancePackStatusMutableBuilder[Self <: OrganizationConformancePackStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: String): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setLastUpdateTime(value: Date): Self = StObject.set(x, "LastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTimeUndefined: Self = StObject.set(x, "LastUpdateTime", js.undefined)
    
    @scala.inline
    def setOrganizationConformancePackName(value: OrganizationConformancePackName): Self = StObject.set(x, "OrganizationConformancePackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: OrganizationResourceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
