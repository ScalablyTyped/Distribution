package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTopicRuleDestinationsResponse extends js.Object {
  
  /**
    * Information about a topic rule destination.
    */
  var destinationSummaries: js.UndefOr[TopicRuleDestinationSummaries] = js.native
  
  /**
    * The token to use to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListTopicRuleDestinationsResponse {
  
  @scala.inline
  def apply(): ListTopicRuleDestinationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTopicRuleDestinationsResponse]
  }
  
  @scala.inline
  implicit class ListTopicRuleDestinationsResponseOps[Self <: ListTopicRuleDestinationsResponse] (val x: Self) extends AnyVal {
    
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
    def setDestinationSummariesVarargs(value: TopicRuleDestinationSummary*): Self = this.set("destinationSummaries", js.Array(value :_*))
    
    @scala.inline
    def setDestinationSummaries(value: TopicRuleDestinationSummaries): Self = this.set("destinationSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationSummaries: Self = this.set("destinationSummaries", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
