package typings.awsSdk.wellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkloadShare extends StObject {
  
  var PermissionType: js.UndefOr[typings.awsSdk.wellarchitectedMod.PermissionType] = js.undefined
  
  var ShareId: js.UndefOr[typings.awsSdk.wellarchitectedMod.ShareId] = js.undefined
  
  var SharedBy: js.UndefOr[AwsAccountId] = js.undefined
  
  var SharedWith: js.UndefOr[typings.awsSdk.wellarchitectedMod.SharedWith] = js.undefined
  
  var Status: js.UndefOr[ShareStatus] = js.undefined
  
  var WorkloadId: js.UndefOr[typings.awsSdk.wellarchitectedMod.WorkloadId] = js.undefined
  
  var WorkloadName: js.UndefOr[typings.awsSdk.wellarchitectedMod.WorkloadName] = js.undefined
}
object WorkloadShare {
  
  inline def apply(): WorkloadShare = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkloadShare]
  }
  
  extension [Self <: WorkloadShare](x: Self) {
    
    inline def setPermissionType(value: PermissionType): Self = StObject.set(x, "PermissionType", value.asInstanceOf[js.Any])
    
    inline def setPermissionTypeUndefined: Self = StObject.set(x, "PermissionType", js.undefined)
    
    inline def setShareId(value: ShareId): Self = StObject.set(x, "ShareId", value.asInstanceOf[js.Any])
    
    inline def setShareIdUndefined: Self = StObject.set(x, "ShareId", js.undefined)
    
    inline def setSharedBy(value: AwsAccountId): Self = StObject.set(x, "SharedBy", value.asInstanceOf[js.Any])
    
    inline def setSharedByUndefined: Self = StObject.set(x, "SharedBy", js.undefined)
    
    inline def setSharedWith(value: SharedWith): Self = StObject.set(x, "SharedWith", value.asInstanceOf[js.Any])
    
    inline def setSharedWithUndefined: Self = StObject.set(x, "SharedWith", js.undefined)
    
    inline def setStatus(value: ShareStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
    
    inline def setWorkloadIdUndefined: Self = StObject.set(x, "WorkloadId", js.undefined)
    
    inline def setWorkloadName(value: WorkloadName): Self = StObject.set(x, "WorkloadName", value.asInstanceOf[js.Any])
    
    inline def setWorkloadNameUndefined: Self = StObject.set(x, "WorkloadName", js.undefined)
  }
}
