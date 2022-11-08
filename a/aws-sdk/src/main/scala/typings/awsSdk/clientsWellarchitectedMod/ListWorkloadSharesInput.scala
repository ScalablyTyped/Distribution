package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkloadSharesInput extends StObject {
  
  /**
    * The maximum number of results to return for this request.
    */
  var MaxResults: js.UndefOr[ListWorkloadSharesMaxResults] = js.undefined
  
  var NextToken: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.NextToken] = js.undefined
  
  /**
    * The Amazon Web Services account ID, IAM role, organization ID, or organizational unit (OU) ID with which the workload is shared.
    */
  var SharedWithPrefix: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.SharedWithPrefix] = js.undefined
  
  var Status: js.UndefOr[ShareStatus] = js.undefined
  
  var WorkloadId: typings.awsSdk.clientsWellarchitectedMod.WorkloadId
}
object ListWorkloadSharesInput {
  
  inline def apply(WorkloadId: WorkloadId): ListWorkloadSharesInput = {
    val __obj = js.Dynamic.literal(WorkloadId = WorkloadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorkloadSharesInput]
  }
  
  extension [Self <: ListWorkloadSharesInput](x: Self) {
    
    inline def setMaxResults(value: ListWorkloadSharesMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSharedWithPrefix(value: SharedWithPrefix): Self = StObject.set(x, "SharedWithPrefix", value.asInstanceOf[js.Any])
    
    inline def setSharedWithPrefixUndefined: Self = StObject.set(x, "SharedWithPrefix", js.undefined)
    
    inline def setStatus(value: ShareStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
  }
}
