package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclineInvitationsResponse extends js.Object {
  /**
    * An array of objects, one for each account whose invitation hasn't been declined. Each object identifies the account and explains why the request hasn't been processed for that account.
    */
  var unprocessedAccounts: js.UndefOr[listOfUnprocessedAccount] = js.native
}

object DeclineInvitationsResponse {
  @scala.inline
  def apply(unprocessedAccounts: listOfUnprocessedAccount = null): DeclineInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    if (unprocessedAccounts != null) __obj.updateDynamic("unprocessedAccounts")(unprocessedAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclineInvitationsResponse]
  }
}

