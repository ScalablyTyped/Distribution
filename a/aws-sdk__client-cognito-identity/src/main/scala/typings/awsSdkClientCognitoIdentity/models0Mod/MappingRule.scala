package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingRule extends StObject {
  
  /**
    * <p>The claim name that must be present in the token, for example, "isAdmin" or
    *          "paid".</p>
    */
  var Claim: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The match condition that specifies how closely the claim value in the IdP token must
    *          match <code>Value</code>.</p>
    */
  var MatchType: js.UndefOr[MappingRuleMatchType | String] = js.undefined
  
  /**
    * <p>The role ARN.</p>
    */
  var RoleARN: js.UndefOr[String] = js.undefined
  
  /**
    * <p>A brief string that the claim must match, for example, "paid" or "yes".</p>
    */
  var Value: js.UndefOr[String] = js.undefined
}
object MappingRule {
  
  @scala.inline
  def apply(): MappingRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MappingRule]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "MappingRule")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def filterSensitiveLog(obj: MappingRule): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("filterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  implicit class MappingRuleMutableBuilder[Self <: MappingRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClaim(value: String): Self = StObject.set(x, "Claim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimUndefined: Self = StObject.set(x, "Claim", js.undefined)
    
    @scala.inline
    def setMatchType(value: MappingRuleMatchType | String): Self = StObject.set(x, "MatchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchTypeUndefined: Self = StObject.set(x, "MatchType", js.undefined)
    
    @scala.inline
    def setRoleARN(value: String): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
