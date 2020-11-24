package typings.awsSdk.ioteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdateDetectorErrorEntry extends js.Object {
  
  /**
    * The code of the error.
    */
  var errorCode: js.UndefOr[ErrorCode] = js.native
  
  /**
    * A message describing the error.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.native
  
  /**
    * The "messageId" of the update request that caused the error. (The value of the "messageId" in the update request "Detector" object.)
    */
  var messageId: js.UndefOr[MessageId] = js.native
}
object BatchUpdateDetectorErrorEntry {
  
  @scala.inline
  def apply(): BatchUpdateDetectorErrorEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateDetectorErrorEntry]
  }
  
  @scala.inline
  implicit class BatchUpdateDetectorErrorEntryOps[Self <: BatchUpdateDetectorErrorEntry] (val x: Self) extends AnyVal {
    
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
