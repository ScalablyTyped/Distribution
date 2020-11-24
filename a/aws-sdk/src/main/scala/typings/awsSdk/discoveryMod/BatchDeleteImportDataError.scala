package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDeleteImportDataError extends js.Object {
  
  /**
    * The type of error that occurred for a specific import task.
    */
  var errorCode: js.UndefOr[BatchDeleteImportDataErrorCode] = js.native
  
  /**
    * The description of the error that occurred for a specific import task.
    */
  var errorDescription: js.UndefOr[BatchDeleteImportDataErrorDescription] = js.native
  
  /**
    * The unique import ID associated with the error that occurred.
    */
  var importTaskId: js.UndefOr[ImportTaskIdentifier] = js.native
}
object BatchDeleteImportDataError {
  
  @scala.inline
  def apply(): BatchDeleteImportDataError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteImportDataError]
  }
  
  @scala.inline
  implicit class BatchDeleteImportDataErrorOps[Self <: BatchDeleteImportDataError] (val x: Self) extends AnyVal {
    
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
    def setErrorCode(value: BatchDeleteImportDataErrorCode): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("errorCode", js.undefined)
    
    @scala.inline
    def setErrorDescription(value: BatchDeleteImportDataErrorDescription): Self = this.set("errorDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDescription: Self = this.set("errorDescription", js.undefined)
    
    @scala.inline
    def setImportTaskId(value: ImportTaskIdentifier): Self = this.set("importTaskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportTaskId: Self = this.set("importTaskId", js.undefined)
  }
}
