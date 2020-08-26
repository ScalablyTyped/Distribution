package typings.awsSdkClientSqsNode.typesSendMessageBatchResultEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendMessageBatchResultEntry extends js.Object {
  /**
    * <p>An identifier for the message in this batch.</p>
    */
  var Id: String = js.native
  /**
    * <p>An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For information about MD5, see <a href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.</p>
    */
  var MD5OfMessageAttributes: js.UndefOr[String] = js.native
  /**
    * <p>An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For information about MD5, see <a href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.</p>
    */
  var MD5OfMessageBody: String = js.native
  /**
    * <p>An identifier for the message.</p>
    */
  var MessageId: String = js.native
  /**
    * <p>This parameter applies only to FIFO (first-in-first-out) queues.</p> <p>The large, non-consecutive number that Amazon SQS assigns to each message.</p> <p>The length of <code>SequenceNumber</code> is 128 bits. As <code>SequenceNumber</code> continues to increase for a particular <code>MessageGroupId</code>.</p>
    */
  var SequenceNumber: js.UndefOr[String] = js.native
}

object SendMessageBatchResultEntry {
  @scala.inline
  def apply(Id: String, MD5OfMessageBody: String, MessageId: String): SendMessageBatchResultEntry = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], MD5OfMessageBody = MD5OfMessageBody.asInstanceOf[js.Any], MessageId = MessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessageBatchResultEntry]
  }
  @scala.inline
  implicit class SendMessageBatchResultEntryOps[Self <: SendMessageBatchResultEntry] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMD5OfMessageBody(value: String): Self = this.set("MD5OfMessageBody", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageId(value: String): Self = this.set("MessageId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMD5OfMessageAttributes(value: String): Self = this.set("MD5OfMessageAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMD5OfMessageAttributes: Self = this.set("MD5OfMessageAttributes", js.undefined)
    @scala.inline
    def setSequenceNumber(value: String): Self = this.set("SequenceNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSequenceNumber: Self = this.set("SequenceNumber", js.undefined)
  }
  
}

