package typings.awsSdk.wellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMilestoneOutput extends StObject {
  
  var Milestone: js.UndefOr[typings.awsSdk.wellarchitectedMod.Milestone] = js.undefined
  
  var WorkloadId: js.UndefOr[typings.awsSdk.wellarchitectedMod.WorkloadId] = js.undefined
}
object GetMilestoneOutput {
  
  inline def apply(): GetMilestoneOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMilestoneOutput]
  }
  
  extension [Self <: GetMilestoneOutput](x: Self) {
    
    inline def setMilestone(value: Milestone): Self = StObject.set(x, "Milestone", value.asInstanceOf[js.Any])
    
    inline def setMilestoneUndefined: Self = StObject.set(x, "Milestone", js.undefined)
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
    
    inline def setWorkloadIdUndefined: Self = StObject.set(x, "WorkloadId", js.undefined)
  }
}
