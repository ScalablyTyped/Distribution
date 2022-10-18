package typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetIdentityPoolRolesInput extends StObject {
  
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>How users for a specific identity provider are to mapped to roles. This is a string
    *          to <a>RoleMapping</a> object map. The string identifies the identity provider,
    *          for example, "graph.facebook.com" or
    *          "cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id".</p>
    *          <p>Up to 25 rules can be specified per identity provider.</p>
    */
  var RoleMappings: js.UndefOr[Record[String, RoleMapping]] = js.undefined
  
  /**
    * <p>The map of roles associated with this pool. For a given role, the key will be either
    *          "authenticated" or "unauthenticated" and the value will be the Role ARN.</p>
    */
  var Roles: js.UndefOr[Record[String, String]] = js.undefined
}
object SetIdentityPoolRolesInput {
  
  inline def apply(): SetIdentityPoolRolesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetIdentityPoolRolesInput]
  }
  
  extension [Self <: SetIdentityPoolRolesInput](x: Self) {
    
    inline def setIdentityPoolId(value: String): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
    
    inline def setRoleMappings(value: Record[String, RoleMapping]): Self = StObject.set(x, "RoleMappings", value.asInstanceOf[js.Any])
    
    inline def setRoleMappingsUndefined: Self = StObject.set(x, "RoleMappings", js.undefined)
    
    inline def setRoles(value: Record[String, String]): Self = StObject.set(x, "Roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "Roles", js.undefined)
  }
}
