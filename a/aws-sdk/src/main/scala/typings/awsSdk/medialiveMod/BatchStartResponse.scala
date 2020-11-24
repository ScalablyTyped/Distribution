package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchStartResponse extends js.Object {
  
  /**
    * List of failed operations
    */
  var Failed: js.UndefOr[listOfBatchFailedResultModel] = js.native
  
  /**
    * List of successful operations
    */
  var Successful: js.UndefOr[listOfBatchSuccessfulResultModel] = js.native
}
object BatchStartResponse {
  
  @scala.inline
  def apply(): BatchStartResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchStartResponse]
  }
  
  @scala.inline
  implicit class BatchStartResponseOps[Self <: BatchStartResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFailedVarargs(value: BatchFailedResultModel*): Self = this.set("Failed", js.Array(value :_*))
    
    @scala.inline
    def setFailed(value: listOfBatchFailedResultModel): Self = this.set("Failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailed: Self = this.set("Failed", js.undefined)
    
    @scala.inline
    def setSuccessfulVarargs(value: BatchSuccessfulResultModel*): Self = this.set("Successful", js.Array(value :_*))
    
    @scala.inline
    def setSuccessful(value: listOfBatchSuccessfulResultModel): Self = this.set("Successful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessful: Self = this.set("Successful", js.undefined)
  }
}
