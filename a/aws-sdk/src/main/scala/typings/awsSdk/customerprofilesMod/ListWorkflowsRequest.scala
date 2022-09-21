package typings.awsSdk.customerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkflowsRequest extends StObject {
  
  /**
    * The unique name of the domain.
    */
  var DomainName: name
  
  /**
    * The maximum number of results to return per page.
    */
  var MaxResults: js.UndefOr[maxSize100] = js.undefined
  
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[token] = js.undefined
  
  /**
    * Retrieve workflows ended after timestamp.
    */
  var QueryEndDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Retrieve workflows started after timestamp.
    */
  var QueryStartDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Status of workflow execution.
    */
  var Status: js.UndefOr[typings.awsSdk.customerprofilesMod.Status] = js.undefined
  
  /**
    * The type of workflow. The only supported value is APPFLOW_INTEGRATION.
    */
  var WorkflowType: js.UndefOr[typings.awsSdk.customerprofilesMod.WorkflowType] = js.undefined
}
object ListWorkflowsRequest {
  
  inline def apply(DomainName: name): ListWorkflowsRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorkflowsRequest]
  }
  
  extension [Self <: ListWorkflowsRequest](x: Self) {
    
    inline def setDomainName(value: name): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: maxSize100): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setQueryEndDate(value: js.Date): Self = StObject.set(x, "QueryEndDate", value.asInstanceOf[js.Any])
    
    inline def setQueryEndDateUndefined: Self = StObject.set(x, "QueryEndDate", js.undefined)
    
    inline def setQueryStartDate(value: js.Date): Self = StObject.set(x, "QueryStartDate", value.asInstanceOf[js.Any])
    
    inline def setQueryStartDateUndefined: Self = StObject.set(x, "QueryStartDate", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setWorkflowType(value: WorkflowType): Self = StObject.set(x, "WorkflowType", value.asInstanceOf[js.Any])
    
    inline def setWorkflowTypeUndefined: Self = StObject.set(x, "WorkflowType", js.undefined)
  }
}
