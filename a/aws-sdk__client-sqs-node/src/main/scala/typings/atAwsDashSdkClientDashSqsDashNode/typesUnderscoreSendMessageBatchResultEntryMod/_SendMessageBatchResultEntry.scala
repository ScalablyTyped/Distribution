package typings.atAwsDashSdkClientDashSqsDashNode.typesUnderscoreSendMessageBatchResultEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SendMessageBatchResultEntry extends js.Object {
  /**
    * <p>An identifier for the message in this batch.</p>
    */
  var Id: String
  /**
    * <p>An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For information about MD5, see <a href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.</p>
    */
  var MD5OfMessageAttributes: js.UndefOr[String] = js.undefined
  /**
    * <p>An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For information about MD5, see <a href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.</p>
    */
  var MD5OfMessageBody: String
  /**
    * <p>An identifier for the message.</p>
    */
  var MessageId: String
  /**
    * <p>This parameter applies only to FIFO (first-in-first-out) queues.</p> <p>The large, non-consecutive number that Amazon SQS assigns to each message.</p> <p>The length of <code>SequenceNumber</code> is 128 bits. As <code>SequenceNumber</code> continues to increase for a particular <code>MessageGroupId</code>.</p>
    */
  var SequenceNumber: js.UndefOr[String] = js.undefined
}

object _SendMessageBatchResultEntry {
  @scala.inline
  def apply(
    Id: String,
    MD5OfMessageBody: String,
    MessageId: String,
    MD5OfMessageAttributes: String = null,
    SequenceNumber: String = null
  ): _SendMessageBatchResultEntry = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], MD5OfMessageBody = MD5OfMessageBody.asInstanceOf[js.Any], MessageId = MessageId.asInstanceOf[js.Any])
    if (MD5OfMessageAttributes != null) __obj.updateDynamic("MD5OfMessageAttributes")(MD5OfMessageAttributes.asInstanceOf[js.Any])
    if (SequenceNumber != null) __obj.updateDynamic("SequenceNumber")(SequenceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SendMessageBatchResultEntry]
  }
}

