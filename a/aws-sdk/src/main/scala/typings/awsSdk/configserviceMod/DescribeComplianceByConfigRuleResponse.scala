package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeComplianceByConfigRuleResponse extends js.Object {
  /**
    * Indicates whether each of the specified AWS Config rules is compliant.
    */
  var ComplianceByConfigRules: js.UndefOr[typings.awsSdk.configserviceMod.ComplianceByConfigRules] = js.native
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeComplianceByConfigRuleResponse {
  @scala.inline
  def apply(): DescribeComplianceByConfigRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeComplianceByConfigRuleResponse]
  }
  @scala.inline
  implicit class DescribeComplianceByConfigRuleResponseOps[Self <: DescribeComplianceByConfigRuleResponse] (val x: Self) extends AnyVal {
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
    def setComplianceByConfigRulesVarargs(value: ComplianceByConfigRule*): Self = this.set("ComplianceByConfigRules", js.Array(value :_*))
    @scala.inline
    def setComplianceByConfigRules(value: ComplianceByConfigRules): Self = this.set("ComplianceByConfigRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplianceByConfigRules: Self = this.set("ComplianceByConfigRules", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

