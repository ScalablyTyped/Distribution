package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorkflowResponse extends StObject {
  
  /**
    * The structure that contains the details of the workflow.
    */
  var Workflow: DescribedWorkflow
}
object DescribeWorkflowResponse {
  
  inline def apply(Workflow: DescribedWorkflow): DescribeWorkflowResponse = {
    val __obj = js.Dynamic.literal(Workflow = Workflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkflowResponse]
  }
  
  extension [Self <: DescribeWorkflowResponse](x: Self) {
    
    inline def setWorkflow(value: DescribedWorkflow): Self = StObject.set(x, "Workflow", value.asInstanceOf[js.Any])
  }
}
