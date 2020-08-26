package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuppressedDestinationAttributes extends js.Object {
  /**
    * A unique identifier that's generated when an email address is added to the suppression list for your account.
    */
  var FeedbackId: js.UndefOr[typings.awsSdk.sesv2Mod.FeedbackId] = js.native
  /**
    * The unique identifier of the email message that caused the email address to be added to the suppression list for your account.
    */
  var MessageId: js.UndefOr[OutboundMessageId] = js.native
}

object SuppressedDestinationAttributes {
  @scala.inline
  def apply(): SuppressedDestinationAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuppressedDestinationAttributes]
  }
  @scala.inline
  implicit class SuppressedDestinationAttributesOps[Self <: SuppressedDestinationAttributes] (val x: Self) extends AnyVal {
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
    def setFeedbackId(value: FeedbackId): Self = this.set("FeedbackId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeedbackId: Self = this.set("FeedbackId", js.undefined)
    @scala.inline
    def setMessageId(value: OutboundMessageId): Self = this.set("MessageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageId: Self = this.set("MessageId", js.undefined)
  }
  
}

