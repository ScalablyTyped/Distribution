package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAggregateComplianceByConfigRulesResponse extends StObject {
  
  /**
    * Returns a list of AggregateComplianceByConfigRule object.
    */
  var AggregateComplianceByConfigRules: js.UndefOr[AggregateComplianceByConfigRuleList] = js.undefined
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.undefined
}
object DescribeAggregateComplianceByConfigRulesResponse {
  
  @scala.inline
  def apply(): DescribeAggregateComplianceByConfigRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAggregateComplianceByConfigRulesResponse]
  }
  
  @scala.inline
  implicit class DescribeAggregateComplianceByConfigRulesResponseMutableBuilder[Self <: DescribeAggregateComplianceByConfigRulesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregateComplianceByConfigRules(value: AggregateComplianceByConfigRuleList): Self = StObject.set(x, "AggregateComplianceByConfigRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateComplianceByConfigRulesUndefined: Self = StObject.set(x, "AggregateComplianceByConfigRules", js.undefined)
    
    @scala.inline
    def setAggregateComplianceByConfigRulesVarargs(value: AggregateComplianceByConfigRule*): Self = StObject.set(x, "AggregateComplianceByConfigRules", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
