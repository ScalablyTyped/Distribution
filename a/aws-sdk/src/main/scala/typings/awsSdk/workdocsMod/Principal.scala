package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Principal extends StObject {
  
  /**
    * The ID of the resource.
    */
  var Id: js.UndefOr[IdType] = js.native
  
  /**
    * The permission information for the resource.
    */
  var Roles: js.UndefOr[PermissionInfoList] = js.native
  
  /**
    * The type of resource.
    */
  var Type: js.UndefOr[PrincipalType] = js.native
}
object Principal {
  
  @scala.inline
  def apply(): Principal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Principal]
  }
  
  @scala.inline
  implicit class PrincipalMutableBuilder[Self <: Principal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: IdType): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setRoles(value: PermissionInfoList): Self = StObject.set(x, "Roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolesUndefined: Self = StObject.set(x, "Roles", js.undefined)
    
    @scala.inline
    def setRolesVarargs(value: PermissionInfo*): Self = StObject.set(x, "Roles", js.Array(value :_*))
    
    @scala.inline
    def setType(value: PrincipalType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
