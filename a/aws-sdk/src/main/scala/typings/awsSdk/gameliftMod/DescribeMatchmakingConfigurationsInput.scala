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
  def apply(
    Limit: js.UndefOr[PositiveInteger] = js.undefined,
    Names: MatchmakingConfigurationNameList = null,
    NextToken: NonZeroAndMaxString = null,
    RuleSetName: MatchmakingRuleSetName = null
  ): DescribeMatchmakingConfigurationsInput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit.get.asInstanceOf[js.Any])
    if (Names != null) __obj.updateDynamic("Names")(Names.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RuleSetName != null) __obj.updateDynamic("RuleSetName")(RuleSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMatchmakingConfigurationsInput]
  }
}

