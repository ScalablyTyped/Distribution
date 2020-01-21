package typings.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMembersResponse extends js.Object {
  /**
    * The member account details that Detective is returning in response to the request.
    */
  var MemberDetails: js.UndefOr[MemberDetailList] = js.native
  /**
    * The requested member accounts for which Detective was unable to return member details. For each account, provides the reason why the request could not be processed.
    */
  var UnprocessedAccounts: js.UndefOr[UnprocessedAccountList] = js.native
}

object GetMembersResponse {
  @scala.inline
  def apply(MemberDetails: MemberDetailList = null, UnprocessedAccounts: UnprocessedAccountList = null): GetMembersResponse = {
    val __obj = js.Dynamic.literal()
    if (MemberDetails != null) __obj.updateDynamic("MemberDetails")(MemberDetails.asInstanceOf[js.Any])
    if (UnprocessedAccounts != null) __obj.updateDynamic("UnprocessedAccounts")(UnprocessedAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMembersResponse]
  }
}

