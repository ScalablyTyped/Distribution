package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkflowsRequest extends StObject {
  
  /**
    * Specifies the maximum number of workflows to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsTransferMod.MaxResults] = js.undefined
  
  /**
    *  ListWorkflows returns the NextToken parameter in the output. You can then pass the NextToken parameter in a subsequent command to continue listing additional workflows.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsTransferMod.NextToken] = js.undefined
}
object ListWorkflowsRequest {
  
  inline def apply(): ListWorkflowsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkflowsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListWorkflowsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
