package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMLTaskRunsResponse extends js.Object {
  
  /**
    * A pagination token, if more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * A list of task runs that are associated with the transform.
    */
  var TaskRuns: js.UndefOr[TaskRunList] = js.native
}
object GetMLTaskRunsResponse {
  
  @scala.inline
  def apply(): GetMLTaskRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMLTaskRunsResponse]
  }
  
  @scala.inline
  implicit class GetMLTaskRunsResponseOps[Self <: GetMLTaskRunsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setTaskRunsVarargs(value: TaskRun*): Self = this.set("TaskRuns", js.Array(value :_*))
    
    @scala.inline
    def setTaskRuns(value: TaskRunList): Self = this.set("TaskRuns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskRuns: Self = this.set("TaskRuns", js.undefined)
  }
}
