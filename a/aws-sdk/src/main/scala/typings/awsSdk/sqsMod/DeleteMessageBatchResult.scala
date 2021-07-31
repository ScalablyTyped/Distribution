package typings.awsSdk.sqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMessageBatchResult extends StObject {
  
  /**
    * A list of  BatchResultErrorEntry  items.
    */
  var Failed: BatchResultErrorEntryList
  
  /**
    * A list of  DeleteMessageBatchResultEntry  items.
    */
  var Successful: DeleteMessageBatchResultEntryList
}
object DeleteMessageBatchResult {
  
  @scala.inline
  def apply(Failed: BatchResultErrorEntryList, Successful: DeleteMessageBatchResultEntryList): DeleteMessageBatchResult = {
    val __obj = js.Dynamic.literal(Failed = Failed.asInstanceOf[js.Any], Successful = Successful.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMessageBatchResult]
  }
  
  @scala.inline
  implicit class DeleteMessageBatchResultMutableBuilder[Self <: DeleteMessageBatchResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailed(value: BatchResultErrorEntryList): Self = StObject.set(x, "Failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedVarargs(value: BatchResultErrorEntry*): Self = StObject.set(x, "Failed", js.Array(value :_*))
    
    @scala.inline
    def setSuccessful(value: DeleteMessageBatchResultEntryList): Self = StObject.set(x, "Successful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessfulVarargs(value: DeleteMessageBatchResultEntry*): Self = StObject.set(x, "Successful", js.Array(value :_*))
  }
}
