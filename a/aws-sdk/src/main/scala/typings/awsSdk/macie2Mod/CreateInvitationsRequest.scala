package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInvitationsRequest extends js.Object {
  /**
    * An array that lists AWS account IDs, one for each account to send the invitation to.
    */
  var accountIds: listOfString = js.native
  /**
    * Specifies whether to send an email notification to the root user of each account that the invitation will be sent to. This notification is in addition to an alert that the root user receives in AWS Personal Health Dashboard. To send an email notification to the root user of each account, set this value to true.
    */
  var disableEmailNotification: js.UndefOr[boolean] = js.native
  /**
    * A custom message to include in the invitation. Amazon Macie adds this message to the standard content that it sends for an invitation.
    */
  var message: js.UndefOr[string] = js.native
}

object CreateInvitationsRequest {
  @scala.inline
  def apply(accountIds: listOfString): CreateInvitationsRequest = {
    val __obj = js.Dynamic.literal(accountIds = accountIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInvitationsRequest]
  }
  @scala.inline
  implicit class CreateInvitationsRequestOps[Self <: CreateInvitationsRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setDisableEmailNotification(value: boolean): Self = this.set("disableEmailNotification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableEmailNotification: Self = this.set("disableEmailNotification", js.undefined)
    @scala.inline
    def setMessage(value: string): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
  
}

