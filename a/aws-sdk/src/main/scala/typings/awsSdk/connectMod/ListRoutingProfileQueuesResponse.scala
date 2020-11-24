package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRoutingProfileQueuesResponse extends js.Object {
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.native
  
  /**
    * Information about the routing profiles.
    */
  var RoutingProfileQueueConfigSummaryList: js.UndefOr[typings.awsSdk.connectMod.RoutingProfileQueueConfigSummaryList] = js.native
}
object ListRoutingProfileQueuesResponse {
  
  @scala.inline
  def apply(): ListRoutingProfileQueuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRoutingProfileQueuesResponse]
  }
  
  @scala.inline
  implicit class ListRoutingProfileQueuesResponseOps[Self <: ListRoutingProfileQueuesResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setRoutingProfileQueueConfigSummaryListVarargs(value: RoutingProfileQueueConfigSummary*): Self = this.set("RoutingProfileQueueConfigSummaryList", js.Array(value :_*))
    
    @scala.inline
    def setRoutingProfileQueueConfigSummaryList(value: RoutingProfileQueueConfigSummaryList): Self = this.set("RoutingProfileQueueConfigSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutingProfileQueueConfigSummaryList: Self = this.set("RoutingProfileQueueConfigSummaryList", js.undefined)
  }
}
