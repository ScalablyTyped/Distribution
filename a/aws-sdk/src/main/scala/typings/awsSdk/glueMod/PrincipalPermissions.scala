package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrincipalPermissions extends StObject {
  
  /**
    * The permissions that are granted to the principal.
    */
  var Permissions: js.UndefOr[PermissionList] = js.native
  
  /**
    * The principal who is granted permissions.
    */
  var Principal: js.UndefOr[DataLakePrincipal] = js.native
}
object PrincipalPermissions {
  
  @scala.inline
  def apply(): PrincipalPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrincipalPermissions]
  }
  
  @scala.inline
  implicit class PrincipalPermissionsMutableBuilder[Self <: PrincipalPermissions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissions(value: PermissionList): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "Permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: Permission*): Self = StObject.set(x, "Permissions", js.Array(value :_*))
    
    @scala.inline
    def setPrincipal(value: DataLakePrincipal): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalUndefined: Self = StObject.set(x, "Principal", js.undefined)
  }
}
