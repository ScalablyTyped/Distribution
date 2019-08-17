package typings.atAwsDashSdkClientDashSqsDashNode.typesUnderscoreMessageMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.ApproximateFirstReceiveTimestamp
import typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.ApproximateReceiveCount
import typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.MessageDeduplicationId
import typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.MessageGroupId
import typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.SenderId
import typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.SentTimestamp
import typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.SequenceNumber
import typings.atAwsDashSdkClientDashSqsDashNode.typesUnderscoreMessageAttributeValueMod._MessageAttributeValue
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Message extends js.Object {
  /**
    * <p>A map of the attributes requested in <code> <a>ReceiveMessage</a> </code> to their respective values. Supported attributes:</p> <ul> <li> <p> <code>ApproximateReceiveCount</code> </p> </li> <li> <p> <code>ApproximateFirstReceiveTimestamp</code> </p> </li> <li> <p> <code>MessageDeduplicationId</code> </p> </li> <li> <p> <code>MessageGroupId</code> </p> </li> <li> <p> <code>SenderId</code> </p> </li> <li> <p> <code>SentTimestamp</code> </p> </li> <li> <p> <code>SequenceNumber</code> </p> </li> </ul> <p> <code>ApproximateFirstReceiveTimestamp</code> and <code>SentTimestamp</code> are each returned as an integer representing the <a href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds.</p>
    */
  var Attributes: js.UndefOr[
    (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in 'SenderId' | 'SentTimestamp' | 'ApproximateReceiveCount' | 'ApproximateFirstReceiveTimestamp' | 'SequenceNumber' | 'MessageDeduplicationId' | 'MessageGroupId' | string ]: string}
    */ typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings._Message with js.Any) | (Iterable[
      js.Tuple2[
        SenderId | SentTimestamp | ApproximateReceiveCount | ApproximateFirstReceiveTimestamp | SequenceNumber | MessageDeduplicationId | MessageGroupId | String, 
        String
      ]
    ])
  ] = js.undefined
  /**
    * <p>The message's contents (not URL-encoded).</p>
    */
  var Body: js.UndefOr[String] = js.undefined
  /**
    * <p>An MD5 digest of the non-URL-encoded message body string.</p>
    */
  var MD5OfBody: js.UndefOr[String] = js.undefined
  /**
    * <p>An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For information about MD5, see <a href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.</p>
    */
  var MD5OfMessageAttributes: js.UndefOr[String] = js.undefined
  /**
    * <p>Each message attribute consists of a <code>Name</code>, <code>Type</code>, and <code>Value</code>. For more information, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html">Amazon SQS Message Attributes</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.</p>
    */
  var MessageAttributes: js.UndefOr[
    StringDictionary[_MessageAttributeValue] | (Iterable[js.Tuple2[String, _MessageAttributeValue]])
  ] = js.undefined
  /**
    * <p>A unique identifier for the message. A <code>MessageId</code>is considered unique across all AWS accounts for an extended period of time.</p>
    */
  var MessageId: js.UndefOr[String] = js.undefined
  /**
    * <p>An identifier associated with the act of receiving the message. A new receipt handle is returned every time you receive a message. When deleting a message, you provide the last received receipt handle to delete the message.</p>
    */
  var ReceiptHandle: js.UndefOr[String] = js.undefined
}

object _Message {
  @scala.inline
  def apply(
    Attributes: (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in 'SenderId' | 'SentTimestamp' | 'ApproximateReceiveCount' | 'ApproximateFirstReceiveTimestamp' | 'SequenceNumber' | 'MessageDeduplicationId' | 'MessageGroupId' | string ]: string}
    */ typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings._Message with js.Any) | (Iterable[
      js.Tuple2[
        SenderId | SentTimestamp | ApproximateReceiveCount | ApproximateFirstReceiveTimestamp | SequenceNumber | MessageDeduplicationId | MessageGroupId | String, 
        String
      ]
    ]) = null,
    Body: String = null,
    MD5OfBody: String = null,
    MD5OfMessageAttributes: String = null,
    MessageAttributes: StringDictionary[_MessageAttributeValue] | (Iterable[js.Tuple2[String, _MessageAttributeValue]]) = null,
    MessageId: String = null,
    ReceiptHandle: String = null
  ): _Message = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (Body != null) __obj.updateDynamic("Body")(Body)
    if (MD5OfBody != null) __obj.updateDynamic("MD5OfBody")(MD5OfBody)
    if (MD5OfMessageAttributes != null) __obj.updateDynamic("MD5OfMessageAttributes")(MD5OfMessageAttributes)
    if (MessageAttributes != null) __obj.updateDynamic("MessageAttributes")(MessageAttributes.asInstanceOf[js.Any])
    if (MessageId != null) __obj.updateDynamic("MessageId")(MessageId)
    if (ReceiptHandle != null) __obj.updateDynamic("ReceiptHandle")(ReceiptHandle)
    __obj.asInstanceOf[_Message]
  }
}

