package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRoleAliasRequest extends StObject {
  
  /**
    * The role alias to delete.
    */
  var roleAlias: RoleAlias = js.native
}
object DeleteRoleAliasRequest {
  
  @scala.inline
  def apply(roleAlias: RoleAlias): DeleteRoleAliasRequest = {
    val __obj = js.Dynamic.literal(roleAlias = roleAlias.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRoleAliasRequest]
  }
  
  @scala.inline
  implicit class DeleteRoleAliasRequestMutableBuilder[Self <: DeleteRoleAliasRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoleAlias(value: RoleAlias): Self = StObject.set(x, "roleAlias", value.asInstanceOf[js.Any])
  }
}
