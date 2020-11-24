package typings.awsSdkClientCognitoIdentityBrowser.typesRoleMappingMod

import typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.AuthenticatedRole
import typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.Deny
import typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.Rules
import typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.Token
import typings.awsSdkClientCognitoIdentityBrowser.typesRulesConfigurationTypeMod.RulesConfigurationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoleMapping extends js.Object {
  
  /**
    * <p>If you specify Token or Rules as the <code>Type</code>, <code>AmbiguousRoleResolution</code> is required.</p> <p>Specifies the action to be taken if either no rules match the claim value for the <code>Rules</code> type, or there is no <code>cognito:preferred_role</code> claim and there are multiple <code>cognito:roles</code> matches for the <code>Token</code> type.</p>
    */
  var AmbiguousRoleResolution: js.UndefOr[AuthenticatedRole | Deny | String] = js.native
  
  /**
    * <p>The rules to be used for mapping users to roles.</p> <p>If you specify Rules as the role mapping type, <code>RulesConfiguration</code> is required.</p>
    */
  var RulesConfiguration: js.UndefOr[RulesConfigurationType] = js.native
  
  /**
    * <p>The role mapping type. Token will use <code>cognito:roles</code> and <code>cognito:preferred_role</code> claims from the Cognito identity provider token to map groups to roles. Rules will attempt to match claims from the token to map to a role.</p>
    */
  var Type: Token | Rules | String = js.native
}
object RoleMapping {
  
  @scala.inline
  def apply(Type: Token | Rules | String): RoleMapping = {
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
    def setType(value: Token | Rules | String): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmbiguousRoleResolution(value: AuthenticatedRole | Deny | String): Self = this.set("AmbiguousRoleResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmbiguousRoleResolution: Self = this.set("AmbiguousRoleResolution", js.undefined)
    
    @scala.inline
    def setRulesConfiguration(value: RulesConfigurationType): Self = this.set("RulesConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRulesConfiguration: Self = this.set("RulesConfiguration", js.undefined)
  }
}
