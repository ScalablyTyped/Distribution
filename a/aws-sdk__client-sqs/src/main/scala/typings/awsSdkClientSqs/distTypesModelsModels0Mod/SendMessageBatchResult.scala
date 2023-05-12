package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendMessageBatchResult extends StObject {
  
  /**
    * <p>A list of <code>
    *                <a>BatchResultErrorEntry</a>
    *             </code> items with error details about each message that can't be enqueued.</p>
    */
  var Failed: js.UndefOr[js.Array[BatchResultErrorEntry]] = js.undefined
  
  /**
    * <p>A list of <code>
    *                <a>SendMessageBatchResultEntry</a>
    *             </code> items.</p>
    */
  var Successful: js.UndefOr[js.Array[SendMessageBatchResultEntry]] = js.undefined
}
object SendMessageBatchResult {
  
  inline def apply(): SendMessageBatchResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendMessageBatchResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendMessageBatchResult] (val x: Self) extends AnyVal {
    
    inline def setFailed(value: js.Array[BatchResultErrorEntry]): Self = StObject.set(x, "Failed", value.asInstanceOf[js.Any])
    
    inline def setFailedUndefined: Self = StObject.set(x, "Failed", js.undefined)
    
    inline def setFailedVarargs(value: BatchResultErrorEntry*): Self = StObject.set(x, "Failed", js.Array(value*))
    
    inline def setSuccessful(value: js.Array[SendMessageBatchResultEntry]): Self = StObject.set(x, "Successful", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulUndefined: Self = StObject.set(x, "Successful", js.undefined)
    
    inline def setSuccessfulVarargs(value: SendMessageBatchResultEntry*): Self = StObject.set(x, "Successful", js.Array(value*))
  }
}
