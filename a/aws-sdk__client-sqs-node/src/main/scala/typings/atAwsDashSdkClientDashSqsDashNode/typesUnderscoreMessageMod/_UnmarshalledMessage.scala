package typings.atAwsDashSdkClientDashSqsDashNode.typesUnderscoreMessageMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashSqsDashNode.typesUnderscoreMessageAttributeValueMod._UnmarshalledMessageAttributeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledMessage extends _Message {
  /**
    * <p>A map of the attributes requested in <code> <a>ReceiveMessage</a> </code> to their respective values. Supported attributes:</p> <ul> <li> <p> <code>ApproximateReceiveCount</code> </p> </li> <li> <p> <code>ApproximateFirstReceiveTimestamp</code> </p> </li> <li> <p> <code>MessageDeduplicationId</code> </p> </li> <li> <p> <code>MessageGroupId</code> </p> </li> <li> <p> <code>SenderId</code> </p> </li> <li> <p> <code>SentTimestamp</code> </p> </li> <li> <p> <code>SequenceNumber</code> </p> </li> </ul> <p> <code>ApproximateFirstReceiveTimestamp</code> and <code>SentTimestamp</code> are each returned as an integer representing the <a href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds.</p>
    */
  @JSName("Attributes")
  var Attributes__UnmarshalledMessage: js.UndefOr[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in 'SenderId' | 'SentTimestamp' | 'ApproximateReceiveCount' | 'ApproximateFirstReceiveTimestamp' | 'SequenceNumber' | 'MessageDeduplicationId' | 'MessageGroupId' | string ]: string}
    */ typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings._UnmarshalledMessage with js.Any
  ] = js.undefined
  /**
    * <p>Each message attribute consists of a <code>Name</code>, <code>Type</code>, and <code>Value</code>. For more information, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html">Amazon SQS Message Attributes</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.</p>
    */
  @JSName("MessageAttributes")
  var MessageAttributes__UnmarshalledMessage: js.UndefOr[StringDictionary[_UnmarshalledMessageAttributeValue]] = js.undefined
}

object _UnmarshalledMessage {
  @scala.inline
  def apply(
    Attributes: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in 'SenderId' | 'SentTimestamp' | 'ApproximateReceiveCount' | 'ApproximateFirstReceiveTimestamp' | 'SequenceNumber' | 'MessageDeduplicationId' | 'MessageGroupId' | string ]: string}
    */ typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings._UnmarshalledMessage with js.Any = null,
    Body: String = null,
    MD5OfBody: String = null,
    MD5OfMessageAttributes: String = null,
    MessageAttributes: StringDictionary[_UnmarshalledMessageAttributeValue] = null,
    MessageId: String = null,
    ReceiptHandle: String = null
  ): _UnmarshalledMessage = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (Body != null) __obj.updateDynamic("Body")(Body)
    if (MD5OfBody != null) __obj.updateDynamic("MD5OfBody")(MD5OfBody)
    if (MD5OfMessageAttributes != null) __obj.updateDynamic("MD5OfMessageAttributes")(MD5OfMessageAttributes)
    if (MessageAttributes != null) __obj.updateDynamic("MessageAttributes")(MessageAttributes)
    if (MessageId != null) __obj.updateDynamic("MessageId")(MessageId)
    if (ReceiptHandle != null) __obj.updateDynamic("ReceiptHandle")(ReceiptHandle)
    __obj.asInstanceOf[_UnmarshalledMessage]
  }
}

