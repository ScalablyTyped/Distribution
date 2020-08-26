package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConfigRulesRequest extends js.Object {
  /**
    * The names of the AWS Config rules for which you want details. If you do not specify any names, AWS Config returns details for all your rules.
    */
  var ConfigRuleNames: js.UndefOr[typings.awsSdk.configserviceMod.ConfigRuleNames] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeConfigRulesRequest {
  @scala.inline
  def apply(): DescribeConfigRulesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigRulesRequest]
  }
  @scala.inline
  implicit class DescribeConfigRulesRequestOps[Self <: DescribeConfigRulesRequest] (val x: Self) extends AnyVal {
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

