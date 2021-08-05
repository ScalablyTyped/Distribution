package typings.awsSdk.cognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetIdentityPoolRolesInput extends StObject {
  
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: typings.awsSdk.cognitoidentityMod.IdentityPoolId
  
  /**
    * How users for a specific identity provider are to mapped to roles. This is a string to RoleMapping object map. The string identifies the identity provider, for example, "graph.facebook.com" or "cognito-idp-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id". Up to 25 rules can be specified per identity provider.
    */
  var RoleMappings: js.UndefOr[RoleMappingMap] = js.undefined
  
  /**
    * The map of roles associated with this pool. For a given role, the key will be either "authenticated" or "unauthenticated" and the value will be the Role ARN.
    */
  var Roles: RolesMap
}
object SetIdentityPoolRolesInput {
  
  inline def apply(IdentityPoolId: IdentityPoolId, Roles: RolesMap): SetIdentityPoolRolesInput = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], Roles = Roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetIdentityPoolRolesInput]
  }
  
  extension [Self <: SetIdentityPoolRolesInput](x: Self) {
    
    inline def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    inline def setRoleMappings(value: RoleMappingMap): Self = StObject.set(x, "RoleMappings", value.asInstanceOf[js.Any])
    
    inline def setRoleMappingsUndefined: Self = StObject.set(x, "RoleMappings", js.undefined)
    
    inline def setRoles(value: RolesMap): Self = StObject.set(x, "Roles", value.asInstanceOf[js.Any])
  }
}
