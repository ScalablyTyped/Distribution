package typings.awsSdk2Types.clientsSqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  /**
    * A map of the attributes requested in  ReceiveMessage  to their respective values. Supported attributes:    ApproximateReceiveCount     ApproximateFirstReceiveTimestamp     MessageDeduplicationId     MessageGroupId     SenderId     SentTimestamp     SequenceNumber     ApproximateFirstReceiveTimestamp and SentTimestamp are each returned as an integer representing the epoch time in milliseconds.
    */
  var Attributes: js.UndefOr[MessageSystemAttributeMap] = js.undefined
  
  /**
    * The message's contents (not URL-encoded).
    */
  var Body: js.UndefOr[String] = js.undefined
  
  /**
    * An MD5 digest of the non-URL-encoded message body string.
    */
  var MD5OfBody: js.UndefOr[String] = js.undefined
  
  /**
    * An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For information about MD5, see RFC1321.
    */
  var MD5OfMessageAttributes: js.UndefOr[String] = js.undefined
  
  /**
    * Each message attribute consists of a Name, Type, and Value. For more information, see Amazon SQS message attributes in the Amazon SQS Developer Guide.
    */
  var MessageAttributes: js.UndefOr[MessageBodyAttributeMap] = js.undefined
  
  /**
    * A unique identifier for the message. A MessageIdis considered unique across all Amazon Web Services accounts for an extended period of time.
    */
  var MessageId: js.UndefOr[String] = js.undefined
  
  /**
    * An identifier associated with the act of receiving the message. A new receipt handle is returned every time you receive a message. When deleting a message, you provide the last received receipt handle to delete the message.
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
    
    inline def setAttributes(value: MessageSystemAttributeMap): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setBody(value: String): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
    
    inline def setMD5OfBody(value: String): Self = StObject.set(x, "MD5OfBody", value.asInstanceOf[js.Any])
    
    inline def setMD5OfBodyUndefined: Self = StObject.set(x, "MD5OfBody", js.undefined)
    
    inline def setMD5OfMessageAttributes(value: String): Self = StObject.set(x, "MD5OfMessageAttributes", value.asInstanceOf[js.Any])
    
    inline def setMD5OfMessageAttributesUndefined: Self = StObject.set(x, "MD5OfMessageAttributes", js.undefined)
    
    inline def setMessageAttributes(value: MessageBodyAttributeMap): Self = StObject.set(x, "MessageAttributes", value.asInstanceOf[js.Any])
    
    inline def setMessageAttributesUndefined: Self = StObject.set(x, "MessageAttributes", js.undefined)
    
    inline def setMessageId(value: String): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "MessageId", js.undefined)
    
    inline def setReceiptHandle(value: String): Self = StObject.set(x, "ReceiptHandle", value.asInstanceOf[js.Any])
    
    inline def setReceiptHandleUndefined: Self = StObject.set(x, "ReceiptHandle", js.undefined)
  }
}
