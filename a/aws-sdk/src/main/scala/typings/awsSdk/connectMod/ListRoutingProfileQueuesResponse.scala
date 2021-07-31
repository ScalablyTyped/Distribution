package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRoutingProfileQueuesResponse extends StObject {
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.undefined
  
  /**
    * Information about the routing profiles.
    */
  var RoutingProfileQueueConfigSummaryList: js.UndefOr[typings.awsSdk.connectMod.RoutingProfileQueueConfigSummaryList] = js.undefined
}
object ListRoutingProfileQueuesResponse {
  
  @scala.inline
  def apply(): ListRoutingProfileQueuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRoutingProfileQueuesResponse]
  }
  
  @scala.inline
  implicit class ListRoutingProfileQueuesResponseMutableBuilder[Self <: ListRoutingProfileQueuesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRoutingProfileQueueConfigSummaryList(value: RoutingProfileQueueConfigSummaryList): Self = StObject.set(x, "RoutingProfileQueueConfigSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingProfileQueueConfigSummaryListUndefined: Self = StObject.set(x, "RoutingProfileQueueConfigSummaryList", js.undefined)
    
    @scala.inline
    def setRoutingProfileQueueConfigSummaryListVarargs(value: RoutingProfileQueueConfigSummary*): Self = StObject.set(x, "RoutingProfileQueueConfigSummaryList", js.Array(value :_*))
  }
}
