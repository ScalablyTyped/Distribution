package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAnomalySubscriptionsResponse extends js.Object {
  
  /**
    *  A list of cost anomaly subscriptions that includes the detailed metadata for each one. 
    */
  var AnomalySubscriptions: typings.awsSdk.costexplorerMod.AnomalySubscriptions = js.native
  
  /**
    *  The token to retrieve the next set of results. AWS provides the token when the response from a previous call has more results than the maximum page size. 
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.costexplorerMod.NextPageToken] = js.native
}
object GetAnomalySubscriptionsResponse {
  
  @scala.inline
  def apply(AnomalySubscriptions: AnomalySubscriptions): GetAnomalySubscriptionsResponse = {
    val __obj = js.Dynamic.literal(AnomalySubscriptions = AnomalySubscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAnomalySubscriptionsResponse]
  }
  
  @scala.inline
  implicit class GetAnomalySubscriptionsResponseOps[Self <: GetAnomalySubscriptionsResponse] (val x: Self) extends AnyVal {
    
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
    def setAnomalySubscriptionsVarargs(value: AnomalySubscription*): Self = this.set("AnomalySubscriptions", js.Array(value :_*))
    
    @scala.inline
    def setAnomalySubscriptions(value: AnomalySubscriptions): Self = this.set("AnomalySubscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageToken(value: NextPageToken): Self = this.set("NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("NextPageToken", js.undefined)
  }
}
