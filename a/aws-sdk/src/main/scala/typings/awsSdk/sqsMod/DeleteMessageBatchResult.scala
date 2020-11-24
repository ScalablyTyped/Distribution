package typings.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteMessageBatchResult extends js.Object {
  
  /**
    * A list of  BatchResultErrorEntry  items.
    */
  var Failed: BatchResultErrorEntryList = js.native
  
  /**
    * A list of  DeleteMessageBatchResultEntry  items.
    */
  var Successful: DeleteMessageBatchResultEntryList = js.native
}
object DeleteMessageBatchResult {
  
  @scala.inline
  def apply(Failed: BatchResultErrorEntryList, Successful: DeleteMessageBatchResultEntryList): DeleteMessageBatchResult = {
    val __obj = js.Dynamic.literal(Failed = Failed.asInstanceOf[js.Any], Successful = Successful.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMessageBatchResult]
  }
  
  @scala.inline
  implicit class DeleteMessageBatchResultOps[Self <: DeleteMessageBatchResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFailedVarargs(value: BatchResultErrorEntry*): Self = this.set("Failed", js.Array(value :_*))
    
    @scala.inline
    def setFailed(value: BatchResultErrorEntryList): Self = this.set("Failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessfulVarargs(value: DeleteMessageBatchResultEntry*): Self = this.set("Successful", js.Array(value :_*))
    
    @scala.inline
    def setSuccessful(value: DeleteMessageBatchResultEntryList): Self = this.set("Successful", value.asInstanceOf[js.Any])
  }
}
