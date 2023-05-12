package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMessageBatchRequest extends StObject {
  
  /**
    * <p>A list of receipt handles for the messages to be deleted.</p>
    */
  var Entries: js.UndefOr[js.Array[DeleteMessageBatchRequestEntry]] = js.undefined
  
  /**
    * <p>The URL of the Amazon SQS queue from which messages are deleted.</p>
    *          <p>Queue URLs and names are case-sensitive.</p>
    */
  var QueueUrl: js.UndefOr[String] = js.undefined
}
object DeleteMessageBatchRequest {
  
  inline def apply(): DeleteMessageBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteMessageBatchRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteMessageBatchRequest] (val x: Self) extends AnyVal {
    
    inline def setEntries(value: js.Array[DeleteMessageBatchRequestEntry]): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "Entries", js.undefined)
    
    inline def setEntriesVarargs(value: DeleteMessageBatchRequestEntry*): Self = StObject.set(x, "Entries", js.Array(value*))
    
    inline def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
    
    inline def setQueueUrlUndefined: Self = StObject.set(x, "QueueUrl", js.undefined)
  }
}
