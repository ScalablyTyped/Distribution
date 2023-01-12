package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLensReviewsOutput extends StObject {
  
  var LensReviewSummaries: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.LensReviewSummaries] = js.undefined
  
  var MilestoneNumber: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.MilestoneNumber] = js.undefined
  
  var NextToken: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.NextToken] = js.undefined
  
  var WorkloadId: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.WorkloadId] = js.undefined
}
object ListLensReviewsOutput {
  
  inline def apply(): ListLensReviewsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLensReviewsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListLensReviewsOutput] (val x: Self) extends AnyVal {
    
    inline def setLensReviewSummaries(value: LensReviewSummaries): Self = StObject.set(x, "LensReviewSummaries", value.asInstanceOf[js.Any])
    
    inline def setLensReviewSummariesUndefined: Self = StObject.set(x, "LensReviewSummaries", js.undefined)
    
    inline def setLensReviewSummariesVarargs(value: LensReviewSummary*): Self = StObject.set(x, "LensReviewSummaries", js.Array(value*))
    
    inline def setMilestoneNumber(value: MilestoneNumber): Self = StObject.set(x, "MilestoneNumber", value.asInstanceOf[js.Any])
    
    inline def setMilestoneNumberUndefined: Self = StObject.set(x, "MilestoneNumber", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
    
    inline def setWorkloadIdUndefined: Self = StObject.set(x, "WorkloadId", js.undefined)
  }
}
