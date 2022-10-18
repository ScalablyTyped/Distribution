package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAnswersInput extends StObject {
  
  var LensAlias: typings.awsSdk.clientsWellarchitectedMod.LensAlias
  
  /**
    * The maximum number of results to return for this request.
    */
  var MaxResults: js.UndefOr[ListAnswersMaxResults] = js.undefined
  
  var MilestoneNumber: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.MilestoneNumber] = js.undefined
  
  var NextToken: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.NextToken] = js.undefined
  
  var PillarId: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.PillarId] = js.undefined
  
  var WorkloadId: typings.awsSdk.clientsWellarchitectedMod.WorkloadId
}
object ListAnswersInput {
  
  inline def apply(LensAlias: LensAlias, WorkloadId: WorkloadId): ListAnswersInput = {
    val __obj = js.Dynamic.literal(LensAlias = LensAlias.asInstanceOf[js.Any], WorkloadId = WorkloadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAnswersInput]
  }
  
  extension [Self <: ListAnswersInput](x: Self) {
    
    inline def setLensAlias(value: LensAlias): Self = StObject.set(x, "LensAlias", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: ListAnswersMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMilestoneNumber(value: MilestoneNumber): Self = StObject.set(x, "MilestoneNumber", value.asInstanceOf[js.Any])
    
    inline def setMilestoneNumberUndefined: Self = StObject.set(x, "MilestoneNumber", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPillarId(value: PillarId): Self = StObject.set(x, "PillarId", value.asInstanceOf[js.Any])
    
    inline def setPillarIdUndefined: Self = StObject.set(x, "PillarId", js.undefined)
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
  }
}
