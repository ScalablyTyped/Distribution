package typings.awsSdk.sqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeMessageVisibilityBatchResult extends StObject {
  
  /**
    * A list of  BatchResultErrorEntry  items.
    */
  var Failed: BatchResultErrorEntryList
  
  /**
    * A list of  ChangeMessageVisibilityBatchResultEntry  items.
    */
  var Successful: ChangeMessageVisibilityBatchResultEntryList
}
object ChangeMessageVisibilityBatchResult {
  
  @scala.inline
  def apply(Failed: BatchResultErrorEntryList, Successful: ChangeMessageVisibilityBatchResultEntryList): ChangeMessageVisibilityBatchResult = {
    val __obj = js.Dynamic.literal(Failed = Failed.asInstanceOf[js.Any], Successful = Successful.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeMessageVisibilityBatchResult]
  }
  
  @scala.inline
  implicit class ChangeMessageVisibilityBatchResultMutableBuilder[Self <: ChangeMessageVisibilityBatchResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailed(value: BatchResultErrorEntryList): Self = StObject.set(x, "Failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedVarargs(value: BatchResultErrorEntry*): Self = StObject.set(x, "Failed", js.Array(value :_*))
    
    @scala.inline
    def setSuccessful(value: ChangeMessageVisibilityBatchResultEntryList): Self = StObject.set(x, "Successful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessfulVarargs(value: ChangeMessageVisibilityBatchResultEntry*): Self = StObject.set(x, "Successful", js.Array(value :_*))
  }
}
