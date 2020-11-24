package typings.awsSdkClientCognitoIdentity.models0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoleMapping extends js.Object {
  
  /**
    * <p>If you specify Token or Rules as the <code>Type</code>,
    *             <code>AmbiguousRoleResolution</code> is required.</p>
    *          <p>Specifies the action to be taken if either no rules match the claim value for the
    *             <code>Rules</code> type, or there is no <code>cognito:preferred_role</code> claim and
    *          there are multiple <code>cognito:roles</code> matches for the <code>Token</code>
    *          type.</p>
    */
  var AmbiguousRoleResolution: js.UndefOr[AmbiguousRoleResolutionType | String] = js.native
  
  /**
    * <p>The rules to be used for mapping users to roles.</p>
    *          <p>If you specify Rules as the role mapping type, <code>RulesConfiguration</code> is
    *          required.</p>
    */
  var RulesConfiguration: js.UndefOr[RulesConfigurationType] = js.native
  
  /**
    * <p>The role mapping type. Token will use <code>cognito:roles</code> and
    *             <code>cognito:preferred_role</code> claims from the Cognito identity provider token to
    *          map groups to roles. Rules will attempt to match claims from the token to map to a
    *          role.</p>
    */
  var Type: js.UndefOr[RoleMappingType | String] = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "RoleMapping")
@js.native
object RoleMapping extends js.Object {
  
  def filterSensitiveLog(obj: RoleMapping): js.Any = js.native
}
