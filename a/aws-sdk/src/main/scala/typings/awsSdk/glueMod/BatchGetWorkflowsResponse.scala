package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetWorkflowsResponse extends StObject {
  
  /**
    * A list of names of workflows not found.
    */
  var MissingWorkflows: js.UndefOr[WorkflowNames] = js.native
  
  /**
    * A list of workflow resource metadata.
    */
  var Workflows: js.UndefOr[typings.awsSdk.glueMod.Workflows] = js.native
}
object BatchGetWorkflowsResponse {
  
  @scala.inline
  def apply(): BatchGetWorkflowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetWorkflowsResponse]
  }
  
  @scala.inline
  implicit class BatchGetWorkflowsResponseMutableBuilder[Self <: BatchGetWorkflowsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMissingWorkflows(value: WorkflowNames): Self = StObject.set(x, "MissingWorkflows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingWorkflowsUndefined: Self = StObject.set(x, "MissingWorkflows", js.undefined)
    
    @scala.inline
    def setMissingWorkflowsVarargs(value: NameString*): Self = StObject.set(x, "MissingWorkflows", js.Array(value :_*))
    
    @scala.inline
    def setWorkflows(value: Workflows): Self = StObject.set(x, "Workflows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowsUndefined: Self = StObject.set(x, "Workflows", js.undefined)
    
    @scala.inline
    def setWorkflowsVarargs(value: Workflow*): Self = StObject.set(x, "Workflows", js.Array(value :_*))
  }
}
