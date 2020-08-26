package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationConformancePackStatus extends js.Object {
  /**
    * An error code that is returned when organization conformance pack creation or deletion has failed in a member account. 
    */
  var ErrorCode: js.UndefOr[String] = js.native
  /**
    * An error message indicating that organization conformance pack creation or deletion failed due to an error. 
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  /**
    * The timestamp of the last update.
    */
  var LastUpdateTime: js.UndefOr[Date] = js.native
  /**
    * The name that you assign to organization conformance pack.
    */
  var OrganizationConformancePackName: typings.awsSdk.configserviceMod.OrganizationConformancePackName = js.native
  /**
    * Indicates deployment status of an organization conformance pack. When master account calls PutOrganizationConformancePack for the first time, conformance pack status is created in all the member accounts. When master account calls PutOrganizationConformancePack for the second time, conformance pack status is updated in all the member accounts. Additionally, conformance pack status is updated when one or more member accounts join or leave an organization. Conformance pack status is deleted when the master account deletes OrganizationConformancePack in all the member accounts and disables service access for config-multiaccountsetup.amazonaws.com. AWS Config sets the state of the conformance pack to:    CREATE_SUCCESSFUL when an organization conformance pack has been successfully created in all the member accounts.     CREATE_IN_PROGRESS when an organization conformance pack creation is in progress.    CREATE_FAILED when an organization conformance pack creation failed in one or more member accounts within that organization.    DELETE_FAILED when an organization conformance pack deletion failed in one or more member accounts within that organization.    DELETE_IN_PROGRESS when an organization conformance pack deletion is in progress.    DELETE_SUCCESSFUL when an organization conformance pack has been successfully deleted from all the member accounts.    UPDATE_SUCCESSFUL when an organization conformance pack has been successfully updated in all the member accounts.    UPDATE_IN_PROGRESS when an organization conformance pack update is in progress.    UPDATE_FAILED when an organization conformance pack update failed in one or more member accounts within that organization.  
    */
  var Status: OrganizationResourceStatus = js.native
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
  implicit class OrganizationConformancePackStatusOps[Self <: OrganizationConformancePackStatus] (val x: Self) extends AnyVal {
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
    def setOrganizationConformancePackName(value: OrganizationConformancePackName): Self = this.set("OrganizationConformancePackName", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: OrganizationResourceStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
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

