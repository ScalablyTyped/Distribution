package typings.awsSdk.finspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePermissionGroupResponse extends StObject {
  
  /**
    * The unique identifier for the deleted permission group.
    */
  var permissionGroupId: js.UndefOr[PermissionGroupId] = js.undefined
}
object DeletePermissionGroupResponse {
  
  inline def apply(): DeletePermissionGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletePermissionGroupResponse]
  }
  
  extension [Self <: DeletePermissionGroupResponse](x: Self) {
    
    inline def setPermissionGroupId(value: PermissionGroupId): Self = StObject.set(x, "permissionGroupId", value.asInstanceOf[js.Any])
    
    inline def setPermissionGroupIdUndefined: Self = StObject.set(x, "permissionGroupId", js.undefined)
  }
}
