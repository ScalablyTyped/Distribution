package typings.awsSdk.wellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLensReviewInput extends StObject {
  
  var LensAlias: typings.awsSdk.wellarchitectedMod.LensAlias
  
  var LensNotes: js.UndefOr[Notes] = js.undefined
  
  var PillarNotes: js.UndefOr[typings.awsSdk.wellarchitectedMod.PillarNotes] = js.undefined
  
  var WorkloadId: typings.awsSdk.wellarchitectedMod.WorkloadId
}
object UpdateLensReviewInput {
  
  inline def apply(LensAlias: LensAlias, WorkloadId: WorkloadId): UpdateLensReviewInput = {
    val __obj = js.Dynamic.literal(LensAlias = LensAlias.asInstanceOf[js.Any], WorkloadId = WorkloadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLensReviewInput]
  }
  
  extension [Self <: UpdateLensReviewInput](x: Self) {
    
    inline def setLensAlias(value: LensAlias): Self = StObject.set(x, "LensAlias", value.asInstanceOf[js.Any])
    
    inline def setLensNotes(value: Notes): Self = StObject.set(x, "LensNotes", value.asInstanceOf[js.Any])
    
    inline def setLensNotesUndefined: Self = StObject.set(x, "LensNotes", js.undefined)
    
    inline def setPillarNotes(value: PillarNotes): Self = StObject.set(x, "PillarNotes", value.asInstanceOf[js.Any])
    
    inline def setPillarNotesUndefined: Self = StObject.set(x, "PillarNotes", js.undefined)
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
  }
}
