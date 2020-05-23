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
  def apply(
    accountIds: listOfString,
    disableEmailNotification: js.UndefOr[boolean] = js.undefined,
    message: string = null
  ): CreateInvitationsRequest = {
    val __obj = js.Dynamic.literal(accountIds = accountIds.asInstanceOf[js.Any])
    if (!js.isUndefined(disableEmailNotification)) __obj.updateDynamic("disableEmailNotification")(disableEmailNotification.get.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInvitationsRequest]
  }
}

