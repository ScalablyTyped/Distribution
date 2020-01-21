package typings.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIdentityPoolRolesResponse extends js.Object {
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
  def apply(IdentityPoolId: IdentityPoolId = null, RoleMappings: RoleMappingMap = null, Roles: RolesMap = null): GetIdentityPoolRolesResponse = {
    val __obj = js.Dynamic.literal()
    if (IdentityPoolId != null) __obj.updateDynamic("IdentityPoolId")(IdentityPoolId.asInstanceOf[js.Any])
    if (RoleMappings != null) __obj.updateDynamic("RoleMappings")(RoleMappings.asInstanceOf[js.Any])
    if (Roles != null) __obj.updateDynamic("Roles")(Roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityPoolRolesResponse]
  }
}

