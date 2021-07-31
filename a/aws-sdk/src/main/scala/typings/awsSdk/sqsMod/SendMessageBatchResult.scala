package typings.awsSdk.sqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendMessageBatchResult extends StObject {
  
  /**
    * A list of  BatchResultErrorEntry  items with error details about each message that can't be enqueued.
    */
  var Failed: BatchResultErrorEntryList
  
  /**
    * A list of  SendMessageBatchResultEntry  items.
    */
  var Successful: SendMessageBatchResultEntryList
}
object SendMessageBatchResult {
  
  @scala.inline
  def apply(Failed: BatchResultErrorEntryList, Successful: SendMessageBatchResultEntryList): SendMessageBatchResult = {
    val __obj = js.Dynamic.literal(Failed = Failed.asInstanceOf[js.Any], Successful = Successful.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessageBatchResult]
  }
  
  @scala.inline
  implicit class SendMessageBatchResultMutableBuilder[Self <: SendMessageBatchResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailed(value: BatchResultErrorEntryList): Self = StObject.set(x, "Failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedVarargs(value: BatchResultErrorEntry*): Self = StObject.set(x, "Failed", js.Array(value :_*))
    
    @scala.inline
    def setSuccessful(value: SendMessageBatchResultEntryList): Self = StObject.set(x, "Successful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessfulVarargs(value: SendMessageBatchResultEntry*): Self = StObject.set(x, "Successful", js.Array(value :_*))
  }
}
