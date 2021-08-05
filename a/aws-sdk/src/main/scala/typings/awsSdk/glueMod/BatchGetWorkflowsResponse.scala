package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetWorkflowsResponse extends StObject {
  
  /**
    * A list of names of workflows not found.
    */
  var MissingWorkflows: js.UndefOr[WorkflowNames] = js.undefined
  
  /**
    * A list of workflow resource metadata.
    */
  var Workflows: js.UndefOr[typings.awsSdk.glueMod.Workflows] = js.undefined
}
object BatchGetWorkflowsResponse {
  
  inline def apply(): BatchGetWorkflowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetWorkflowsResponse]
  }
  
  extension [Self <: BatchGetWorkflowsResponse](x: Self) {
    
    inline def setMissingWorkflows(value: WorkflowNames): Self = StObject.set(x, "MissingWorkflows", value.asInstanceOf[js.Any])
    
    inline def setMissingWorkflowsUndefined: Self = StObject.set(x, "MissingWorkflows", js.undefined)
    
    inline def setMissingWorkflowsVarargs(value: NameString*): Self = StObject.set(x, "MissingWorkflows", js.Array(value :_*))
    
    inline def setWorkflows(value: Workflows): Self = StObject.set(x, "Workflows", value.asInstanceOf[js.Any])
    
    inline def setWorkflowsUndefined: Self = StObject.set(x, "Workflows", js.undefined)
    
    inline def setWorkflowsVarargs(value: Workflow*): Self = StObject.set(x, "Workflows", js.Array(value :_*))
  }
}
