package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchStopResponse extends StObject {
  
  /**
    * List of failed operations
    */
  var Failed: js.UndefOr[listOfBatchFailedResultModel] = js.undefined
  
  /**
    * List of successful operations
    */
  var Successful: js.UndefOr[listOfBatchSuccessfulResultModel] = js.undefined
}
object BatchStopResponse {
  
  @scala.inline
  def apply(): BatchStopResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchStopResponse]
  }
  
  @scala.inline
  implicit class BatchStopResponseMutableBuilder[Self <: BatchStopResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailed(value: listOfBatchFailedResultModel): Self = StObject.set(x, "Failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedUndefined: Self = StObject.set(x, "Failed", js.undefined)
    
    @scala.inline
    def setFailedVarargs(value: BatchFailedResultModel*): Self = StObject.set(x, "Failed", js.Array(value :_*))
    
    @scala.inline
    def setSuccessful(value: listOfBatchSuccessfulResultModel): Self = StObject.set(x, "Successful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessfulUndefined: Self = StObject.set(x, "Successful", js.undefined)
    
    @scala.inline
    def setSuccessfulVarargs(value: BatchSuccessfulResultModel*): Self = StObject.set(x, "Successful", js.Array(value :_*))
  }
}
