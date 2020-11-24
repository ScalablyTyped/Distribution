package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetWorkflowsRequest extends js.Object {
  
  /**
    * Specifies whether to include a graph when returning the workflow resource metadata.
    */
  var IncludeGraph: js.UndefOr[NullableBoolean] = js.native
  
  /**
    * A list of workflow names, which may be the names returned from the ListWorkflows operation.
    */
  var Names: WorkflowNames = js.native
}
object BatchGetWorkflowsRequest {
  
  @scala.inline
  def apply(Names: WorkflowNames): BatchGetWorkflowsRequest = {
    val __obj = js.Dynamic.literal(Names = Names.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetWorkflowsRequest]
  }
  
  @scala.inline
  implicit class BatchGetWorkflowsRequestOps[Self <: BatchGetWorkflowsRequest] (val x: Self) extends AnyVal {
    
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
    def setNamesVarargs(value: NameString*): Self = this.set("Names", js.Array(value :_*))
    
    @scala.inline
    def setNames(value: WorkflowNames): Self = this.set("Names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeGraph(value: NullableBoolean): Self = this.set("IncludeGraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeGraph: Self = this.set("IncludeGraph", js.undefined)
  }
}
