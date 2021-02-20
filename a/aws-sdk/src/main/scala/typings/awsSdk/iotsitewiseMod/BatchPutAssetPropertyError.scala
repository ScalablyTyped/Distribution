package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchPutAssetPropertyError extends StObject {
  
  /**
    * The error code.
    */
  var errorCode: BatchPutAssetPropertyValueErrorCode = js.native
  
  /**
    * The associated error message.
    */
  var errorMessage: ErrorMessage = js.native
  
  /**
    * A list of timestamps for each error, if any.
    */
  var timestamps: Timestamps = js.native
}
object BatchPutAssetPropertyError {
  
  @scala.inline
  def apply(errorCode: BatchPutAssetPropertyValueErrorCode, errorMessage: ErrorMessage, timestamps: Timestamps): BatchPutAssetPropertyError = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], timestamps = timestamps.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutAssetPropertyError]
  }
  
  @scala.inline
  implicit class BatchPutAssetPropertyErrorMutableBuilder[Self <: BatchPutAssetPropertyError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: BatchPutAssetPropertyValueErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamps(value: Timestamps): Self = StObject.set(x, "timestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampsVarargs(value: TimeInNanos*): Self = StObject.set(x, "timestamps", js.Array(value :_*))
  }
}
