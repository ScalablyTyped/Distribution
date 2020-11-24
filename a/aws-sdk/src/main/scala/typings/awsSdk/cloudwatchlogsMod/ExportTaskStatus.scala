package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportTaskStatus extends js.Object {
  
  /**
    * The status code of the export task.
    */
  var code: js.UndefOr[ExportTaskStatusCode] = js.native
  
  /**
    * The status message related to the status code.
    */
  var message: js.UndefOr[ExportTaskStatusMessage] = js.native
}
object ExportTaskStatus {
  
  @scala.inline
  def apply(): ExportTaskStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportTaskStatus]
  }
  
  @scala.inline
  implicit class ExportTaskStatusOps[Self <: ExportTaskStatus] (val x: Self) extends AnyVal {
    
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
    def setCode(value: ExportTaskStatusCode): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setMessage(value: ExportTaskStatusMessage): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
