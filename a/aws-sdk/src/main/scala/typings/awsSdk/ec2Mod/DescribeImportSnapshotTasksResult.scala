package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeImportSnapshotTasksResult extends js.Object {
  
  /**
    * A list of zero or more import snapshot tasks that are currently active or were completed or canceled in the previous 7 days.
    */
  var ImportSnapshotTasks: js.UndefOr[ImportSnapshotTaskList] = js.native
  
  /**
    * The token to use to get the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeImportSnapshotTasksResult {
  
  @scala.inline
  def apply(): DescribeImportSnapshotTasksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImportSnapshotTasksResult]
  }
  
  @scala.inline
  implicit class DescribeImportSnapshotTasksResultOps[Self <: DescribeImportSnapshotTasksResult] (val x: Self) extends AnyVal {
    
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
    def setImportSnapshotTasksVarargs(value: ImportSnapshotTask*): Self = this.set("ImportSnapshotTasks", js.Array(value :_*))
    
    @scala.inline
    def setImportSnapshotTasks(value: ImportSnapshotTaskList): Self = this.set("ImportSnapshotTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportSnapshotTasks: Self = this.set("ImportSnapshotTasks", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
