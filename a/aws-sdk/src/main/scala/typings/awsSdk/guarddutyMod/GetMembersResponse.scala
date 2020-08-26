package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMembersResponse extends js.Object {
  /**
    * A list of members.
    */
  var Members: typings.awsSdk.guarddutyMod.Members = js.native
  /**
    * A list of objects that contain the unprocessed account and a result string that explains why it was unprocessed.
    */
  var UnprocessedAccounts: typings.awsSdk.guarddutyMod.UnprocessedAccounts = js.native
}

object GetMembersResponse {
  @scala.inline
  def apply(Members: Members, UnprocessedAccounts: UnprocessedAccounts): GetMembersResponse = {
    val __obj = js.Dynamic.literal(Members = Members.asInstanceOf[js.Any], UnprocessedAccounts = UnprocessedAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMembersResponse]
  }
  @scala.inline
  implicit class GetMembersResponseOps[Self <: GetMembersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMembersVarargs(value: Member*): Self = this.set("Members", js.Array(value :_*))
    @scala.inline
    def setMembers(value: Members): Self = this.set("Members", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnprocessedAccountsVarargs(value: UnprocessedAccount*): Self = this.set("UnprocessedAccounts", js.Array(value :_*))
    @scala.inline
    def setUnprocessedAccounts(value: UnprocessedAccounts): Self = this.set("UnprocessedAccounts", value.asInstanceOf[js.Any])
  }
  
}

