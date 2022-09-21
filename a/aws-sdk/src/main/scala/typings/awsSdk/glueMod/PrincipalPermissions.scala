package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrincipalPermissions extends StObject {
  
  /**
    * The permissions that are granted to the principal.
    */
  var Permissions: js.UndefOr[PermissionList] = js.undefined
  
  /**
    * The principal who is granted permissions.
    */
  var Principal: js.UndefOr[DataLakePrincipal] = js.undefined
}
object PrincipalPermissions {
  
  inline def apply(): PrincipalPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrincipalPermissions]
  }
  
  extension [Self <: PrincipalPermissions](x: Self) {
    
    inline def setPermissions(value: PermissionList): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "Permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: Permission*): Self = StObject.set(x, "Permissions", js.Array(value*))
    
    inline def setPrincipal(value: DataLakePrincipal): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalUndefined: Self = StObject.set(x, "Principal", js.undefined)
  }
}
