package typings.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleMapping extends js.Object {
  /**
    * If you specify Token or Rules as the Type, AmbiguousRoleResolution is required. Specifies the action to be taken if either no rules match the claim value for the Rules type, or there is no cognito:preferred_role claim and there are multiple cognito:roles matches for the Token type.
    */
  var AmbiguousRoleResolution: js.UndefOr[AmbiguousRoleResolutionType] = js.native
  /**
    * The rules to be used for mapping users to roles. If you specify Rules as the role mapping type, RulesConfiguration is required.
    */
  var RulesConfiguration: js.UndefOr[RulesConfigurationType] = js.native
  /**
    * The role mapping type. Token will use cognito:roles and cognito:preferred_role claims from the Cognito identity provider token to map groups to roles. Rules will attempt to match claims from the token to map to a role.
    */
  var Type: RoleMappingType = js.native
}

object RoleMapping {
  @scala.inline
  def apply(Type: RoleMappingType): RoleMapping = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleMapping]
  }
  @scala.inline
  implicit class RoleMappingOps[Self <: RoleMapping] (val x: Self) extends AnyVal {
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
    def setType(value: RoleMappingType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAmbiguousRoleResolution(value: AmbiguousRoleResolutionType): Self = this.set("AmbiguousRoleResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmbiguousRoleResolution: Self = this.set("AmbiguousRoleResolution", js.undefined)
    @scala.inline
    def setRulesConfiguration(value: RulesConfigurationType): Self = this.set("RulesConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRulesConfiguration: Self = this.set("RulesConfiguration", js.undefined)
  }
  
}

