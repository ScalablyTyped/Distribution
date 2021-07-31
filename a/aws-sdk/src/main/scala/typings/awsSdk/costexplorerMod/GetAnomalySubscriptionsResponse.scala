package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAnomalySubscriptionsResponse extends StObject {
  
  /**
    *  A list of cost anomaly subscriptions that includes the detailed metadata for each one. 
    */
  var AnomalySubscriptions: typings.awsSdk.costexplorerMod.AnomalySubscriptions
  
  /**
    *  The token to retrieve the next set of results. AWS provides the token when the response from a previous call has more results than the maximum page size. 
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.costexplorerMod.NextPageToken] = js.undefined
}
object GetAnomalySubscriptionsResponse {
  
  @scala.inline
  def apply(AnomalySubscriptions: AnomalySubscriptions): GetAnomalySubscriptionsResponse = {
    val __obj = js.Dynamic.literal(AnomalySubscriptions = AnomalySubscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAnomalySubscriptionsResponse]
  }
  
  @scala.inline
  implicit class GetAnomalySubscriptionsResponseMutableBuilder[Self <: GetAnomalySubscriptionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnomalySubscriptions(value: AnomalySubscriptions): Self = StObject.set(x, "AnomalySubscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnomalySubscriptionsVarargs(value: AnomalySubscription*): Self = StObject.set(x, "AnomalySubscriptions", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
  }
}
