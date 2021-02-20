package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAnomalyMonitorsResponse extends StObject {
  
  /**
    *  A list of cost anomaly monitors that includes the detailed metadata for each monitor. 
    */
  var AnomalyMonitors: typings.awsSdk.costexplorerMod.AnomalyMonitors = js.native
  
  /**
    *  The token to retrieve the next set of results. AWS provides the token when the response from a previous call has more results than the maximum page size. 
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.costexplorerMod.NextPageToken] = js.native
}
object GetAnomalyMonitorsResponse {
  
  @scala.inline
  def apply(AnomalyMonitors: AnomalyMonitors): GetAnomalyMonitorsResponse = {
    val __obj = js.Dynamic.literal(AnomalyMonitors = AnomalyMonitors.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAnomalyMonitorsResponse]
  }
  
  @scala.inline
  implicit class GetAnomalyMonitorsResponseMutableBuilder[Self <: GetAnomalyMonitorsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnomalyMonitors(value: AnomalyMonitors): Self = StObject.set(x, "AnomalyMonitors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnomalyMonitorsVarargs(value: AnomalyMonitor*): Self = StObject.set(x, "AnomalyMonitors", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
  }
}
