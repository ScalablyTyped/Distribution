package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRoleAliasRequest extends StObject {
  
  /**
    * The role alias to delete.
    */
  var roleAlias: RoleAlias
}
object DeleteRoleAliasRequest {
  
  inline def apply(roleAlias: RoleAlias): DeleteRoleAliasRequest = {
    val __obj = js.Dynamic.literal(roleAlias = roleAlias.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRoleAliasRequest]
  }
  
  extension [Self <: DeleteRoleAliasRequest](x: Self) {
    
    inline def setRoleAlias(value: RoleAlias): Self = StObject.set(x, "roleAlias", value.asInstanceOf[js.Any])
  }
}
