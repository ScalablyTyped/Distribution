package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateMulticastGroupWithFuotaTaskRequest extends StObject {
  
  var Id: FuotaTaskId
  
  var MulticastGroupId: typings.awsSdk.iotwirelessMod.MulticastGroupId
}
object AssociateMulticastGroupWithFuotaTaskRequest {
  
  inline def apply(Id: FuotaTaskId, MulticastGroupId: MulticastGroupId): AssociateMulticastGroupWithFuotaTaskRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], MulticastGroupId = MulticastGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateMulticastGroupWithFuotaTaskRequest]
  }
  
  extension [Self <: AssociateMulticastGroupWithFuotaTaskRequest](x: Self) {
    
    inline def setId(value: FuotaTaskId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setMulticastGroupId(value: MulticastGroupId): Self = StObject.set(x, "MulticastGroupId", value.asInstanceOf[js.Any])
  }
}
