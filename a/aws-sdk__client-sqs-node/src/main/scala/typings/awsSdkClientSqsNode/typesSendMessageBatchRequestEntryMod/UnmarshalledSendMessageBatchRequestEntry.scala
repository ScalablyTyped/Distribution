package typings.awsSdkClientSqsNode.typesSendMessageBatchRequestEntryMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientSqsNode.typesMessageAttributeValueMod.UnmarshalledMessageAttributeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledSendMessageBatchRequestEntry extends SendMessageBatchRequestEntry {
  /**
    * <p>Each message attribute consists of a <code>Name</code>, <code>Type</code>, and <code>Value</code>. For more information, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html">Amazon SQS Message Attributes</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.</p>
    */
  @JSName("MessageAttributes")
  var MessageAttributes_UnmarshalledSendMessageBatchRequestEntry: js.UndefOr[StringDictionary[UnmarshalledMessageAttributeValue]] = js.undefined
}

object UnmarshalledSendMessageBatchRequestEntry {
  @scala.inline
  def apply(
    Id: String,
    MessageBody: String,
    DelaySeconds: Int | Double = null,
    MessageAttributes: StringDictionary[UnmarshalledMessageAttributeValue] = null,
    MessageDeduplicationId: String = null,
    MessageGroupId: String = null
  ): UnmarshalledSendMessageBatchRequestEntry = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], MessageBody = MessageBody.asInstanceOf[js.Any])
    if (DelaySeconds != null) __obj.updateDynamic("DelaySeconds")(DelaySeconds.asInstanceOf[js.Any])
    if (MessageAttributes != null) __obj.updateDynamic("MessageAttributes")(MessageAttributes.asInstanceOf[js.Any])
    if (MessageDeduplicationId != null) __obj.updateDynamic("MessageDeduplicationId")(MessageDeduplicationId.asInstanceOf[js.Any])
    if (MessageGroupId != null) __obj.updateDynamic("MessageGroupId")(MessageGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSendMessageBatchRequestEntry]
  }
}

