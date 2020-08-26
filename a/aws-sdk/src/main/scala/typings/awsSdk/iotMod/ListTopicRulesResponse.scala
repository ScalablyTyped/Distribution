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
  def apply(): ListTopicRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTopicRulesResponse]
  }
  @scala.inline
  implicit class ListTopicRulesResponseOps[Self <: ListTopicRulesResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setRulesVarargs(value: TopicRuleListItem*): Self = this.set("rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: TopicRuleList): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
  }
  
}

