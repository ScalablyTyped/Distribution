package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSecurityGroupRulesResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about security group rules.
    */
  var SecurityGroupRules: js.UndefOr[SecurityGroupRuleList] = js.undefined
}
object DescribeSecurityGroupRulesResult {
  
  inline def apply(): DescribeSecurityGroupRulesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSecurityGroupRulesResult]
  }
  
  extension [Self <: DescribeSecurityGroupRulesResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSecurityGroupRules(value: SecurityGroupRuleList): Self = StObject.set(x, "SecurityGroupRules", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupRulesUndefined: Self = StObject.set(x, "SecurityGroupRules", js.undefined)
    
    inline def setSecurityGroupRulesVarargs(value: SecurityGroupRule*): Self = StObject.set(x, "SecurityGroupRules", js.Array(value*))
  }
}
