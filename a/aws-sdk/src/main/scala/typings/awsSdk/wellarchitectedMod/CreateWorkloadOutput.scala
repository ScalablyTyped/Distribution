package typings.awsSdk.wellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkloadOutput extends StObject {
  
  var WorkloadArn: js.UndefOr[typings.awsSdk.wellarchitectedMod.WorkloadArn] = js.undefined
  
  var WorkloadId: js.UndefOr[typings.awsSdk.wellarchitectedMod.WorkloadId] = js.undefined
}
object CreateWorkloadOutput {
  
  inline def apply(): CreateWorkloadOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWorkloadOutput]
  }
  
  extension [Self <: CreateWorkloadOutput](x: Self) {
    
    inline def setWorkloadArn(value: WorkloadArn): Self = StObject.set(x, "WorkloadArn", value.asInstanceOf[js.Any])
    
    inline def setWorkloadArnUndefined: Self = StObject.set(x, "WorkloadArn", js.undefined)
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
    
    inline def setWorkloadIdUndefined: Self = StObject.set(x, "WorkloadId", js.undefined)
  }
}
