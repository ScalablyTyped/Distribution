package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclineInvitationsResponse extends js.Object {
  /**
    * A list of account ID and email address pairs of the AWS accounts that weren't processed.
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

