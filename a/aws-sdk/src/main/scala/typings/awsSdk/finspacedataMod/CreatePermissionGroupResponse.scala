package typings.awsSdk.finspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePermissionGroupResponse extends StObject {
  
  /**
    * The unique identifier for the permission group.
    */
  var permissionGroupId: js.UndefOr[PermissionGroupId] = js.undefined
}
object CreatePermissionGroupResponse {
  
  inline def apply(): CreatePermissionGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePermissionGroupResponse]
  }
  
  extension [Self <: CreatePermissionGroupResponse](x: Self) {
    
    inline def setPermissionGroupId(value: PermissionGroupId): Self = StObject.set(x, "permissionGroupId", value.asInstanceOf[js.Any])
    
    inline def setPermissionGroupIdUndefined: Self = StObject.set(x, "permissionGroupId", js.undefined)
  }
}
