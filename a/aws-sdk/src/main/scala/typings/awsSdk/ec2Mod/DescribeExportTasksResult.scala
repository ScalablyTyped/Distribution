package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeExportTasksResult extends StObject {
  
  /**
    * Information about the export tasks.
    */
  var ExportTasks: js.UndefOr[ExportTaskList] = js.native
}
object DescribeExportTasksResult {
  
  @scala.inline
  def apply(): DescribeExportTasksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExportTasksResult]
  }
  
  @scala.inline
  implicit class DescribeExportTasksResultMutableBuilder[Self <: DescribeExportTasksResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportTasks(value: ExportTaskList): Self = StObject.set(x, "ExportTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportTasksUndefined: Self = StObject.set(x, "ExportTasks", js.undefined)
    
    @scala.inline
    def setExportTasksVarargs(value: ExportTask*): Self = StObject.set(x, "ExportTasks", js.Array(value :_*))
  }
}
