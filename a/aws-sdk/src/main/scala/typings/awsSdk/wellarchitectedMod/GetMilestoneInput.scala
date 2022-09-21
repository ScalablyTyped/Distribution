package typings.awsSdk.wellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMilestoneInput extends StObject {
  
  var MilestoneNumber: typings.awsSdk.wellarchitectedMod.MilestoneNumber
  
  var WorkloadId: typings.awsSdk.wellarchitectedMod.WorkloadId
}
object GetMilestoneInput {
  
  inline def apply(MilestoneNumber: MilestoneNumber, WorkloadId: WorkloadId): GetMilestoneInput = {
    val __obj = js.Dynamic.literal(MilestoneNumber = MilestoneNumber.asInstanceOf[js.Any], WorkloadId = WorkloadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMilestoneInput]
  }
  
  extension [Self <: GetMilestoneInput](x: Self) {
    
    inline def setMilestoneNumber(value: MilestoneNumber): Self = StObject.set(x, "MilestoneNumber", value.asInstanceOf[js.Any])
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
  }
}
