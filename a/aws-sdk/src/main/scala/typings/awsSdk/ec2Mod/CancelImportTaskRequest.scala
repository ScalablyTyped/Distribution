package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelImportTaskRequest extends StObject {
  
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
  implicit class CancelImportTaskRequestMutableBuilder[Self <: CancelImportTaskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelReason(value: String): Self = StObject.set(x, "CancelReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelReasonUndefined: Self = StObject.set(x, "CancelReason", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setImportTaskId(value: ImportTaskId): Self = StObject.set(x, "ImportTaskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportTaskIdUndefined: Self = StObject.set(x, "ImportTaskId", js.undefined)
  }
}
