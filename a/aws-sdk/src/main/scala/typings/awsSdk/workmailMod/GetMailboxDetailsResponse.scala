package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMailboxDetailsResponse extends js.Object {
  /**
    * The maximum allowed mailbox size, in MB, for the specified user.
    */
  var MailboxQuota: js.UndefOr[typings.awsSdk.workmailMod.MailboxQuota] = js.native
  /**
    * The current mailbox size, in MB, for the specified user.
    */
  var MailboxSize: js.UndefOr[typings.awsSdk.workmailMod.MailboxSize] = js.native
}

object GetMailboxDetailsResponse {
  @scala.inline
  def apply(
    MailboxQuota: js.UndefOr[MailboxQuota] = js.undefined,
    MailboxSize: js.UndefOr[MailboxSize] = js.undefined
  ): GetMailboxDetailsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MailboxQuota)) __obj.updateDynamic("MailboxQuota")(MailboxQuota.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MailboxSize)) __obj.updateDynamic("MailboxSize")(MailboxSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMailboxDetailsResponse]
  }
}

