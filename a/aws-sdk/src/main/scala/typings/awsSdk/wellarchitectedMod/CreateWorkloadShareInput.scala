package typings.awsSdk.wellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkloadShareInput extends StObject {
  
  var ClientRequestToken: typings.awsSdk.wellarchitectedMod.ClientRequestToken
  
  var PermissionType: typings.awsSdk.wellarchitectedMod.PermissionType
  
  var SharedWith: typings.awsSdk.wellarchitectedMod.SharedWith
  
  var WorkloadId: typings.awsSdk.wellarchitectedMod.WorkloadId
}
object CreateWorkloadShareInput {
  
  inline def apply(
    ClientRequestToken: ClientRequestToken,
    PermissionType: PermissionType,
    SharedWith: SharedWith,
    WorkloadId: WorkloadId
  ): CreateWorkloadShareInput = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], PermissionType = PermissionType.asInstanceOf[js.Any], SharedWith = SharedWith.asInstanceOf[js.Any], WorkloadId = WorkloadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkloadShareInput]
  }
  
  extension [Self <: CreateWorkloadShareInput](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setPermissionType(value: PermissionType): Self = StObject.set(x, "PermissionType", value.asInstanceOf[js.Any])
    
    inline def setSharedWith(value: SharedWith): Self = StObject.set(x, "SharedWith", value.asInstanceOf[js.Any])
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
  }
}
