package typings.awsSdk.wellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLensReviewsInput extends StObject {
  
  var MaxResults: js.UndefOr[typings.awsSdk.wellarchitectedMod.MaxResults] = js.undefined
  
  var MilestoneNumber: js.UndefOr[typings.awsSdk.wellarchitectedMod.MilestoneNumber] = js.undefined
  
  var NextToken: js.UndefOr[typings.awsSdk.wellarchitectedMod.NextToken] = js.undefined
  
  var WorkloadId: typings.awsSdk.wellarchitectedMod.WorkloadId
}
object ListLensReviewsInput {
  
  inline def apply(WorkloadId: WorkloadId): ListLensReviewsInput = {
    val __obj = js.Dynamic.literal(WorkloadId = WorkloadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLensReviewsInput]
  }
  
  extension [Self <: ListLensReviewsInput](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMilestoneNumber(value: MilestoneNumber): Self = StObject.set(x, "MilestoneNumber", value.asInstanceOf[js.Any])
    
    inline def setMilestoneNumberUndefined: Self = StObject.set(x, "MilestoneNumber", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
  }
}
