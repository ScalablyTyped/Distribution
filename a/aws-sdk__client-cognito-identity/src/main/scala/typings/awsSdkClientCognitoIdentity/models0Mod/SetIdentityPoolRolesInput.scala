package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetIdentityPoolRolesInput extends js.Object {
  
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: js.UndefOr[String] = js.native
  
  /**
    * <p>How users for a specific identity provider are to mapped to roles. This is a string
    *          to <a>RoleMapping</a> object map. The string identifies the identity provider,
    *          for example, "graph.facebook.com" or
    *          "cognito-idp-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id".</p>
    *          <p>Up to 25 rules can be specified per identity provider.</p>
    */
  var RoleMappings: js.UndefOr[StringDictionary[RoleMapping]] = js.native
  
  /**
    * <p>The map of roles associated with this pool. For a given role, the key will be either
    *          "authenticated" or "unauthenticated" and the value will be the Role ARN.</p>
    */
  var Roles: js.UndefOr[StringDictionary[String]] = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "SetIdentityPoolRolesInput")
@js.native
object SetIdentityPoolRolesInput extends js.Object {
  
  def filterSensitiveLog(obj: SetIdentityPoolRolesInput): js.Any = js.native
}
