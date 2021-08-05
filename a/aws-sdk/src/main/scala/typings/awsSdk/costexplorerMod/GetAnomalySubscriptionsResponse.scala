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
  
  inline def apply(AnomalySubscriptions: AnomalySubscriptions): GetAnomalySubscriptionsResponse = {
    val __obj = js.Dynamic.literal(AnomalySubscriptions = AnomalySubscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAnomalySubscriptionsResponse]
  }
  
  extension [Self <: GetAnomalySubscriptionsResponse](x: Self) {
    
    inline def setAnomalySubscriptions(value: AnomalySubscriptions): Self = StObject.set(x, "AnomalySubscriptions", value.asInstanceOf[js.Any])
    
    inline def setAnomalySubscriptionsVarargs(value: AnomalySubscription*): Self = StObject.set(x, "AnomalySubscriptions", js.Array(value :_*))
    
    inline def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
  }
}
