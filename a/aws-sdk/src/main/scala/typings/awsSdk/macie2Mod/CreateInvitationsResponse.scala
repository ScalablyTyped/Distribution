package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInvitationsResponse extends js.Object {
  /**
    * An array of objects, one for each account whose invitation hasn't been processed. Each object identifies the account and explains why the invitation hasn't been processed for the account.
    */
  var unprocessedAccounts: js.UndefOr[listOfUnprocessedAccount] = js.native
}

object CreateInvitationsResponse {
  @scala.inline
  def apply(unprocessedAccounts: listOfUnprocessedAccount = null): CreateInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    if (unprocessedAccounts != null) __obj.updateDynamic("unprocessedAccounts")(unprocessedAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInvitationsResponse]
  }
}

