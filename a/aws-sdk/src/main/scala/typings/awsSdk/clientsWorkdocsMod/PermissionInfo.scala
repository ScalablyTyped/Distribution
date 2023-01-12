package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionInfo extends StObject {
  
  /**
    * The role of the user.
    */
  var Role: js.UndefOr[RoleType] = js.undefined
  
  /**
    * The type of permissions.
    */
  var Type: js.UndefOr[RolePermissionType] = js.undefined
}
object PermissionInfo {
  
  inline def apply(): PermissionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PermissionInfo] (val x: Self) extends AnyVal {
    
    inline def setRole(value: RoleType): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    inline def setType(value: RolePermissionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
