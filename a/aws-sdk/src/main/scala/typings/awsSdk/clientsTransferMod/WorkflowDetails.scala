package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowDetails extends StObject {
  
  /**
    * A trigger that starts a workflow if a file is only partially uploaded. You can attach a workflow to a server that executes whenever there is a partial upload. A partial upload occurs when a file is open when the session disconnects.
    */
  var OnPartialUpload: js.UndefOr[OnPartialUploadWorkflowDetails] = js.undefined
  
  /**
    * A trigger that starts a workflow: the workflow begins to execute after a file is uploaded. To remove an associated workflow from a server, you can provide an empty OnUpload object, as in the following example.  aws transfer update-server --server-id s-01234567890abcdef --workflow-details '{"OnUpload":[]}' 
    */
  var OnUpload: js.UndefOr[OnUploadWorkflowDetails] = js.undefined
}
object WorkflowDetails {
  
  inline def apply(): WorkflowDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowDetails]
  }
  
  extension [Self <: WorkflowDetails](x: Self) {
    
    inline def setOnPartialUpload(value: OnPartialUploadWorkflowDetails): Self = StObject.set(x, "OnPartialUpload", value.asInstanceOf[js.Any])
    
    inline def setOnPartialUploadUndefined: Self = StObject.set(x, "OnPartialUpload", js.undefined)
    
    inline def setOnPartialUploadVarargs(value: WorkflowDetail*): Self = StObject.set(x, "OnPartialUpload", js.Array(value*))
    
    inline def setOnUpload(value: OnUploadWorkflowDetails): Self = StObject.set(x, "OnUpload", value.asInstanceOf[js.Any])
    
    inline def setOnUploadUndefined: Self = StObject.set(x, "OnUpload", js.undefined)
    
    inline def setOnUploadVarargs(value: WorkflowDetail*): Self = StObject.set(x, "OnUpload", js.Array(value*))
  }
}
