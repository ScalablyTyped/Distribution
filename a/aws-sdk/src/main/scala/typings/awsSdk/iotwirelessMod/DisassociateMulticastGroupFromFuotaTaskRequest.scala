package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateMulticastGroupFromFuotaTaskRequest extends StObject {
  
  var Id: FuotaTaskId
  
  var MulticastGroupId: typings.awsSdk.iotwirelessMod.MulticastGroupId
}
object DisassociateMulticastGroupFromFuotaTaskRequest {
  
  inline def apply(Id: FuotaTaskId, MulticastGroupId: MulticastGroupId): DisassociateMulticastGroupFromFuotaTaskRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], MulticastGroupId = MulticastGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateMulticastGroupFromFuotaTaskRequest]
  }
  
  extension [Self <: DisassociateMulticastGroupFromFuotaTaskRequest](x: Self) {
    
    inline def setId(value: FuotaTaskId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setMulticastGroupId(value: MulticastGroupId): Self = StObject.set(x, "MulticastGroupId", value.asInstanceOf[js.Any])
  }
}
