package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationResourceDetailedStatusFilters extends js.Object {
  /**
    * The 12-digit account ID of the member account within an organization.
    */
  var AccountId: js.UndefOr[typings.awsSdk.configserviceMod.AccountId] = js.native
  /**
    * Indicates deployment status for conformance pack in a member account. When master account calls PutOrganizationConformancePack action for the first time, conformance pack status is created in the member account. When master account calls PutOrganizationConformancePack action for the second time, conformance pack status is updated in the member account. Conformance pack status is deleted when the master account deletes OrganizationConformancePack and disables service access for config-multiaccountsetup.amazonaws.com.   AWS Config sets the state of the conformance pack to:    CREATE_SUCCESSFUL when conformance pack has been created in the member account.     CREATE_IN_PROGRESS when conformance pack is being created in the member account.    CREATE_FAILED when conformance pack creation has failed in the member account.    DELETE_FAILED when conformance pack deletion has failed in the member account.    DELETE_IN_PROGRESS when conformance pack is being deleted in the member account.    DELETE_SUCCESSFUL when conformance pack has been deleted in the member account.     UPDATE_SUCCESSFUL when conformance pack has been updated in the member account.    UPDATE_IN_PROGRESS when conformance pack is being updated in the member account.    UPDATE_FAILED when conformance pack deletion has failed in the member account.  
    */
  var Status: js.UndefOr[OrganizationResourceDetailedStatus] = js.native
}

object OrganizationResourceDetailedStatusFilters {
  @scala.inline
  def apply(AccountId: AccountId = null, Status: OrganizationResourceDetailedStatus = null): OrganizationResourceDetailedStatusFilters = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationResourceDetailedStatusFilters]
  }
}

