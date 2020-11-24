package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeExportTasksResult extends js.Object {
  
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
  implicit class DescribeExportTasksResultOps[Self <: DescribeExportTasksResult] (val x: Self) extends AnyVal {
    
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
    def setExportTasksVarargs(value: ExportTask*): Self = this.set("ExportTasks", js.Array(value :_*))
    
    @scala.inline
    def setExportTasks(value: ExportTaskList): Self = this.set("ExportTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportTasks: Self = this.set("ExportTasks", js.undefined)
  }
}
