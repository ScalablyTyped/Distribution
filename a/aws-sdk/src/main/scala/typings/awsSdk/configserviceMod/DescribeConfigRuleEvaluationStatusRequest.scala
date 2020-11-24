package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConfigRuleEvaluationStatusRequest extends js.Object {
  
  /**
    * The name of the AWS managed Config rules for which you want status information. If you do not specify any names, AWS Config returns status information for all AWS managed Config rules that you use.
    */
  var ConfigRuleNames: js.UndefOr[typings.awsSdk.configserviceMod.ConfigRuleNames] = js.native
  
  /**
    * The number of rule evaluation results that you want returned. This parameter is required if the rule limit for your account is more than the default of 150 rules. For information about requesting a rule limit increase, see AWS Config Limits in the AWS General Reference Guide.
    */
  var Limit: js.UndefOr[RuleLimit] = js.native
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeConfigRuleEvaluationStatusRequest {
  
  @scala.inline
  def apply(): DescribeConfigRuleEvaluationStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigRuleEvaluationStatusRequest]
  }
  
  @scala.inline
  implicit class DescribeConfigRuleEvaluationStatusRequestOps[Self <: DescribeConfigRuleEvaluationStatusRequest] (val x: Self) extends AnyVal {
    
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
    def setConfigRuleNamesVarargs(value: ConfigRuleName*): Self = this.set("ConfigRuleNames", js.Array(value :_*))
    
    @scala.inline
    def setConfigRuleNames(value: ConfigRuleNames): Self = this.set("ConfigRuleNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigRuleNames: Self = this.set("ConfigRuleNames", js.undefined)
    
    @scala.inline
    def setLimit(value: RuleLimit): Self = this.set("Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
