package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeExportTasksResponse extends StObject {
  
  /**
    * The export tasks.
    */
  var exportTasks: js.UndefOr[ExportTasks] = js.native
  
  var nextToken: js.UndefOr[NextToken] = js.native
}
object DescribeExportTasksResponse {
  
  @scala.inline
  def apply(): DescribeExportTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExportTasksResponse]
  }
  
  @scala.inline
  implicit class DescribeExportTasksResponseMutableBuilder[Self <: DescribeExportTasksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportTasks(value: ExportTasks): Self = StObject.set(x, "exportTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportTasksUndefined: Self = StObject.set(x, "exportTasks", js.undefined)
    
    @scala.inline
    def setExportTasksVarargs(value: ExportTask*): Self = StObject.set(x, "exportTasks", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
