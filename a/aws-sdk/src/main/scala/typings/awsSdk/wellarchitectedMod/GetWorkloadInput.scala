package typings.awsSdk.wellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkloadInput extends StObject {
  
  var WorkloadId: typings.awsSdk.wellarchitectedMod.WorkloadId
}
object GetWorkloadInput {
  
  inline def apply(WorkloadId: WorkloadId): GetWorkloadInput = {
    val __obj = js.Dynamic.literal(WorkloadId = WorkloadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkloadInput]
  }
  
  extension [Self <: GetWorkloadInput](x: Self) {
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
  }
}
