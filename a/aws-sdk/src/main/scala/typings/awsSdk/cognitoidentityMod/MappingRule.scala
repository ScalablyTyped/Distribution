package typings.awsSdk.cognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MappingRule extends StObject {
  
  /**
    * The claim name that must be present in the token, for example, "isAdmin" or "paid".
    */
  var Claim: ClaimName = js.native
  
  /**
    * The match condition that specifies how closely the claim value in the IdP token must match Value.
    */
  var MatchType: MappingRuleMatchType = js.native
  
  /**
    * The role ARN.
    */
  var RoleARN: ARNString = js.native
  
  /**
    * A brief string that the claim must match, for example, "paid" or "yes".
    */
  var Value: ClaimValue = js.native
}
object MappingRule {
  
  @scala.inline
  def apply(Claim: ClaimName, MatchType: MappingRuleMatchType, RoleARN: ARNString, Value: ClaimValue): MappingRule = {
    val __obj = js.Dynamic.literal(Claim = Claim.asInstanceOf[js.Any], MatchType = MatchType.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappingRule]
  }
  
  @scala.inline
  implicit class MappingRuleMutableBuilder[Self <: MappingRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClaim(value: ClaimName): Self = StObject.set(x, "Claim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchType(value: MappingRuleMatchType): Self = StObject.set(x, "MatchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleARN(value: ARNString): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ClaimValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
