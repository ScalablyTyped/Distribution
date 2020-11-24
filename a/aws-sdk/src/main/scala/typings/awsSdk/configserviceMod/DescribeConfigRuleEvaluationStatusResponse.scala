package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConfigRuleEvaluationStatusResponse extends js.Object {
  
  /**
    * Status information about your AWS managed Config rules.
    */
  var ConfigRulesEvaluationStatus: js.UndefOr[ConfigRuleEvaluationStatusList] = js.native
  
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeConfigRuleEvaluationStatusResponse {
  
  @scala.inline
  def apply(): DescribeConfigRuleEvaluationStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigRuleEvaluationStatusResponse]
  }
  
  @scala.inline
  implicit class DescribeConfigRuleEvaluationStatusResponseOps[Self <: DescribeConfigRuleEvaluationStatusResponse] (val x: Self) extends AnyVal {
    
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
    def setConfigRulesEvaluationStatusVarargs(value: ConfigRuleEvaluationStatus*): Self = this.set("ConfigRulesEvaluationStatus", js.Array(value :_*))
    
    @scala.inline
    def setConfigRulesEvaluationStatus(value: ConfigRuleEvaluationStatusList): Self = this.set("ConfigRulesEvaluationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigRulesEvaluationStatus: Self = this.set("ConfigRulesEvaluationStatus", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
