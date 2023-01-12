package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLensReviewInput extends StObject {
  
  var LensAlias: typings.awsSdk.clientsWellarchitectedMod.LensAlias
  
  var LensNotes: js.UndefOr[Notes] = js.undefined
  
  var PillarNotes: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.PillarNotes] = js.undefined
  
  var WorkloadId: typings.awsSdk.clientsWellarchitectedMod.WorkloadId
}
object UpdateLensReviewInput {
  
  inline def apply(LensAlias: LensAlias, WorkloadId: WorkloadId): UpdateLensReviewInput = {
    val __obj = js.Dynamic.literal(LensAlias = LensAlias.asInstanceOf[js.Any], WorkloadId = WorkloadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLensReviewInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateLensReviewInput] (val x: Self) extends AnyVal {
    
    inline def setLensAlias(value: LensAlias): Self = StObject.set(x, "LensAlias", value.asInstanceOf[js.Any])
    
    inline def setLensNotes(value: Notes): Self = StObject.set(x, "LensNotes", value.asInstanceOf[js.Any])
    
    inline def setLensNotesUndefined: Self = StObject.set(x, "LensNotes", js.undefined)
    
    inline def setPillarNotes(value: PillarNotes): Self = StObject.set(x, "PillarNotes", value.asInstanceOf[js.Any])
    
    inline def setPillarNotesUndefined: Self = StObject.set(x, "PillarNotes", js.undefined)
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
  }
}
