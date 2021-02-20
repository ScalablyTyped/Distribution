package typings.awsSdk.cognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetIdentityPoolRolesResponse extends StObject {
  
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: js.UndefOr[typings.awsSdk.cognitoidentityMod.IdentityPoolId] = js.native
  
  /**
    * How users for a specific identity provider are to mapped to roles. This is a String-to-RoleMapping object map. The string identifies the identity provider, for example, "graph.facebook.com" or "cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id".
    */
  var RoleMappings: js.UndefOr[RoleMappingMap] = js.native
  
  /**
    * The map of roles associated with this pool. Currently only authenticated and unauthenticated roles are supported.
    */
  var Roles: js.UndefOr[RolesMap] = js.native
}
object GetIdentityPoolRolesResponse {
  
  @scala.inline
  def apply(): GetIdentityPoolRolesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIdentityPoolRolesResponse]
  }
  
  @scala.inline
  implicit class GetIdentityPoolRolesResponseMutableBuilder[Self <: GetIdentityPoolRolesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
    
    @scala.inline
    def setRoleMappings(value: RoleMappingMap): Self = StObject.set(x, "RoleMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleMappingsUndefined: Self = StObject.set(x, "RoleMappings", js.undefined)
    
    @scala.inline
    def setRoles(value: RolesMap): Self = StObject.set(x, "Roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolesUndefined: Self = StObject.set(x, "Roles", js.undefined)
  }
}
