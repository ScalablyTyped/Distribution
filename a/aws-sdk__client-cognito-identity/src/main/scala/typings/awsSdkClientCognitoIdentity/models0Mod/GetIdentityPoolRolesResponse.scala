package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetIdentityPoolRolesResponse extends js.Object {
  
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: js.UndefOr[String] = js.native
  
  /**
    * <p>How users for a specific identity provider are to mapped to roles. This is a
    *             String-to-<a>RoleMapping</a> object map. The string identifies the identity
    *          provider, for example, "graph.facebook.com" or
    *          "cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id".</p>
    */
  var RoleMappings: js.UndefOr[StringDictionary[RoleMapping]] = js.native
  
  /**
    * <p>The map of roles associated with this pool. Currently only authenticated and
    *          unauthenticated roles are supported.</p>
    */
  var Roles: js.UndefOr[StringDictionary[String]] = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "GetIdentityPoolRolesResponse")
@js.native
object GetIdentityPoolRolesResponse extends js.Object {
  
  def filterSensitiveLog(obj: GetIdentityPoolRolesResponse): js.Any = js.native
}
