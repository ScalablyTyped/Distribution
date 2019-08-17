package typings.atAwsDashSdkClientDashSqsDashNode.typesSendMessageOutputMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendMessageOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For information about MD5, see <a href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.</p>
    */
  var MD5OfMessageAttributes: js.UndefOr[String] = js.undefined
  /**
    * <p>An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For information about MD5, see <a href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.</p>
    */
  var MD5OfMessageBody: js.UndefOr[String] = js.undefined
  /**
    * <p>An attribute containing the <code>MessageId</code> of the message sent to the queue. For more information, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-message-identifiers.html">Queue and Message Identifiers</a> in the <i>Amazon Simple Queue Service Developer Guide</i>. </p>
    */
  var MessageId: js.UndefOr[String] = js.undefined
  /**
    * <p>This parameter applies only to FIFO (first-in-first-out) queues.</p> <p>The large, non-consecutive number that Amazon SQS assigns to each message.</p> <p>The length of <code>SequenceNumber</code> is 128 bits. <code>SequenceNumber</code> continues to increase for a particular <code>MessageGroupId</code>.</p>
    */
  var SequenceNumber: js.UndefOr[String] = js.undefined
}

object SendMessageOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    MD5OfMessageAttributes: String = null,
    MD5OfMessageBody: String = null,
    MessageId: String = null,
    SequenceNumber: String = null
  ): SendMessageOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (MD5OfMessageAttributes != null) __obj.updateDynamic("MD5OfMessageAttributes")(MD5OfMessageAttributes)
    if (MD5OfMessageBody != null) __obj.updateDynamic("MD5OfMessageBody")(MD5OfMessageBody)
    if (MessageId != null) __obj.updateDynamic("MessageId")(MessageId)
    if (SequenceNumber != null) __obj.updateDynamic("SequenceNumber")(SequenceNumber)
    __obj.asInstanceOf[SendMessageOutput]
  }
}

