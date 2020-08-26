package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInsightRulesInput extends js.Object {
  /**
    * This parameter is not currently used. Reserved for future use. If it is used in the future, the maximum value might be different.
    */
  var MaxResults: js.UndefOr[InsightRuleMaxResults] = js.native
  /**
    * Reserved for future use.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatchMod.NextToken] = js.native
}

object DescribeInsightRulesInput {
  @scala.inline
  def apply(): DescribeInsightRulesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInsightRulesInput]
  }
  @scala.inline
  implicit class DescribeInsightRulesInputOps[Self <: DescribeInsightRulesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaxResults(value: InsightRuleMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

