package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorkflowRequest extends StObject {
  
  /**
    * A unique identifier for the workflow.
    */
  var WorkflowId: typings.awsSdk.clientsTransferMod.WorkflowId
}
object DescribeWorkflowRequest {
  
  inline def apply(WorkflowId: WorkflowId): DescribeWorkflowRequest = {
    val __obj = js.Dynamic.literal(WorkflowId = WorkflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkflowRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeWorkflowRequest] (val x: Self) extends AnyVal {
    
    inline def setWorkflowId(value: WorkflowId): Self = StObject.set(x, "WorkflowId", value.asInstanceOf[js.Any])
  }
}
