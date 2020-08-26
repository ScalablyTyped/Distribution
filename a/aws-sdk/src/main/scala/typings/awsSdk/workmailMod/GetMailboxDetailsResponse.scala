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
  def apply(): GetMailboxDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMailboxDetailsResponse]
  }
  @scala.inline
  implicit class GetMailboxDetailsResponseOps[Self <: GetMailboxDetailsResponse] (val x: Self) extends AnyVal {
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
    def setMailboxQuota(value: MailboxQuota): Self = this.set("MailboxQuota", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMailboxQuota: Self = this.set("MailboxQuota", js.undefined)
    @scala.inline
    def setMailboxSize(value: MailboxSize): Self = this.set("MailboxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMailboxSize: Self = this.set("MailboxSize", js.undefined)
  }
  
}

