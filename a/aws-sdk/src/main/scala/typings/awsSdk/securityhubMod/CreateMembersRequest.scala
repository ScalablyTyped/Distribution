package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMembersRequest extends js.Object {
  /**
    * The list of accounts to associate with the Security Hub master account. For each account, the list includes the account ID and the email address.
    */
  var AccountDetails: js.UndefOr[AccountDetailsList] = js.native
}

object CreateMembersRequest {
  @scala.inline
  def apply(AccountDetails: AccountDetailsList = null): CreateMembersRequest = {
    val __obj = js.Dynamic.literal()
    if (AccountDetails != null) __obj.updateDynamic("AccountDetails")(AccountDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMembersRequest]
  }
}

