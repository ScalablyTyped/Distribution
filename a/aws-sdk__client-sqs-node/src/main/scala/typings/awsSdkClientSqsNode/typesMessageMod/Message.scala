package typings.awsSdkClientSqsNode.typesMessageMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.ApproximateFirstReceiveTimestamp
import typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.ApproximateReceiveCount
import typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.MessageDeduplicationId
import typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.MessageGroupId
import typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.SenderId
import typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.SentTimestamp
import typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.SequenceNumber
import typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings._Message
import typings.awsSdkClientSqsNode.typesMessageAttributeValueMod.MessageAttributeValue
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends js.Object {
  
  /**
    * <p>A map of the attributes requested in <code> <a>ReceiveMessage</a> </code> to their respective values. Supported attributes:</p> <ul> <li> <p> <code>ApproximateReceiveCount</code> </p> </li> <li> <p> <code>ApproximateFirstReceiveTimestamp</code> </p> </li> <li> <p> <code>MessageDeduplicationId</code> </p> </li> <li> <p> <code>MessageGroupId</code> </p> </li> <li> <p> <code>SenderId</code> </p> </li> <li> <p> <code>SentTimestamp</code> </p> </li> <li> <p> <code>SequenceNumber</code> </p> </li> </ul> <p> <code>ApproximateFirstReceiveTimestamp</code> and <code>SentTimestamp</code> are each returned as an integer representing the <a href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds.</p>
    */
  var Attributes: js.UndefOr[
    (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in 'SenderId' | 'SentTimestamp' | 'ApproximateReceiveCount' | 'ApproximateFirstReceiveTimestamp' | 'SequenceNumber' | 'MessageDeduplicationId' | 'MessageGroupId' | string ]: string}
    */ _Message with TopLevel[js.Any]) | (Iterable[
      js.Tuple2[
        SenderId | SentTimestamp | ApproximateReceiveCount | ApproximateFirstReceiveTimestamp | SequenceNumber | MessageDeduplicationId | MessageGroupId | String, 
        String
      ]
    ])
  ] = js.native
  
  /**
    * <p>The message's contents (not URL-encoded).</p>
    */
  var Body: js.UndefOr[String] = js.native
  
  /**
    * <p>An MD5 digest of the non-URL-encoded message body string.</p>
    */
  var MD5OfBody: js.UndefOr[String] = js.native
  
  /**
    * <p>An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For information about MD5, see <a href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.</p>
    */
  var MD5OfMessageAttributes: js.UndefOr[String] = js.native
  
  /**
    * <p>Each message attribute consists of a <code>Name</code>, <code>Type</code>, and <code>Value</code>. For more information, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html">Amazon SQS Message Attributes</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.</p>
    */
  var MessageAttributes: js.UndefOr[
    StringDictionary[MessageAttributeValue] | (Iterable[js.Tuple2[String, MessageAttributeValue]])
  ] = js.native
  
  /**
    * <p>A unique identifier for the message. A <code>MessageId</code>is considered unique across all AWS accounts for an extended period of time.</p>
    */
  var MessageId: js.UndefOr[String] = js.native
  
  /**
    * <p>An identifier associated with the act of receiving the message. A new receipt handle is returned every time you receive a message. When deleting a message, you provide the last received receipt handle to delete the message.</p>
    */
  var ReceiptHandle: js.UndefOr[String] = js.native
}
object Message {
  
  @scala.inline
  def apply(): Message = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
    
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
    def setAttributes(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in 'SenderId' | 'SentTimestamp' | 'ApproximateReceiveCount' | 'ApproximateFirstReceiveTimestamp' | 'SequenceNumber' | 'MessageDeduplicationId' | 'MessageGroupId' | string ]: string}
      */ _Message with TopLevel[js.Any]) | (Iterable[
          js.Tuple2[
            SenderId | SentTimestamp | ApproximateReceiveCount | ApproximateFirstReceiveTimestamp | SequenceNumber | MessageDeduplicationId | MessageGroupId | String, 
            String
          ]
        ])
    ): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
    
    @scala.inline
    def setBody(value: String): Self = this.set("Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("Body", js.undefined)
    
    @scala.inline
    def setMD5OfBody(value: String): Self = this.set("MD5OfBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMD5OfBody: Self = this.set("MD5OfBody", js.undefined)
    
    @scala.inline
    def setMD5OfMessageAttributes(value: String): Self = this.set("MD5OfMessageAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMD5OfMessageAttributes: Self = this.set("MD5OfMessageAttributes", js.undefined)
    
    @scala.inline
    def setMessageAttributes(
      value: StringDictionary[MessageAttributeValue] | (Iterable[js.Tuple2[String, MessageAttributeValue]])
    ): Self = this.set("MessageAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageAttributes: Self = this.set("MessageAttributes", js.undefined)
    
    @scala.inline
    def setMessageId(value: String): Self = this.set("MessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageId: Self = this.set("MessageId", js.undefined)
    
    @scala.inline
    def setReceiptHandle(value: String): Self = this.set("ReceiptHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceiptHandle: Self = this.set("ReceiptHandle", js.undefined)
  }
}
