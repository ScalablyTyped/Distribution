package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoleMapping extends StObject {
  
  /**
    * <p>If you specify Token or Rules as the <code>Type</code>,
    *             <code>AmbiguousRoleResolution</code> is required.</p>
    *          <p>Specifies the action to be taken if either no rules match the claim value for the
    *             <code>Rules</code> type, or there is no <code>cognito:preferred_role</code> claim and
    *          there are multiple <code>cognito:roles</code> matches for the <code>Token</code>
    *          type.</p>
    */
  var AmbiguousRoleResolution: js.UndefOr[AmbiguousRoleResolutionType | String] = js.undefined
  
  /**
    * <p>The rules to be used for mapping users to roles.</p>
    *          <p>If you specify Rules as the role mapping type, <code>RulesConfiguration</code> is
    *          required.</p>
    */
  var RulesConfiguration: js.UndefOr[RulesConfigurationType] = js.undefined
  
  /**
    * <p>The role mapping type. Token will use <code>cognito:roles</code> and
    *             <code>cognito:preferred_role</code> claims from the Cognito identity provider token to
    *          map groups to roles. Rules will attempt to match claims from the token to map to a
    *          role.</p>
    */
  var Type: js.UndefOr[RoleMappingType | String] = js.undefined
}
object RoleMapping {
  
  inline def apply(): RoleMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleMapping]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "RoleMapping")
  @js.native
  val ^ : js.Any = js.native
  
  inline def filterSensitiveLog(obj: RoleMapping): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("filterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  extension [Self <: RoleMapping](x: Self) {
    
    inline def setAmbiguousRoleResolution(value: AmbiguousRoleResolutionType | String): Self = StObject.set(x, "AmbiguousRoleResolution", value.asInstanceOf[js.Any])
    
    inline def setAmbiguousRoleResolutionUndefined: Self = StObject.set(x, "AmbiguousRoleResolution", js.undefined)
    
    inline def setRulesConfiguration(value: RulesConfigurationType): Self = StObject.set(x, "RulesConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRulesConfigurationUndefined: Self = StObject.set(x, "RulesConfiguration", js.undefined)
    
    inline def setType(value: RoleMappingType | String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
