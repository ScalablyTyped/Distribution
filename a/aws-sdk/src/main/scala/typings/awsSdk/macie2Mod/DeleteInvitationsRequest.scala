package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInvitationsRequest extends js.Object {
  /**
    * An array that lists AWS account IDs, one for each account that sent an invitation to delete.
    */
  var accountIds: listOfString = js.native
}

object DeleteInvitationsRequest {
  @scala.inline
  def apply(accountIds: listOfString): DeleteInvitationsRequest = {
    val __obj = js.Dynamic.literal(accountIds = accountIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInvitationsRequest]
  }
  @scala.inline
  implicit class DeleteInvitationsRequestOps[Self <: DeleteInvitationsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountIdsVarargs(value: string*): Self = this.set("accountIds", js.Array(value :_*))
    @scala.inline
    def setAccountIds(value: listOfString): Self = this.set("accountIds", value.asInstanceOf[js.Any])
  }
  
}

