package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAnomalyMonitorsResponse extends StObject {
  
  /**
    *  A list of cost anomaly monitors that includes the detailed metadata for each monitor. 
    */
  var AnomalyMonitors: typings.awsSdk.costexplorerMod.AnomalyMonitors
  
  /**
    *  The token to retrieve the next set of results. AWS provides the token when the response from a previous call has more results than the maximum page size. 
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.costexplorerMod.NextPageToken] = js.undefined
}
object GetAnomalyMonitorsResponse {
  
  inline def apply(AnomalyMonitors: AnomalyMonitors): GetAnomalyMonitorsResponse = {
    val __obj = js.Dynamic.literal(AnomalyMonitors = AnomalyMonitors.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAnomalyMonitorsResponse]
  }
  
  extension [Self <: GetAnomalyMonitorsResponse](x: Self) {
    
    inline def setAnomalyMonitors(value: AnomalyMonitors): Self = StObject.set(x, "AnomalyMonitors", value.asInstanceOf[js.Any])
    
    inline def setAnomalyMonitorsVarargs(value: AnomalyMonitor*): Self = StObject.set(x, "AnomalyMonitors", js.Array(value :_*))
    
    inline def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
  }
}
