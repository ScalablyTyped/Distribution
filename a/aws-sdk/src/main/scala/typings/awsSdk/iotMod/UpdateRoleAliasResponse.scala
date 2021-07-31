package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRoleAliasResponse extends StObject {
  
  /**
    * The role alias.
    */
  var roleAlias: js.UndefOr[RoleAlias] = js.undefined
  
  /**
    * The role alias ARN.
    */
  var roleAliasArn: js.UndefOr[RoleAliasArn] = js.undefined
}
object UpdateRoleAliasResponse {
  
  @scala.inline
  def apply(): UpdateRoleAliasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRoleAliasResponse]
  }
  
  @scala.inline
  implicit class UpdateRoleAliasResponseMutableBuilder[Self <: UpdateRoleAliasResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoleAlias(value: RoleAlias): Self = StObject.set(x, "roleAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleAliasArn(value: RoleAliasArn): Self = StObject.set(x, "roleAliasArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleAliasArnUndefined: Self = StObject.set(x, "roleAliasArn", js.undefined)
    
    @scala.inline
    def setRoleAliasUndefined: Self = StObject.set(x, "roleAlias", js.undefined)
  }
}
