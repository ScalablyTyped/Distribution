package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLensReviewImprovementsOutput extends StObject {
  
  var ImprovementSummaries: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.ImprovementSummaries] = js.undefined
  
  var LensAlias: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.LensAlias] = js.undefined
  
  /**
    * The ARN for the lens.
    */
  var LensArn: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.LensArn] = js.undefined
  
  var MilestoneNumber: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.MilestoneNumber] = js.undefined
  
  var NextToken: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.NextToken] = js.undefined
  
  var WorkloadId: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.WorkloadId] = js.undefined
}
object ListLensReviewImprovementsOutput {
  
  inline def apply(): ListLensReviewImprovementsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLensReviewImprovementsOutput]
  }
  
  extension [Self <: ListLensReviewImprovementsOutput](x: Self) {
    
    inline def setImprovementSummaries(value: ImprovementSummaries): Self = StObject.set(x, "ImprovementSummaries", value.asInstanceOf[js.Any])
    
    inline def setImprovementSummariesUndefined: Self = StObject.set(x, "ImprovementSummaries", js.undefined)
    
    inline def setImprovementSummariesVarargs(value: ImprovementSummary*): Self = StObject.set(x, "ImprovementSummaries", js.Array(value*))
    
    inline def setLensAlias(value: LensAlias): Self = StObject.set(x, "LensAlias", value.asInstanceOf[js.Any])
    
    inline def setLensAliasUndefined: Self = StObject.set(x, "LensAlias", js.undefined)
    
    inline def setLensArn(value: LensArn): Self = StObject.set(x, "LensArn", value.asInstanceOf[js.Any])
    
    inline def setLensArnUndefined: Self = StObject.set(x, "LensArn", js.undefined)
    
    inline def setMilestoneNumber(value: MilestoneNumber): Self = StObject.set(x, "MilestoneNumber", value.asInstanceOf[js.Any])
    
    inline def setMilestoneNumberUndefined: Self = StObject.set(x, "MilestoneNumber", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
    
    inline def setWorkloadIdUndefined: Self = StObject.set(x, "WorkloadId", js.undefined)
  }
}
