package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Milestone extends StObject {
  
  var MilestoneName: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.MilestoneName] = js.undefined
  
  var MilestoneNumber: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.MilestoneNumber] = js.undefined
  
  var RecordedAt: js.UndefOr[js.Date] = js.undefined
  
  var Workload: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.Workload] = js.undefined
}
object Milestone {
  
  inline def apply(): Milestone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Milestone]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Milestone] (val x: Self) extends AnyVal {
    
    inline def setMilestoneName(value: MilestoneName): Self = StObject.set(x, "MilestoneName", value.asInstanceOf[js.Any])
    
    inline def setMilestoneNameUndefined: Self = StObject.set(x, "MilestoneName", js.undefined)
    
    inline def setMilestoneNumber(value: MilestoneNumber): Self = StObject.set(x, "MilestoneNumber", value.asInstanceOf[js.Any])
    
    inline def setMilestoneNumberUndefined: Self = StObject.set(x, "MilestoneNumber", js.undefined)
    
    inline def setRecordedAt(value: js.Date): Self = StObject.set(x, "RecordedAt", value.asInstanceOf[js.Any])
    
    inline def setRecordedAtUndefined: Self = StObject.set(x, "RecordedAt", js.undefined)
    
    inline def setWorkload(value: Workload): Self = StObject.set(x, "Workload", value.asInstanceOf[js.Any])
    
    inline def setWorkloadUndefined: Self = StObject.set(x, "Workload", js.undefined)
  }
}
