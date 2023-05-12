package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeMessageVisibilityBatchRequest extends StObject {
  
  /**
    * <p>A list of receipt handles of the messages for which the visibility timeout must be changed.</p>
    */
  var Entries: js.UndefOr[js.Array[ChangeMessageVisibilityBatchRequestEntry]] = js.undefined
  
  /**
    * <p>The URL of the Amazon SQS queue whose messages' visibility is changed.</p>
    *          <p>Queue URLs and names are case-sensitive.</p>
    */
  var QueueUrl: js.UndefOr[String] = js.undefined
}
object ChangeMessageVisibilityBatchRequest {
  
  inline def apply(): ChangeMessageVisibilityBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeMessageVisibilityBatchRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeMessageVisibilityBatchRequest] (val x: Self) extends AnyVal {
    
    inline def setEntries(value: js.Array[ChangeMessageVisibilityBatchRequestEntry]): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "Entries", js.undefined)
    
    inline def setEntriesVarargs(value: ChangeMessageVisibilityBatchRequestEntry*): Self = StObject.set(x, "Entries", js.Array(value*))
    
    inline def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
    
    inline def setQueueUrlUndefined: Self = StObject.set(x, "QueueUrl", js.undefined)
  }
}
