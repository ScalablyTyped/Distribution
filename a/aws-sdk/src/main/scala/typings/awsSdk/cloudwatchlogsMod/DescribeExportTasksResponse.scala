package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeExportTasksResponse extends js.Object {
  
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
  implicit class DescribeExportTasksResponseOps[Self <: DescribeExportTasksResponse] (val x: Self) extends AnyVal {
    
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
    def setExportTasksVarargs(value: ExportTask*): Self = this.set("exportTasks", js.Array(value :_*))
    
    @scala.inline
    def setExportTasks(value: ExportTasks): Self = this.set("exportTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportTasks: Self = this.set("exportTasks", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
