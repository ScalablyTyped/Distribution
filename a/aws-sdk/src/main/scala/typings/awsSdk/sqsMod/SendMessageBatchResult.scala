package typings.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendMessageBatchResult extends js.Object {
  
  /**
    * A list of  BatchResultErrorEntry  items with error details about each message that can't be enqueued.
    */
  var Failed: BatchResultErrorEntryList = js.native
  
  /**
    * A list of  SendMessageBatchResultEntry  items.
    */
  var Successful: SendMessageBatchResultEntryList = js.native
}
object SendMessageBatchResult {
  
  @scala.inline
  def apply(Failed: BatchResultErrorEntryList, Successful: SendMessageBatchResultEntryList): SendMessageBatchResult = {
    val __obj = js.Dynamic.literal(Failed = Failed.asInstanceOf[js.Any], Successful = Successful.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessageBatchResult]
  }
  
  @scala.inline
  implicit class SendMessageBatchResultOps[Self <: SendMessageBatchResult] (val x: Self) extends AnyVal {
    
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
    def setSuccessfulVarargs(value: SendMessageBatchResultEntry*): Self = this.set("Successful", js.Array(value :_*))
    
    @scala.inline
    def setSuccessful(value: SendMessageBatchResultEntryList): Self = this.set("Successful", value.asInstanceOf[js.Any])
  }
}
