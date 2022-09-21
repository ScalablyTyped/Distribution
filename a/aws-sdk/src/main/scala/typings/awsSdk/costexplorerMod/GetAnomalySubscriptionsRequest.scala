package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAnomalySubscriptionsRequest extends StObject {
  
  /**
    * The number of entries a paginated response contains. 
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * Cost anomaly monitor ARNs. 
    */
  var MonitorArn: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size. 
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.costexplorerMod.NextPageToken] = js.undefined
  
  /**
    * A list of cost anomaly subscription ARNs. 
    */
  var SubscriptionArnList: js.UndefOr[Values] = js.undefined
}
object GetAnomalySubscriptionsRequest {
  
  inline def apply(): GetAnomalySubscriptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAnomalySubscriptionsRequest]
  }
  
  extension [Self <: GetAnomalySubscriptionsRequest](x: Self) {
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMonitorArn(value: GenericString): Self = StObject.set(x, "MonitorArn", value.asInstanceOf[js.Any])
    
    inline def setMonitorArnUndefined: Self = StObject.set(x, "MonitorArn", js.undefined)
    
    inline def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setSubscriptionArnList(value: Values): Self = StObject.set(x, "SubscriptionArnList", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionArnListUndefined: Self = StObject.set(x, "SubscriptionArnList", js.undefined)
    
    inline def setSubscriptionArnListVarargs(value: Value*): Self = StObject.set(x, "SubscriptionArnList", js.Array(value*))
  }
}
