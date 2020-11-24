package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutRecordBatchResponseEntry extends js.Object {
  
  /**
    * The error code for an individual record result.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.firehoseMod.ErrorCode] = js.native
  
  /**
    * The error message for an individual record result.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.firehoseMod.ErrorMessage] = js.native
  
  /**
    * The ID of the record.
    */
  var RecordId: js.UndefOr[PutResponseRecordId] = js.native
}
object PutRecordBatchResponseEntry {
  
  @scala.inline
  def apply(): PutRecordBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutRecordBatchResponseEntry]
  }
  
  @scala.inline
  implicit class PutRecordBatchResponseEntryOps[Self <: PutRecordBatchResponseEntry] (val x: Self) extends AnyVal {
    
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
    def setErrorCode(value: ErrorCode): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    
    @scala.inline
    def setRecordId(value: PutResponseRecordId): Self = this.set("RecordId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordId: Self = this.set("RecordId", js.undefined)
  }
}
