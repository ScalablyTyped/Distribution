package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizeSecurityGroupEgressResult extends StObject {
  
  /**
    * Returns true if the request succeeds; otherwise, returns an error.
    */
  var Return: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Information about the outbound (egress) security group rules that were added.
    */
  var SecurityGroupRules: js.UndefOr[SecurityGroupRuleList] = js.undefined
}
object AuthorizeSecurityGroupEgressResult {
  
  inline def apply(): AuthorizeSecurityGroupEgressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeSecurityGroupEgressResult]
  }
  
  extension [Self <: AuthorizeSecurityGroupEgressResult](x: Self) {
    
    inline def setReturn(value: Boolean): Self = StObject.set(x, "Return", value.asInstanceOf[js.Any])
    
    inline def setReturnUndefined: Self = StObject.set(x, "Return", js.undefined)
    
    inline def setSecurityGroupRules(value: SecurityGroupRuleList): Self = StObject.set(x, "SecurityGroupRules", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupRulesUndefined: Self = StObject.set(x, "SecurityGroupRules", js.undefined)
    
    inline def setSecurityGroupRulesVarargs(value: SecurityGroupRule*): Self = StObject.set(x, "SecurityGroupRules", js.Array(value*))
  }
}
