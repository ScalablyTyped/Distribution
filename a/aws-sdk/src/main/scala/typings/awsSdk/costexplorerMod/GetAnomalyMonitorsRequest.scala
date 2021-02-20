package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAnomalyMonitorsRequest extends StObject {
  
  /**
    *  The number of entries a paginated response contains. 
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  
  /**
    *  A list of cost anomaly monitor ARNs. 
    */
  var MonitorArnList: js.UndefOr[Values] = js.native
  
  /**
    *  The token to retrieve the next set of results. AWS provides the token when the response from a previous call has more results than the maximum page size. 
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.costexplorerMod.NextPageToken] = js.native
}
object GetAnomalyMonitorsRequest {
  
  @scala.inline
  def apply(): GetAnomalyMonitorsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAnomalyMonitorsRequest]
  }
  
  @scala.inline
  implicit class GetAnomalyMonitorsRequestMutableBuilder[Self <: GetAnomalyMonitorsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setMonitorArnList(value: Values): Self = StObject.set(x, "MonitorArnList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitorArnListUndefined: Self = StObject.set(x, "MonitorArnList", js.undefined)
    
    @scala.inline
    def setMonitorArnListVarargs(value: Value*): Self = StObject.set(x, "MonitorArnList", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
  }
}
