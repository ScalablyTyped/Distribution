package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  /**
    * <p>A map of the attributes requested in <code>
    *                <a>ReceiveMessage</a>
    *             </code> to their respective values.
    *           Supported attributes:</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>ApproximateReceiveCount</code>
    *                </p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>ApproximateFirstReceiveTimestamp</code>
    *                </p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>MessageDeduplicationId</code>
    *                </p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>MessageGroupId</code>
    *                </p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>SenderId</code>
    *                </p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>SentTimestamp</code>
    *                </p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>SequenceNumber</code>
    *                </p>
    *             </li>
    *          </ul>
    *          <p>
    *             <code>ApproximateFirstReceiveTimestamp</code> and <code>SentTimestamp</code> are each returned as an integer representing the
    *         <a href="http://en.wikipedia.org/wiki/Unix_time">epoch time</a> in milliseconds.</p>
    */
  var Attributes: js.UndefOr[Record[String, String]] = js.undefined
  
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
    * <p>Each message attribute consists of a <code>Name</code>, <code>Type</code>,
    * and <code>Value</code>. For more information, see
    * <a href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-metadata.html#sqs-message-attributes">Amazon SQS
    * message attributes</a> in the <i>Amazon SQS Developer Guide</i>.</p>
    */
  var MessageAttributes: js.UndefOr[Record[String, MessageAttributeValue]] = js.undefined
  
  /**
    * <p>A unique identifier for the message. A <code>MessageId</code>is considered unique across all Amazon Web Services accounts for an extended period of time.</p>
    */
  var MessageId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>An identifier associated with the act of receiving the message. A new receipt handle is returned every time you receive a message. When deleting a message, you provide the last received receipt handle to delete the message.</p>
    */
  var ReceiptHandle: js.UndefOr[String] = js.undefined
}
object Message {
  
  inline def apply(): Message = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Record[String, String]): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setBody(value: String): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
    
    inline def setMD5OfBody(value: String): Self = StObject.set(x, "MD5OfBody", value.asInstanceOf[js.Any])
    
    inline def setMD5OfBodyUndefined: Self = StObject.set(x, "MD5OfBody", js.undefined)
    
    inline def setMD5OfMessageAttributes(value: String): Self = StObject.set(x, "MD5OfMessageAttributes", value.asInstanceOf[js.Any])
    
    inline def setMD5OfMessageAttributesUndefined: Self = StObject.set(x, "MD5OfMessageAttributes", js.undefined)
    
    inline def setMessageAttributes(value: Record[String, MessageAttributeValue]): Self = StObject.set(x, "MessageAttributes", value.asInstanceOf[js.Any])
    
    inline def setMessageAttributesUndefined: Self = StObject.set(x, "MessageAttributes", js.undefined)
    
    inline def setMessageId(value: String): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "MessageId", js.undefined)
    
    inline def setReceiptHandle(value: String): Self = StObject.set(x, "ReceiptHandle", value.asInstanceOf[js.Any])
    
    inline def setReceiptHandleUndefined: Self = StObject.set(x, "ReceiptHandle", js.undefined)
  }
}
