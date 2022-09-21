package typings.awsSdk.wellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLensReviewOutput extends StObject {
  
  var LensReview: js.UndefOr[typings.awsSdk.wellarchitectedMod.LensReview] = js.undefined
  
  var WorkloadId: js.UndefOr[typings.awsSdk.wellarchitectedMod.WorkloadId] = js.undefined
}
object UpdateLensReviewOutput {
  
  inline def apply(): UpdateLensReviewOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateLensReviewOutput]
  }
  
  extension [Self <: UpdateLensReviewOutput](x: Self) {
    
    inline def setLensReview(value: LensReview): Self = StObject.set(x, "LensReview", value.asInstanceOf[js.Any])
    
    inline def setLensReviewUndefined: Self = StObject.set(x, "LensReview", js.undefined)
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
    
    inline def setWorkloadIdUndefined: Self = StObject.set(x, "WorkloadId", js.undefined)
  }
}
