package typings.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMembersResponse extends js.Object {
  /**
    * The set of member account invitation requests that Detective was able to process. This includes accounts that are being verified, that failed verification, and that passed verification and are being sent an invitation.
    */
  var Members: js.UndefOr[MemberDetailList] = js.native
  /**
    * The list of accounts for which Detective was unable to process the invitation request. For each account, the list provides the reason why the request could not be processed. The list includes accounts that are already member accounts in the behavior graph.
    */
  var UnprocessedAccounts: js.UndefOr[UnprocessedAccountList] = js.native
}

object CreateMembersResponse {
  @scala.inline
  def apply(Members: MemberDetailList = null, UnprocessedAccounts: UnprocessedAccountList = null): CreateMembersResponse = {
    val __obj = js.Dynamic.literal()
    if (Members != null) __obj.updateDynamic("Members")(Members.asInstanceOf[js.Any])
    if (UnprocessedAccounts != null) __obj.updateDynamic("UnprocessedAccounts")(UnprocessedAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMembersResponse]
  }
}

