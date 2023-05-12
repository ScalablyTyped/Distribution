package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMessageBatchResult extends StObject {
  
  /**
    * <p>A list of <code>
    *                <a>BatchResultErrorEntry</a>
    *             </code> items.</p>
    */
  var Failed: js.UndefOr[js.Array[BatchResultErrorEntry]] = js.undefined
  
  /**
    * <p>A list of <code>
    *                <a>DeleteMessageBatchResultEntry</a>
    *             </code> items.</p>
    */
  var Successful: js.UndefOr[js.Array[DeleteMessageBatchResultEntry]] = js.undefined
}
object DeleteMessageBatchResult {
  
  inline def apply(): DeleteMessageBatchResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteMessageBatchResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteMessageBatchResult] (val x: Self) extends AnyVal {
    
    inline def setFailed(value: js.Array[BatchResultErrorEntry]): Self = StObject.set(x, "Failed", value.asInstanceOf[js.Any])
    
    inline def setFailedUndefined: Self = StObject.set(x, "Failed", js.undefined)
    
    inline def setFailedVarargs(value: BatchResultErrorEntry*): Self = StObject.set(x, "Failed", js.Array(value*))
    
    inline def setSuccessful(value: js.Array[DeleteMessageBatchResultEntry]): Self = StObject.set(x, "Successful", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulUndefined: Self = StObject.set(x, "Successful", js.undefined)
    
    inline def setSuccessfulVarargs(value: DeleteMessageBatchResultEntry*): Self = StObject.set(x, "Successful", js.Array(value*))
  }
}
