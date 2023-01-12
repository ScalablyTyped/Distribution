package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorkloadShareInput extends StObject {
  
  var PermissionType: typings.awsSdk.clientsWellarchitectedMod.PermissionType
  
  var ShareId: typings.awsSdk.clientsWellarchitectedMod.ShareId
  
  var WorkloadId: typings.awsSdk.clientsWellarchitectedMod.WorkloadId
}
object UpdateWorkloadShareInput {
  
  inline def apply(PermissionType: PermissionType, ShareId: ShareId, WorkloadId: WorkloadId): UpdateWorkloadShareInput = {
    val __obj = js.Dynamic.literal(PermissionType = PermissionType.asInstanceOf[js.Any], ShareId = ShareId.asInstanceOf[js.Any], WorkloadId = WorkloadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkloadShareInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateWorkloadShareInput] (val x: Self) extends AnyVal {
    
    inline def setPermissionType(value: PermissionType): Self = StObject.set(x, "PermissionType", value.asInstanceOf[js.Any])
    
    inline def setShareId(value: ShareId): Self = StObject.set(x, "ShareId", value.asInstanceOf[js.Any])
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
  }
}
