package typings.awsSdk.sqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMessageRequest extends StObject {
  
  /**
    * The URL of the Amazon SQS queue from which messages are deleted. Queue URLs and names are case-sensitive.
    */
  var QueueUrl: String
  
  /**
    * The receipt handle associated with the message to delete.
    */
  var ReceiptHandle: String
}
object DeleteMessageRequest {
  
  @scala.inline
  def apply(QueueUrl: String, ReceiptHandle: String): DeleteMessageRequest = {
    val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any], ReceiptHandle = ReceiptHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMessageRequest]
  }
  
  @scala.inline
  implicit class DeleteMessageRequestMutableBuilder[Self <: DeleteMessageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiptHandle(value: String): Self = StObject.set(x, "ReceiptHandle", value.asInstanceOf[js.Any])
  }
}
