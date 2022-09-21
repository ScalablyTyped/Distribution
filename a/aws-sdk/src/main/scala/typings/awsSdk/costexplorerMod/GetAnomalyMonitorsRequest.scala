package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAnomalyMonitorsRequest extends StObject {
  
  /**
    * The number of entries that a paginated response contains. 
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * A list of cost anomaly monitor ARNs. 
    */
  var MonitorArnList: js.UndefOr[Values] = js.undefined
  
  /**
    * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size. 
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.costexplorerMod.NextPageToken] = js.undefined
}
object GetAnomalyMonitorsRequest {
  
  inline def apply(): GetAnomalyMonitorsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAnomalyMonitorsRequest]
  }
  
  extension [Self <: GetAnomalyMonitorsRequest](x: Self) {
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMonitorArnList(value: Values): Self = StObject.set(x, "MonitorArnList", value.asInstanceOf[js.Any])
    
    inline def setMonitorArnListUndefined: Self = StObject.set(x, "MonitorArnList", js.undefined)
    
    inline def setMonitorArnListVarargs(value: Value*): Self = StObject.set(x, "MonitorArnList", js.Array(value*))
    
    inline def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
  }
}
