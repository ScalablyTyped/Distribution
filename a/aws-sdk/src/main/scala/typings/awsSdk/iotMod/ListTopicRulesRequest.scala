package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTopicRulesRequest extends js.Object {
  /**
    * The maximum number of results to return.
    */
  var maxResults: js.UndefOr[TopicRuleMaxResults] = js.native
  /**
    * A token used to retrieve the next value.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * Specifies whether the rule is disabled.
    */
  var ruleDisabled: js.UndefOr[IsDisabled] = js.native
  /**
    * The topic.
    */
  var topic: js.UndefOr[Topic] = js.native
}

object ListTopicRulesRequest {
  @scala.inline
  def apply(
    maxResults: js.UndefOr[TopicRuleMaxResults] = js.undefined,
    nextToken: NextToken = null,
    ruleDisabled: js.UndefOr[IsDisabled] = js.undefined,
    topic: Topic = null
  ): ListTopicRulesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (!js.isUndefined(ruleDisabled)) __obj.updateDynamic("ruleDisabled")(ruleDisabled.get.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTopicRulesRequest]
  }
}

