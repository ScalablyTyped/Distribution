package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMatchmakingConfigurationsInput extends js.Object {
  /**
    * The maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages. This parameter is limited to 10.
    */
  var Limit: js.UndefOr[PositiveInteger] = js.native
  /**
    * A unique identifier for a matchmaking configuration(s) to retrieve. You can use either the configuration name or ARN value. To request all existing configurations, leave this parameter empty.
    */
  var Names: js.UndefOr[MatchmakingConfigurationNameList] = js.native
  /**
    * A token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A unique identifier for a matchmaking rule set. You can use either the rule set name or ARN value. Use this parameter to retrieve all matchmaking configurations that use this rule set.
    */
  var RuleSetName: js.UndefOr[MatchmakingRuleSetName] = js.native
}

object DescribeMatchmakingConfigurationsInput {
  @scala.inline
  def apply(): DescribeMatchmakingConfigurationsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMatchmakingConfigurationsInput]
  }
  @scala.inline
  implicit class DescribeMatchmakingConfigurationsInputOps[Self <: DescribeMatchmakingConfigurationsInput] (val x: Self) extends AnyVal {
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
    def setLimit(value: PositiveInteger): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    @scala.inline
    def setNamesVarargs(value: MatchmakingConfigurationName*): Self = this.set("Names", js.Array(value :_*))
    @scala.inline
    def setNames(value: MatchmakingConfigurationNameList): Self = this.set("Names", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNames: Self = this.set("Names", js.undefined)
    @scala.inline
    def setNextToken(value: NonZeroAndMaxString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setRuleSetName(value: MatchmakingRuleSetName): Self = this.set("RuleSetName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleSetName: Self = this.set("RuleSetName", js.undefined)
  }
  
}

