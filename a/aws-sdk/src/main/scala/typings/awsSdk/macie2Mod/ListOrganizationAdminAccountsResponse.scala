package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOrganizationAdminAccountsResponse extends js.Object {
  /**
    * An array of objects, one for each account that's designated as a delegated administrator of Amazon Macie for the AWS organization. Of those accounts, only one can have a status of ENABLED.
    */
  var adminAccounts: js.UndefOr[listOfAdminAccount] = js.native
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var nextToken: js.UndefOr[string] = js.native
}

object ListOrganizationAdminAccountsResponse {
  @scala.inline
  def apply(adminAccounts: listOfAdminAccount = null, nextToken: string = null): ListOrganizationAdminAccountsResponse = {
    val __obj = js.Dynamic.literal()
    if (adminAccounts != null) __obj.updateDynamic("adminAccounts")(adminAccounts.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOrganizationAdminAccountsResponse]
  }
}

