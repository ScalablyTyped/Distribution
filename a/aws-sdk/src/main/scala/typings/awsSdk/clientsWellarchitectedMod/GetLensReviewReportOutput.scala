package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLensReviewReportOutput extends StObject {
  
  var LensReviewReport: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.LensReviewReport] = js.undefined
  
  var MilestoneNumber: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.MilestoneNumber] = js.undefined
  
  var WorkloadId: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.WorkloadId] = js.undefined
}
object GetLensReviewReportOutput {
  
  inline def apply(): GetLensReviewReportOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLensReviewReportOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLensReviewReportOutput] (val x: Self) extends AnyVal {
    
    inline def setLensReviewReport(value: LensReviewReport): Self = StObject.set(x, "LensReviewReport", value.asInstanceOf[js.Any])
    
    inline def setLensReviewReportUndefined: Self = StObject.set(x, "LensReviewReport", js.undefined)
    
    inline def setMilestoneNumber(value: MilestoneNumber): Self = StObject.set(x, "MilestoneNumber", value.asInstanceOf[js.Any])
    
    inline def setMilestoneNumberUndefined: Self = StObject.set(x, "MilestoneNumber", js.undefined)
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
    
    inline def setWorkloadIdUndefined: Self = StObject.set(x, "WorkloadId", js.undefined)
  }
}
