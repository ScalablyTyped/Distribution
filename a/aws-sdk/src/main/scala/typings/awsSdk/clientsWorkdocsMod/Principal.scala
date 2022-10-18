package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Principal extends StObject {
  
  /**
    * The ID of the resource.
    */
  var Id: js.UndefOr[IdType] = js.undefined
  
  /**
    * The permission information for the resource.
    */
  var Roles: js.UndefOr[PermissionInfoList] = js.undefined
  
  /**
    * The type of resource.
    */
  var Type: js.UndefOr[PrincipalType] = js.undefined
}
object Principal {
  
  inline def apply(): Principal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Principal]
  }
  
  extension [Self <: Principal](x: Self) {
    
    inline def setId(value: IdType): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setRoles(value: PermissionInfoList): Self = StObject.set(x, "Roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "Roles", js.undefined)
    
    inline def setRolesVarargs(value: PermissionInfo*): Self = StObject.set(x, "Roles", js.Array(value*))
    
    inline def setType(value: PrincipalType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
