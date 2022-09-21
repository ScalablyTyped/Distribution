package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkflowsResponse extends StObject {
  
  /**
    * A continuation token, if not all workflow names have been returned.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
  
  /**
    * List of names of workflows in the account.
    */
  var Workflows: js.UndefOr[WorkflowNames] = js.undefined
}
object ListWorkflowsResponse {
  
  inline def apply(): ListWorkflowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkflowsResponse]
  }
  
  extension [Self <: ListWorkflowsResponse](x: Self) {
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWorkflows(value: WorkflowNames): Self = StObject.set(x, "Workflows", value.asInstanceOf[js.Any])
    
    inline def setWorkflowsUndefined: Self = StObject.set(x, "Workflows", js.undefined)
    
    inline def setWorkflowsVarargs(value: NameString*): Self = StObject.set(x, "Workflows", js.Array(value*))
  }
}
