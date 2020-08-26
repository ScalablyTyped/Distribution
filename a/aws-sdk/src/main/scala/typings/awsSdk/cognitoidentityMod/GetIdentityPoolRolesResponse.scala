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
  def apply(): GetIdentityPoolRolesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIdentityPoolRolesResponse]
  }
  @scala.inline
  implicit class GetIdentityPoolRolesResponseOps[Self <: GetIdentityPoolRolesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIdentityPoolId(value: IdentityPoolId): Self = this.set("IdentityPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityPoolId: Self = this.set("IdentityPoolId", js.undefined)
    @scala.inline
    def setRoleMappings(value: RoleMappingMap): Self = this.set("RoleMappings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleMappings: Self = this.set("RoleMappings", js.undefined)
    @scala.inline
    def setRoles(value: RolesMap): Self = this.set("Roles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoles: Self = this.set("Roles", js.undefined)
  }
  
}

