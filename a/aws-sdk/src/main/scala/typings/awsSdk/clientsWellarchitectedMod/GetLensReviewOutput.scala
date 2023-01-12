package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLensReviewOutput extends StObject {
  
  var LensReview: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.LensReview] = js.undefined
  
  var MilestoneNumber: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.MilestoneNumber] = js.undefined
  
  var WorkloadId: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.WorkloadId] = js.undefined
}
object GetLensReviewOutput {
  
  inline def apply(): GetLensReviewOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLensReviewOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLensReviewOutput] (val x: Self) extends AnyVal {
    
    inline def setLensReview(value: LensReview): Self = StObject.set(x, "LensReview", value.asInstanceOf[js.Any])
    
    inline def setLensReviewUndefined: Self = StObject.set(x, "LensReview", js.undefined)
    
    inline def setMilestoneNumber(value: MilestoneNumber): Self = StObject.set(x, "MilestoneNumber", value.asInstanceOf[js.Any])
    
    inline def setMilestoneNumberUndefined: Self = StObject.set(x, "MilestoneNumber", js.undefined)
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
    
    inline def setWorkloadIdUndefined: Self = StObject.set(x, "WorkloadId", js.undefined)
  }
}
