package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTopicRulesResponse extends js.Object {
  /**
    * A token used to retrieve the next value.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The rules.
    */
  var rules: js.UndefOr[TopicRuleList] = js.native
}

object ListTopicRulesResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, rules: TopicRuleList = null): ListTopicRulesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTopicRulesResponse]
  }
}

