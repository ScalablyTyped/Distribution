package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorkloadShareOutput extends StObject {
  
  var WorkloadId: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.WorkloadId] = js.undefined
  
  var WorkloadShare: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.WorkloadShare] = js.undefined
}
object UpdateWorkloadShareOutput {
  
  inline def apply(): UpdateWorkloadShareOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateWorkloadShareOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateWorkloadShareOutput] (val x: Self) extends AnyVal {
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
    
    inline def setWorkloadIdUndefined: Self = StObject.set(x, "WorkloadId", js.undefined)
    
    inline def setWorkloadShare(value: WorkloadShare): Self = StObject.set(x, "WorkloadShare", value.asInstanceOf[js.Any])
    
    inline def setWorkloadShareUndefined: Self = StObject.set(x, "WorkloadShare", js.undefined)
  }
}
