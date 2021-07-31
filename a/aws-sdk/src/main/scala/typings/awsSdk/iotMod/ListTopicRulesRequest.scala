package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTopicRulesRequest extends StObject {
  
  /**
    * The maximum number of results to return.
    */
  var maxResults: js.UndefOr[TopicRuleMaxResults] = js.undefined
  
  /**
    * To retrieve the next set of results, the nextToken value from a previous response; otherwise null to receive the first set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Specifies whether the rule is disabled.
    */
  var ruleDisabled: js.UndefOr[IsDisabled] = js.undefined
  
  /**
    * The topic.
    */
  var topic: js.UndefOr[Topic] = js.undefined
}
object ListTopicRulesRequest {
  
  @scala.inline
  def apply(): ListTopicRulesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTopicRulesRequest]
  }
  
  @scala.inline
  implicit class ListTopicRulesRequestMutableBuilder[Self <: ListTopicRulesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: TopicRuleMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setRuleDisabled(value: IsDisabled): Self = StObject.set(x, "ruleDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleDisabledUndefined: Self = StObject.set(x, "ruleDisabled", js.undefined)
    
    @scala.inline
    def setTopic(value: Topic): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
