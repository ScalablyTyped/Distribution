package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendMessageBatchRequest extends StObject {
  
  /**
    * <p>A list of <code>
    *                <a>SendMessageBatchRequestEntry</a>
    *             </code> items.</p>
    */
  var Entries: js.UndefOr[js.Array[SendMessageBatchRequestEntry]] = js.undefined
  
  /**
    * <p>The URL of the Amazon SQS queue to which batched messages are sent.</p>
    *          <p>Queue URLs and names are case-sensitive.</p>
    */
  var QueueUrl: js.UndefOr[String] = js.undefined
}
object SendMessageBatchRequest {
  
  inline def apply(): SendMessageBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendMessageBatchRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendMessageBatchRequest] (val x: Self) extends AnyVal {
    
    inline def setEntries(value: js.Array[SendMessageBatchRequestEntry]): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "Entries", js.undefined)
    
    inline def setEntriesVarargs(value: SendMessageBatchRequestEntry*): Self = StObject.set(x, "Entries", js.Array(value*))
    
    inline def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
    
    inline def setQueueUrlUndefined: Self = StObject.set(x, "QueueUrl", js.undefined)
  }
}
