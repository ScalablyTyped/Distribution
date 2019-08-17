package typings.atAwsDashSdkClientDashSqsDashNode.typesUnderscoreSendMessageBatchRequestEntryMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashSqsDashNode.typesUnderscoreMessageAttributeValueMod._UnmarshalledMessageAttributeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledSendMessageBatchRequestEntry extends _SendMessageBatchRequestEntry {
  /**
    * <p>Each message attribute consists of a <code>Name</code>, <code>Type</code>, and <code>Value</code>. For more information, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html">Amazon SQS Message Attributes</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.</p>
    */
  @JSName("MessageAttributes")
  var MessageAttributes__UnmarshalledSendMessageBatchRequestEntry: js.UndefOr[StringDictionary[_UnmarshalledMessageAttributeValue]] = js.undefined
}

object _UnmarshalledSendMessageBatchRequestEntry {
  @scala.inline
  def apply(
    Id: String,
    MessageBody: String,
    DelaySeconds: Int | Double = null,
    MessageAttributes: StringDictionary[_UnmarshalledMessageAttributeValue] = null,
    MessageDeduplicationId: String = null,
    MessageGroupId: String = null
  ): _UnmarshalledSendMessageBatchRequestEntry = {
    val __obj = js.Dynamic.literal(Id = Id, MessageBody = MessageBody)
    if (DelaySeconds != null) __obj.updateDynamic("DelaySeconds")(DelaySeconds.asInstanceOf[js.Any])
    if (MessageAttributes != null) __obj.updateDynamic("MessageAttributes")(MessageAttributes)
    if (MessageDeduplicationId != null) __obj.updateDynamic("MessageDeduplicationId")(MessageDeduplicationId)
    if (MessageGroupId != null) __obj.updateDynamic("MessageGroupId")(MessageGroupId)
    __obj.asInstanceOf[_UnmarshalledSendMessageBatchRequestEntry]
  }
}

