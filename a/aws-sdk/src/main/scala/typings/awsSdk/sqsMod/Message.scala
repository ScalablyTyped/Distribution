package typings.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends js.Object {
  
  /**
    * A map of the attributes requested in  ReceiveMessage  to their respective values. Supported attributes:    ApproximateReceiveCount     ApproximateFirstReceiveTimestamp     MessageDeduplicationId     MessageGroupId     SenderId     SentTimestamp     SequenceNumber     ApproximateFirstReceiveTimestamp and SentTimestamp are each returned as an integer representing the epoch time in milliseconds.
    */
  var Attributes: js.UndefOr[MessageSystemAttributeMap] = js.native
  
  /**
    * The message's contents (not URL-encoded).
    */
  var Body: js.UndefOr[String] = js.native
  
  /**
    * An MD5 digest of the non-URL-encoded message body string.
    */
  var MD5OfBody: js.UndefOr[String] = js.native
  
  /**
    * An MD5 digest of the non-URL-encoded message attribute string. You can use this attribute to verify that Amazon SQS received the message correctly. Amazon SQS URL-decodes the message before creating the MD5 digest. For information about MD5, see RFC1321.
    */
  var MD5OfMessageAttributes: js.UndefOr[String] = js.native
  
  /**
    * Each message attribute consists of a Name, Type, and Value. For more information, see Amazon SQS Message Attributes in the Amazon Simple Queue Service Developer Guide.
    */
  var MessageAttributes: js.UndefOr[MessageBodyAttributeMap] = js.native
  
  /**
    * A unique identifier for the message. A MessageIdis considered unique across all AWS accounts for an extended period of time.
    */
  var MessageId: js.UndefOr[String] = js.native
  
  /**
    * An identifier associated with the act of receiving the message. A new receipt handle is returned every time you receive a message. When deleting a message, you provide the last received receipt handle to delete the message.
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
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttributes(value: MessageSystemAttributeMap): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    
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
    def setMessageAttributes(value: MessageBodyAttributeMap): Self = this.set("MessageAttributes", value.asInstanceOf[js.Any])
    
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
