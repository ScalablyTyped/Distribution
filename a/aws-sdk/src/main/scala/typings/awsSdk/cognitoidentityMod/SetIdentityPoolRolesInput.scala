package typings.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetIdentityPoolRolesInput extends js.Object {
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
  implicit class SetIdentityPoolRolesInputOps[Self <: SetIdentityPoolRolesInput] (val x: Self) extends AnyVal {
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
    def setRoles(value: RolesMap): Self = this.set("Roles", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleMappings(value: RoleMappingMap): Self = this.set("RoleMappings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleMappings: Self = this.set("RoleMappings", js.undefined)
  }
  
}

