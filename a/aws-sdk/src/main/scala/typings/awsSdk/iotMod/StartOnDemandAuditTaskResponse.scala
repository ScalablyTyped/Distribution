package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartOnDemandAuditTaskResponse extends StObject {
  
  /**
    * The ID of the on-demand audit you started.
    */
  var taskId: js.UndefOr[AuditTaskId] = js.native
}
object StartOnDemandAuditTaskResponse {
  
  @scala.inline
  def apply(): StartOnDemandAuditTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartOnDemandAuditTaskResponse]
  }
  
  @scala.inline
  implicit class StartOnDemandAuditTaskResponseMutableBuilder[Self <: StartOnDemandAuditTaskResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskId(value: AuditTaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
  }
}
