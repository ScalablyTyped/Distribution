package typings.awsSdk.ioteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchPutMessageErrorEntry extends js.Object {
  
  /**
    * The code associated with the error.
    */
  var errorCode: js.UndefOr[ErrorCode] = js.native
  
  /**
    * More information about the error.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.native
  
  /**
    * The ID of the message that caused the error. (See the value corresponding to the "messageId" key in the "message" object.)
    */
  var messageId: js.UndefOr[MessageId] = js.native
}
object BatchPutMessageErrorEntry {
  
  @scala.inline
  def apply(): BatchPutMessageErrorEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchPutMessageErrorEntry]
  }
  
  @scala.inline
  implicit class BatchPutMessageErrorEntryOps[Self <: BatchPutMessageErrorEntry] (val x: Self) extends AnyVal {
    
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
    def setErrorCode(value: ErrorCode): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("errorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    
    @scala.inline
    def setMessageId(value: MessageId): Self = this.set("messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageId: Self = this.set("messageId", js.undefined)
  }
}
