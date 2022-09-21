package typings.awsSdk.wellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAnswersOutput extends StObject {
  
  var AnswerSummaries: js.UndefOr[typings.awsSdk.wellarchitectedMod.AnswerSummaries] = js.undefined
  
  var LensAlias: js.UndefOr[typings.awsSdk.wellarchitectedMod.LensAlias] = js.undefined
  
  /**
    * The ARN for the lens.
    */
  var LensArn: js.UndefOr[typings.awsSdk.wellarchitectedMod.LensArn] = js.undefined
  
  var MilestoneNumber: js.UndefOr[typings.awsSdk.wellarchitectedMod.MilestoneNumber] = js.undefined
  
  var NextToken: js.UndefOr[typings.awsSdk.wellarchitectedMod.NextToken] = js.undefined
  
  var WorkloadId: js.UndefOr[typings.awsSdk.wellarchitectedMod.WorkloadId] = js.undefined
}
object ListAnswersOutput {
  
  inline def apply(): ListAnswersOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAnswersOutput]
  }
  
  extension [Self <: ListAnswersOutput](x: Self) {
    
    inline def setAnswerSummaries(value: AnswerSummaries): Self = StObject.set(x, "AnswerSummaries", value.asInstanceOf[js.Any])
    
    inline def setAnswerSummariesUndefined: Self = StObject.set(x, "AnswerSummaries", js.undefined)
    
    inline def setAnswerSummariesVarargs(value: AnswerSummary*): Self = StObject.set(x, "AnswerSummaries", js.Array(value*))
    
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
