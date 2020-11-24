package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAggregateComplianceByConfigRulesResponse extends js.Object {
  
  /**
    * Returns a list of AggregateComplianceByConfigRule object.
    */
  var AggregateComplianceByConfigRules: js.UndefOr[AggregateComplianceByConfigRuleList] = js.native
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
}
object DescribeAggregateComplianceByConfigRulesResponse {
  
  @scala.inline
  def apply(): DescribeAggregateComplianceByConfigRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAggregateComplianceByConfigRulesResponse]
  }
  
  @scala.inline
  implicit class DescribeAggregateComplianceByConfigRulesResponseOps[Self <: DescribeAggregateComplianceByConfigRulesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAggregateComplianceByConfigRulesVarargs(value: AggregateComplianceByConfigRule*): Self = this.set("AggregateComplianceByConfigRules", js.Array(value :_*))
    
    @scala.inline
    def setAggregateComplianceByConfigRules(value: AggregateComplianceByConfigRuleList): Self = this.set("AggregateComplianceByConfigRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregateComplianceByConfigRules: Self = this.set("AggregateComplianceByConfigRules", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
