package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishResponse extends StObject {
  
  /**
    * Unique identifier assigned to the published message. Length Constraint: Maximum 100 characters
    */
  var MessageId: js.UndefOr[messageId] = js.undefined
  
  /**
    * This response element applies only to FIFO (first-in-first-out) topics.  The sequence number is a large, non-consecutive number that Amazon SNS assigns to each message. The length of SequenceNumber is 128 bits. SequenceNumber continues to increase for each MessageGroupId.
    */
  var SequenceNumber: js.UndefOr[String] = js.undefined
}
object PublishResponse {
  
  @scala.inline
  def apply(): PublishResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishResponse]
  }
  
  @scala.inline
  implicit class PublishResponseMutableBuilder[Self <: PublishResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageId(value: messageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageIdUndefined: Self = StObject.set(x, "MessageId", js.undefined)
    
    @scala.inline
    def setSequenceNumber(value: String): Self = StObject.set(x, "SequenceNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceNumberUndefined: Self = StObject.set(x, "SequenceNumber", js.undefined)
  }
}
