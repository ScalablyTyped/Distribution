package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailMessage extends js.Object {
  /**
    * The body of the email message.
    */
  var Body: js.UndefOr[string] = js.native
  /**
    * The email address to forward bounces and complaints to, if feedback forwarding is enabled.
    */
  var FeedbackForwardingAddress: js.UndefOr[string] = js.native
  /**
    * The verified email address to send the email message from. The default value is the FromAddress specified for the email channel.
    */
  var FromAddress: js.UndefOr[string] = js.native
  /**
    * The email message, represented as a raw MIME message.
    */
  var RawEmail: js.UndefOr[typings.awsSdk.pinpointMod.RawEmail] = js.native
  /**
    * The reply-to email address(es) for the email message. If a recipient replies to the email, each reply-to address receives the reply.
    */
  var ReplyToAddresses: js.UndefOr[ListOfString] = js.native
  /**
    * The email message, composed of a subject, a text part, and an HTML part.
    */
  var SimpleEmail: js.UndefOr[typings.awsSdk.pinpointMod.SimpleEmail] = js.native
  /**
    * The default message variables to use in the email message. You can override the default variables with individual address variables.
    */
  var Substitutions: js.UndefOr[MapOfListOfString] = js.native
}

object EmailMessage {
  @scala.inline
  def apply(): EmailMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailMessage]
  }
  @scala.inline
  implicit class EmailMessageOps[Self <: EmailMessage] (val x: Self) extends AnyVal {
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
    def setBody(value: string): Self = this.set("Body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("Body", js.undefined)
    @scala.inline
    def setFeedbackForwardingAddress(value: string): Self = this.set("FeedbackForwardingAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeedbackForwardingAddress: Self = this.set("FeedbackForwardingAddress", js.undefined)
    @scala.inline
    def setFromAddress(value: string): Self = this.set("FromAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromAddress: Self = this.set("FromAddress", js.undefined)
    @scala.inline
    def setRawEmail(value: RawEmail): Self = this.set("RawEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawEmail: Self = this.set("RawEmail", js.undefined)
    @scala.inline
    def setReplyToAddressesVarargs(value: string*): Self = this.set("ReplyToAddresses", js.Array(value :_*))
    @scala.inline
    def setReplyToAddresses(value: ListOfString): Self = this.set("ReplyToAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplyToAddresses: Self = this.set("ReplyToAddresses", js.undefined)
    @scala.inline
    def setSimpleEmail(value: SimpleEmail): Self = this.set("SimpleEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimpleEmail: Self = this.set("SimpleEmail", js.undefined)
    @scala.inline
    def setSubstitutions(value: MapOfListOfString): Self = this.set("Substitutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubstitutions: Self = this.set("Substitutions", js.undefined)
  }
  
}

