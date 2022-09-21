package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowDetails extends StObject {
  
  /**
    * A trigger that starts a workflow: the workflow begins to execute after a file is uploaded. To remove an associated workflow from a server, you can provide an empty OnUpload object, as in the following example.  aws transfer update-server --server-id s-01234567890abcdef --workflow-details '{"OnUpload":[]}' 
    */
  var OnUpload: OnUploadWorkflowDetails
}
object WorkflowDetails {
  
  inline def apply(OnUpload: OnUploadWorkflowDetails): WorkflowDetails = {
    val __obj = js.Dynamic.literal(OnUpload = OnUpload.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowDetails]
  }
  
  extension [Self <: WorkflowDetails](x: Self) {
    
    inline def setOnUpload(value: OnUploadWorkflowDetails): Self = StObject.set(x, "OnUpload", value.asInstanceOf[js.Any])
    
    inline def setOnUploadVarargs(value: WorkflowDetail*): Self = StObject.set(x, "OnUpload", js.Array(value*))
  }
}
