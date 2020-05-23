package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOrganizationAdminAccountsResponse extends js.Object {
  /**
    * An AdminAccounts object that includes a list of accounts configured as GuardDuty delegated administrators.
    */
  var AdminAccounts: js.UndefOr[typings.awsSdk.guarddutyMod.AdminAccounts] = js.native
  /**
    * The pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListOrganizationAdminAccountsResponse {
  @scala.inline
  def apply(AdminAccounts: AdminAccounts = null, NextToken: String = null): ListOrganizationAdminAccountsResponse = {
    val __obj = js.Dynamic.literal()
    if (AdminAccounts != null) __obj.updateDynamic("AdminAccounts")(AdminAccounts.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOrganizationAdminAccountsResponse]
  }
}

