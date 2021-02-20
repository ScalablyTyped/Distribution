package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateInstanceExportTaskResult extends StObject {
  
  /**
    * Information about the instance export task.
    */
  var ExportTask: js.UndefOr[typings.awsSdk.ec2Mod.ExportTask] = js.native
}
object CreateInstanceExportTaskResult {
  
  @scala.inline
  def apply(): CreateInstanceExportTaskResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInstanceExportTaskResult]
  }
  
  @scala.inline
  implicit class CreateInstanceExportTaskResultMutableBuilder[Self <: CreateInstanceExportTaskResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportTask(value: ExportTask): Self = StObject.set(x, "ExportTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportTaskUndefined: Self = StObject.set(x, "ExportTask", js.undefined)
  }
}
