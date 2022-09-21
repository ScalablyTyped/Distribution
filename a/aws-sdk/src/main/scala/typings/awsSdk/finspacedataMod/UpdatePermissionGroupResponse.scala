package typings.awsSdk.finspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePermissionGroupResponse extends StObject {
  
  /**
    * The unique identifier for the updated permission group.
    */
  var permissionGroupId: js.UndefOr[PermissionGroupId] = js.undefined
}
object UpdatePermissionGroupResponse {
  
  inline def apply(): UpdatePermissionGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePermissionGroupResponse]
  }
  
  extension [Self <: UpdatePermissionGroupResponse](x: Self) {
    
    inline def setPermissionGroupId(value: PermissionGroupId): Self = StObject.set(x, "permissionGroupId", value.asInstanceOf[js.Any])
    
    inline def setPermissionGroupIdUndefined: Self = StObject.set(x, "permissionGroupId", js.undefined)
  }
}
