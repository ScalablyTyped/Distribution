package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendMessageResult extends StObject {
  
  /**
    * <p>An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For information about MD5, see <a href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.</p>
    */
  var MD5OfMessageAttributes: js.UndefOr[String] = js.undefined
  
  /**
    * <p>An MD5 digest of the non-URL-encoded message body string. You can use this attribute to verify that Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For information about MD5, see <a href="https://www.ietf.org/rfc/rfc1321.txt">RFC1321</a>.</p>
    */
  var MD5OfMessageBody: js.UndefOr[String] = js.undefined
  
  /**
    * <p>An MD5 digest of the non-URL-encoded message system attribute string. You can use this
    * attribute to verify that Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest.</p>
    */
  var MD5OfMessageSystemAttributes: js.UndefOr[String] = js.undefined
  
  /**
    * <p>An attribute containing the <code>MessageId</code> of the message sent to the queue. For more information, see <a href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-message-identifiers.html">Queue and Message Identifiers</a>
    *             in the <i>Amazon SQS Developer Guide</i>.
    *     </p>
    */
  var MessageId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>This parameter applies only to FIFO (first-in-first-out) queues.</p>
    *          <p>The large, non-consecutive number that Amazon SQS assigns to each message.</p>
    *          <p>The length of <code>SequenceNumber</code> is 128 bits. <code>SequenceNumber</code> continues to increase for a particular <code>MessageGroupId</code>.</p>
    */
  var SequenceNumber: js.UndefOr[String] = js.undefined
}
object SendMessageResult {
  
  inline def apply(): SendMessageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendMessageResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendMessageResult] (val x: Self) extends AnyVal {
    
    inline def setMD5OfMessageAttributes(value: String): Self = StObject.set(x, "MD5OfMessageAttributes", value.asInstanceOf[js.Any])
    
    inline def setMD5OfMessageAttributesUndefined: Self = StObject.set(x, "MD5OfMessageAttributes", js.undefined)
    
    inline def setMD5OfMessageBody(value: String): Self = StObject.set(x, "MD5OfMessageBody", value.asInstanceOf[js.Any])
    
    inline def setMD5OfMessageBodyUndefined: Self = StObject.set(x, "MD5OfMessageBody", js.undefined)
    
    inline def setMD5OfMessageSystemAttributes(value: String): Self = StObject.set(x, "MD5OfMessageSystemAttributes", value.asInstanceOf[js.Any])
    
    inline def setMD5OfMessageSystemAttributesUndefined: Self = StObject.set(x, "MD5OfMessageSystemAttributes", js.undefined)
    
    inline def setMessageId(value: String): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "MessageId", js.undefined)
    
    inline def setSequenceNumber(value: String): Self = StObject.set(x, "SequenceNumber", value.asInstanceOf[js.Any])
    
    inline def setSequenceNumberUndefined: Self = StObject.set(x, "SequenceNumber", js.undefined)
  }
}
