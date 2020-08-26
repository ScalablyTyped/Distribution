package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendBounceRequest extends js.Object {
  /**
    * The address to use in the "From" header of the bounce message. This must be an identity that you have verified with Amazon SES.
    */
  var BounceSender: Address = js.native
  /**
    * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to use the address in the "From" header of the bounce. For more information about sending authorization, see the Amazon SES Developer Guide.
    */
  var BounceSenderArn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * A list of recipients of the bounced message, including the information required to create the Delivery Status Notifications (DSNs) for the recipients. You must specify at least one BouncedRecipientInfo in the list.
    */
  var BouncedRecipientInfoList: typings.awsSdk.sesMod.BouncedRecipientInfoList = js.native
  /**
    * Human-readable text for the bounce message to explain the failure. If not specified, the text will be auto-generated based on the bounced recipient information.
    */
  var Explanation: js.UndefOr[typings.awsSdk.sesMod.Explanation] = js.native
  /**
    * Message-related DSN fields. If not specified, Amazon SES will choose the values.
    */
  var MessageDsn: js.UndefOr[typings.awsSdk.sesMod.MessageDsn] = js.native
  /**
    * The message ID of the message to be bounced.
    */
  var OriginalMessageId: MessageId = js.native
}

object SendBounceRequest {
  @scala.inline
  def apply(
    BounceSender: Address,
    BouncedRecipientInfoList: BouncedRecipientInfoList,
    OriginalMessageId: MessageId
  ): SendBounceRequest = {
    val __obj = js.Dynamic.literal(BounceSender = BounceSender.asInstanceOf[js.Any], BouncedRecipientInfoList = BouncedRecipientInfoList.asInstanceOf[js.Any], OriginalMessageId = OriginalMessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendBounceRequest]
  }
  @scala.inline
  implicit class SendBounceRequestOps[Self <: SendBounceRequest] (val x: Self) extends AnyVal {
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
    def setBounceSender(value: Address): Self = this.set("BounceSender", value.asInstanceOf[js.Any])
    @scala.inline
    def setBouncedRecipientInfoListVarargs(value: BouncedRecipientInfo*): Self = this.set("BouncedRecipientInfoList", js.Array(value :_*))
    @scala.inline
    def setBouncedRecipientInfoList(value: BouncedRecipientInfoList): Self = this.set("BouncedRecipientInfoList", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalMessageId(value: MessageId): Self = this.set("OriginalMessageId", value.asInstanceOf[js.Any])
    @scala.inline
    def setBounceSenderArn(value: AmazonResourceName): Self = this.set("BounceSenderArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounceSenderArn: Self = this.set("BounceSenderArn", js.undefined)
    @scala.inline
    def setExplanation(value: Explanation): Self = this.set("Explanation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExplanation: Self = this.set("Explanation", js.undefined)
    @scala.inline
    def setMessageDsn(value: MessageDsn): Self = this.set("MessageDsn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageDsn: Self = this.set("MessageDsn", js.undefined)
  }
  
}

