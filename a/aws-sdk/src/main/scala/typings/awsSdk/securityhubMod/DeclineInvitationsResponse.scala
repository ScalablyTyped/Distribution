package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclineInvitationsResponse extends js.Object {
  /**
    * The list of AWS accounts that were not processed. For each account, the list includes the account ID and the email address.
    */
  var UnprocessedAccounts: js.UndefOr[ResultList] = js.native
}

object DeclineInvitationsResponse {
  @scala.inline
  def apply(UnprocessedAccounts: ResultList = null): DeclineInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    if (UnprocessedAccounts != null) __obj.updateDynamic("UnprocessedAccounts")(UnprocessedAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclineInvitationsResponse]
  }
}

