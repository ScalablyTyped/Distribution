package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeExportImageTasksResult extends js.Object {
  
  /**
    * Information about the export image tasks.
    */
  var ExportImageTasks: js.UndefOr[ExportImageTaskList] = js.native
  
  /**
    * The token to use to get the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.native
}
object DescribeExportImageTasksResult {
  
  @scala.inline
  def apply(): DescribeExportImageTasksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExportImageTasksResult]
  }
  
  @scala.inline
  implicit class DescribeExportImageTasksResultOps[Self <: DescribeExportImageTasksResult] (val x: Self) extends AnyVal {
    
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
    def setExportImageTasksVarargs(value: ExportImageTask*): Self = this.set("ExportImageTasks", js.Array(value :_*))
    
    @scala.inline
    def setExportImageTasks(value: ExportImageTaskList): Self = this.set("ExportImageTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportImageTasks: Self = this.set("ExportImageTasks", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
