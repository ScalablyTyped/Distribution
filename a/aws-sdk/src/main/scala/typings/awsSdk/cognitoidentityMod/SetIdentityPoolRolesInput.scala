package typings.awsSdk.cognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetIdentityPoolRolesInput extends StObject {
  
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: typings.awsSdk.cognitoidentityMod.IdentityPoolId = js.native
  
  /**
    * How users for a specific identity provider are to mapped to roles. This is a string to RoleMapping object map. The string identifies the identity provider, for example, "graph.facebook.com" or "cognito-idp-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id". Up to 25 rules can be specified per identity provider.
    */
  var RoleMappings: js.UndefOr[RoleMappingMap] = js.native
  
  /**
    * The map of roles associated with this pool. For a given role, the key will be either "authenticated" or "unauthenticated" and the value will be the Role ARN.
    */
  var Roles: RolesMap = js.native
}
object SetIdentityPoolRolesInput {
  
  @scala.inline
  def apply(IdentityPoolId: IdentityPoolId, Roles: RolesMap): SetIdentityPoolRolesInput = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], Roles = Roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetIdentityPoolRolesInput]
  }
  
  @scala.inline
  implicit class SetIdentityPoolRolesInputMutableBuilder[Self <: SetIdentityPoolRolesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleMappings(value: RoleMappingMap): Self = StObject.set(x, "RoleMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleMappingsUndefined: Self = StObject.set(x, "RoleMappings", js.undefined)
    
    @scala.inline
    def setRoles(value: RolesMap): Self = StObject.set(x, "Roles", value.asInstanceOf[js.Any])
  }
}
