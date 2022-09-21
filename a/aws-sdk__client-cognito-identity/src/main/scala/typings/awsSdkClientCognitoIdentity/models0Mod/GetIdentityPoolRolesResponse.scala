package typings.awsSdkClientCognitoIdentity.models0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIdentityPoolRolesResponse extends StObject {
  
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>How users for a specific identity provider are to mapped to roles. This is a
    *             String-to-<a>RoleMapping</a> object map. The string identifies the identity
    *          provider, for example, "graph.facebook.com" or
    *          "cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id".</p>
    */
  var RoleMappings: js.UndefOr[Record[String, RoleMapping]] = js.undefined
  
  /**
    * <p>The map of roles associated with this pool. Currently only authenticated and
    *          unauthenticated roles are supported.</p>
    */
  var Roles: js.UndefOr[Record[String, String]] = js.undefined
}
object GetIdentityPoolRolesResponse {
  
  inline def apply(): GetIdentityPoolRolesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIdentityPoolRolesResponse]
  }
  
  extension [Self <: GetIdentityPoolRolesResponse](x: Self) {
    
    inline def setIdentityPoolId(value: String): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
    
    inline def setRoleMappings(value: Record[String, RoleMapping]): Self = StObject.set(x, "RoleMappings", value.asInstanceOf[js.Any])
    
    inline def setRoleMappingsUndefined: Self = StObject.set(x, "RoleMappings", js.undefined)
    
    inline def setRoles(value: Record[String, String]): Self = StObject.set(x, "Roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "Roles", js.undefined)
  }
}
