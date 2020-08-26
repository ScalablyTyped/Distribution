package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateMembersResponse extends js.Object {
  /**
    * A list of objects that contain the unprocessed account and a result string that explains why it was unprocessed.
    */
  var UnprocessedAccounts: typings.awsSdk.guarddutyMod.UnprocessedAccounts = js.native
}

object DisassociateMembersResponse {
  @scala.inline
  def apply(UnprocessedAccounts: UnprocessedAccounts): DisassociateMembersResponse = {
    val __obj = js.Dynamic.literal(UnprocessedAccounts = UnprocessedAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateMembersResponse]
  }
  @scala.inline
  implicit class DisassociateMembersResponseOps[Self <: DisassociateMembersResponse] (val x: Self) extends AnyVal {
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
    def setUnprocessedAccountsVarargs(value: UnprocessedAccount*): Self = this.set("UnprocessedAccounts", js.Array(value :_*))
    @scala.inline
    def setUnprocessedAccounts(value: UnprocessedAccounts): Self = this.set("UnprocessedAccounts", value.asInstanceOf[js.Any])
  }
  
}

