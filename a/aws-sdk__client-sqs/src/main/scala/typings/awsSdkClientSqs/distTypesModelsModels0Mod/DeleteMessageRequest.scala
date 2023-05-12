package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMessageRequest extends StObject {
  
  /**
    * <p>The URL of the Amazon SQS queue from which messages are deleted.</p>
    *          <p>Queue URLs and names are case-sensitive.</p>
    */
  var QueueUrl: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The receipt handle associated with the message to delete.</p>
    */
  var ReceiptHandle: js.UndefOr[String] = js.undefined
}
object DeleteMessageRequest {
  
  inline def apply(): DeleteMessageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteMessageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteMessageRequest] (val x: Self) extends AnyVal {
    
    inline def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
    
    inline def setQueueUrlUndefined: Self = StObject.set(x, "QueueUrl", js.undefined)
    
    inline def setReceiptHandle(value: String): Self = StObject.set(x, "ReceiptHandle", value.asInstanceOf[js.Any])
    
    inline def setReceiptHandleUndefined: Self = StObject.set(x, "ReceiptHandle", js.undefined)
  }
}
