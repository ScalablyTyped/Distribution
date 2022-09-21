package typings.awsSdk.finspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionGroupParams extends StObject {
  
  /**
    * List of resource permissions.
    */
  var datasetPermissions: js.UndefOr[ResourcePermissionsList] = js.undefined
  
  /**
    * The unique identifier for the PermissionGroup.
    */
  var permissionGroupId: js.UndefOr[PermissionGroupId] = js.undefined
}
object PermissionGroupParams {
  
  inline def apply(): PermissionGroupParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionGroupParams]
  }
  
  extension [Self <: PermissionGroupParams](x: Self) {
    
    inline def setDatasetPermissions(value: ResourcePermissionsList): Self = StObject.set(x, "datasetPermissions", value.asInstanceOf[js.Any])
    
    inline def setDatasetPermissionsUndefined: Self = StObject.set(x, "datasetPermissions", js.undefined)
    
    inline def setDatasetPermissionsVarargs(value: ResourcePermission*): Self = StObject.set(x, "datasetPermissions", js.Array(value*))
    
    inline def setPermissionGroupId(value: PermissionGroupId): Self = StObject.set(x, "permissionGroupId", value.asInstanceOf[js.Any])
    
    inline def setPermissionGroupIdUndefined: Self = StObject.set(x, "permissionGroupId", js.undefined)
  }
}
