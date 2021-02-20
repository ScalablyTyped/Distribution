package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelExportTaskRequest extends StObject {
  
  /**
    * The ID of the export task. This is the ID returned by CreateInstanceExportTask.
    */
  var ExportTaskId: ExportVmTaskId = js.native
}
object CancelExportTaskRequest {
  
  @scala.inline
  def apply(ExportTaskId: ExportVmTaskId): CancelExportTaskRequest = {
    val __obj = js.Dynamic.literal(ExportTaskId = ExportTaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelExportTaskRequest]
  }
  
  @scala.inline
  implicit class CancelExportTaskRequestMutableBuilder[Self <: CancelExportTaskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportTaskId(value: ExportVmTaskId): Self = StObject.set(x, "ExportTaskId", value.asInstanceOf[js.Any])
  }
}
