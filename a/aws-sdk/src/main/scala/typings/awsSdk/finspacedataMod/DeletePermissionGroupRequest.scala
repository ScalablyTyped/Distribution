package typings.awsSdk.finspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePermissionGroupRequest extends StObject {
  
  /**
    * A token that ensures idempotency. This token expires in 10 minutes.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The unique identifier for the permission group that you want to delete.
    */
  var permissionGroupId: PermissionGroupId
}
object DeletePermissionGroupRequest {
  
  inline def apply(permissionGroupId: PermissionGroupId): DeletePermissionGroupRequest = {
    val __obj = js.Dynamic.literal(permissionGroupId = permissionGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePermissionGroupRequest]
  }
  
  extension [Self <: DeletePermissionGroupRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setPermissionGroupId(value: PermissionGroupId): Self = StObject.set(x, "permissionGroupId", value.asInstanceOf[js.Any])
  }
}
