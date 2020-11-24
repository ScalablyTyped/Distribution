package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelImportTaskRequest extends js.Object {
  
  /**
    * The reason for canceling the task.
    */
  var CancelReason: js.UndefOr[String] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the import image or import snapshot task to be canceled.
    */
  var ImportTaskId: js.UndefOr[typings.awsSdk.ec2Mod.ImportTaskId] = js.native
}
object CancelImportTaskRequest {
  
  @scala.inline
  def apply(): CancelImportTaskRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelImportTaskRequest]
  }
  
  @scala.inline
  implicit class CancelImportTaskRequestOps[Self <: CancelImportTaskRequest] (val x: Self) extends AnyVal {
    
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
    def setCancelReason(value: String): Self = this.set("CancelReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelReason: Self = this.set("CancelReason", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setImportTaskId(value: ImportTaskId): Self = this.set("ImportTaskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportTaskId: Self = this.set("ImportTaskId", js.undefined)
  }
}
