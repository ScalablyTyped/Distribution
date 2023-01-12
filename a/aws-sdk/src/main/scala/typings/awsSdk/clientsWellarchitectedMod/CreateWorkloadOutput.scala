package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkloadOutput extends StObject {
  
  var WorkloadArn: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.WorkloadArn] = js.undefined
  
  var WorkloadId: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.WorkloadId] = js.undefined
}
object CreateWorkloadOutput {
  
  inline def apply(): CreateWorkloadOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWorkloadOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateWorkloadOutput] (val x: Self) extends AnyVal {
    
    inline def setWorkloadArn(value: WorkloadArn): Self = StObject.set(x, "WorkloadArn", value.asInstanceOf[js.Any])
    
    inline def setWorkloadArnUndefined: Self = StObject.set(x, "WorkloadArn", js.undefined)
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
    
    inline def setWorkloadIdUndefined: Self = StObject.set(x, "WorkloadId", js.undefined)
  }
}
