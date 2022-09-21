package typings.awsSdk.wellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MilestoneSummary extends StObject {
  
  var MilestoneName: js.UndefOr[typings.awsSdk.wellarchitectedMod.MilestoneName] = js.undefined
  
  var MilestoneNumber: js.UndefOr[typings.awsSdk.wellarchitectedMod.MilestoneNumber] = js.undefined
  
  var RecordedAt: js.UndefOr[js.Date] = js.undefined
  
  var WorkloadSummary: js.UndefOr[typings.awsSdk.wellarchitectedMod.WorkloadSummary] = js.undefined
}
object MilestoneSummary {
  
  inline def apply(): MilestoneSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MilestoneSummary]
  }
  
  extension [Self <: MilestoneSummary](x: Self) {
    
    inline def setMilestoneName(value: MilestoneName): Self = StObject.set(x, "MilestoneName", value.asInstanceOf[js.Any])
    
    inline def setMilestoneNameUndefined: Self = StObject.set(x, "MilestoneName", js.undefined)
    
    inline def setMilestoneNumber(value: MilestoneNumber): Self = StObject.set(x, "MilestoneNumber", value.asInstanceOf[js.Any])
    
    inline def setMilestoneNumberUndefined: Self = StObject.set(x, "MilestoneNumber", js.undefined)
    
    inline def setRecordedAt(value: js.Date): Self = StObject.set(x, "RecordedAt", value.asInstanceOf[js.Any])
    
    inline def setRecordedAtUndefined: Self = StObject.set(x, "RecordedAt", js.undefined)
    
    inline def setWorkloadSummary(value: WorkloadSummary): Self = StObject.set(x, "WorkloadSummary", value.asInstanceOf[js.Any])
    
    inline def setWorkloadSummaryUndefined: Self = StObject.set(x, "WorkloadSummary", js.undefined)
  }
}
