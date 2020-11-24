package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTopicRulesRequest extends js.Object {
  
  /**
    * The maximum number of results to return.
    */
  var maxResults: js.UndefOr[TopicRuleMaxResults] = js.native
  
  /**
    * To retrieve the next set of results, the nextToken value from a previous response; otherwise null to receive the first set of results.
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
  def apply(): ListTopicRulesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTopicRulesRequest]
  }
  
  @scala.inline
  implicit class ListTopicRulesRequestOps[Self <: ListTopicRulesRequest] (val x: Self) extends AnyVal {
    
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
    def setMaxResults(value: TopicRuleMaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setRuleDisabled(value: IsDisabled): Self = this.set("ruleDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleDisabled: Self = this.set("ruleDisabled", js.undefined)
    
    @scala.inline
    def setTopic(value: Topic): Self = this.set("topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopic: Self = this.set("topic", js.undefined)
  }
}
