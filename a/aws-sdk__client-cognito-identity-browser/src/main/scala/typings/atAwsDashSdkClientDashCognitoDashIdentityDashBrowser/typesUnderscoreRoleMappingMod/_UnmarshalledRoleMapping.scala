package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesUnderscoreRoleMappingMod

import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.atAwsDashSdkClientDashCognitoDashIdentityDashBrowserStrings.AuthenticatedRole
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.atAwsDashSdkClientDashCognitoDashIdentityDashBrowserStrings.Deny
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.atAwsDashSdkClientDashCognitoDashIdentityDashBrowserStrings.Rules
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.atAwsDashSdkClientDashCognitoDashIdentityDashBrowserStrings.Token
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesUnderscoreRulesConfigurationTypeMod._UnmarshalledRulesConfigurationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledRoleMapping extends _RoleMapping {
  /**
    * <p>The rules to be used for mapping users to roles.</p> <p>If you specify Rules as the role mapping type, <code>RulesConfiguration</code> is required.</p>
    */
  @JSName("RulesConfiguration")
  var RulesConfiguration__UnmarshalledRoleMapping: js.UndefOr[_UnmarshalledRulesConfigurationType] = js.undefined
}

object _UnmarshalledRoleMapping {
  @scala.inline
  def apply(
    Type: Token | Rules | String,
    AmbiguousRoleResolution: AuthenticatedRole | Deny | String = null,
    RulesConfiguration: _UnmarshalledRulesConfigurationType = null
  ): _UnmarshalledRoleMapping = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (AmbiguousRoleResolution != null) __obj.updateDynamic("AmbiguousRoleResolution")(AmbiguousRoleResolution.asInstanceOf[js.Any])
    if (RulesConfiguration != null) __obj.updateDynamic("RulesConfiguration")(RulesConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledRoleMapping]
  }
}

