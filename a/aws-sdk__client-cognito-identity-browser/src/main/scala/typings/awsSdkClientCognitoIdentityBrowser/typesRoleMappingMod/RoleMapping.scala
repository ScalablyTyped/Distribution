package typings.awsSdkClientCognitoIdentityBrowser.typesRoleMappingMod

import typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.AuthenticatedRole
import typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.Deny
import typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.Rules
import typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.Token
import typings.awsSdkClientCognitoIdentityBrowser.typesRulesConfigurationTypeMod.RulesConfigurationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoleMapping extends js.Object {
  /**
    * <p>If you specify Token or Rules as the <code>Type</code>, <code>AmbiguousRoleResolution</code> is required.</p> <p>Specifies the action to be taken if either no rules match the claim value for the <code>Rules</code> type, or there is no <code>cognito:preferred_role</code> claim and there are multiple <code>cognito:roles</code> matches for the <code>Token</code> type.</p>
    */
  var AmbiguousRoleResolution: js.UndefOr[AuthenticatedRole | Deny | String] = js.undefined
  /**
    * <p>The rules to be used for mapping users to roles.</p> <p>If you specify Rules as the role mapping type, <code>RulesConfiguration</code> is required.</p>
    */
  var RulesConfiguration: js.UndefOr[RulesConfigurationType] = js.undefined
  /**
    * <p>The role mapping type. Token will use <code>cognito:roles</code> and <code>cognito:preferred_role</code> claims from the Cognito identity provider token to map groups to roles. Rules will attempt to match claims from the token to map to a role.</p>
    */
  var Type: Token | Rules | String
}

object RoleMapping {
  @scala.inline
  def apply(
    Type: Token | Rules | String,
    AmbiguousRoleResolution: AuthenticatedRole | Deny | String = null,
    RulesConfiguration: RulesConfigurationType = null
  ): RoleMapping = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (AmbiguousRoleResolution != null) __obj.updateDynamic("AmbiguousRoleResolution")(AmbiguousRoleResolution.asInstanceOf[js.Any])
    if (RulesConfiguration != null) __obj.updateDynamic("RulesConfiguration")(RulesConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleMapping]
  }
}

