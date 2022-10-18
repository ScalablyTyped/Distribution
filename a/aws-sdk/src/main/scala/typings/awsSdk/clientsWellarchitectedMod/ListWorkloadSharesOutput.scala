package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkloadSharesOutput extends StObject {
  
  var NextToken: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.NextToken] = js.undefined
  
  var WorkloadId: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.WorkloadId] = js.undefined
  
  var WorkloadShareSummaries: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.WorkloadShareSummaries] = js.undefined
}
object ListWorkloadSharesOutput {
  
  inline def apply(): ListWorkloadSharesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkloadSharesOutput]
  }
  
  extension [Self <: ListWorkloadSharesOutput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
    
    inline def setWorkloadIdUndefined: Self = StObject.set(x, "WorkloadId", js.undefined)
    
    inline def setWorkloadShareSummaries(value: WorkloadShareSummaries): Self = StObject.set(x, "WorkloadShareSummaries", value.asInstanceOf[js.Any])
    
    inline def setWorkloadShareSummariesUndefined: Self = StObject.set(x, "WorkloadShareSummaries", js.undefined)
    
    inline def setWorkloadShareSummariesVarargs(value: WorkloadShareSummary*): Self = StObject.set(x, "WorkloadShareSummaries", js.Array(value*))
  }
}
