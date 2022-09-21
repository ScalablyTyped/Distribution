package typings.awsSdk.wellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLensReviewInput extends StObject {
  
  var LensAlias: typings.awsSdk.wellarchitectedMod.LensAlias
  
  var MilestoneNumber: js.UndefOr[typings.awsSdk.wellarchitectedMod.MilestoneNumber] = js.undefined
  
  var WorkloadId: typings.awsSdk.wellarchitectedMod.WorkloadId
}
object GetLensReviewInput {
  
  inline def apply(LensAlias: LensAlias, WorkloadId: WorkloadId): GetLensReviewInput = {
    val __obj = js.Dynamic.literal(LensAlias = LensAlias.asInstanceOf[js.Any], WorkloadId = WorkloadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLensReviewInput]
  }
  
  extension [Self <: GetLensReviewInput](x: Self) {
    
    inline def setLensAlias(value: LensAlias): Self = StObject.set(x, "LensAlias", value.asInstanceOf[js.Any])
    
    inline def setMilestoneNumber(value: MilestoneNumber): Self = StObject.set(x, "MilestoneNumber", value.asInstanceOf[js.Any])
    
    inline def setMilestoneNumberUndefined: Self = StObject.set(x, "MilestoneNumber", js.undefined)
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
  }
}
