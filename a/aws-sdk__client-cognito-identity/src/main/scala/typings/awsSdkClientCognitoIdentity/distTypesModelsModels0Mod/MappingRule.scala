package typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod

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
  
  inline def apply(): MappingRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MappingRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappingRule] (val x: Self) extends AnyVal {
    
    inline def setClaim(value: String): Self = StObject.set(x, "Claim", value.asInstanceOf[js.Any])
    
    inline def setClaimUndefined: Self = StObject.set(x, "Claim", js.undefined)
    
    inline def setMatchType(value: MappingRuleMatchType | String): Self = StObject.set(x, "MatchType", value.asInstanceOf[js.Any])
    
    inline def setMatchTypeUndefined: Self = StObject.set(x, "MatchType", js.undefined)
    
    inline def setRoleARN(value: String): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    inline def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
