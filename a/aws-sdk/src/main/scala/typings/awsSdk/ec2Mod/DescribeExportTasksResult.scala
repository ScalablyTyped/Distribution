package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeExportTasksResult extends StObject {
  
  /**
    * Information about the export tasks.
    */
  var ExportTasks: js.UndefOr[ExportTaskList] = js.undefined
}
object DescribeExportTasksResult {
  
  inline def apply(): DescribeExportTasksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExportTasksResult]
  }
  
  extension [Self <: DescribeExportTasksResult](x: Self) {
    
    inline def setExportTasks(value: ExportTaskList): Self = StObject.set(x, "ExportTasks", value.asInstanceOf[js.Any])
    
    inline def setExportTasksUndefined: Self = StObject.set(x, "ExportTasks", js.undefined)
    
    inline def setExportTasksVarargs(value: ExportTask*): Self = StObject.set(x, "ExportTasks", js.Array(value :_*))
  }
}
