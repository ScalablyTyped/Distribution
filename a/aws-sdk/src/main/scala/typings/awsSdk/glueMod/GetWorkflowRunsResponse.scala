package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetWorkflowRunsResponse extends js.Object {
  
  /**
    * A continuation token, if not all requested workflow runs have been returned.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
  
  /**
    * A list of workflow run metadata objects.
    */
  var Runs: js.UndefOr[WorkflowRuns] = js.native
}
object GetWorkflowRunsResponse {
  
  @scala.inline
  def apply(): GetWorkflowRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkflowRunsResponse]
  }
  
  @scala.inline
  implicit class GetWorkflowRunsResponseOps[Self <: GetWorkflowRunsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: GenericString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setRunsVarargs(value: WorkflowRun*): Self = this.set("Runs", js.Array(value :_*))
    
    @scala.inline
    def setRuns(value: WorkflowRuns): Self = this.set("Runs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuns: Self = this.set("Runs", js.undefined)
  }
}
