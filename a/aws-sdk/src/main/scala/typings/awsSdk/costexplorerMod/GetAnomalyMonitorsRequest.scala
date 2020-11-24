package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAnomalyMonitorsRequest extends js.Object {
  
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
  implicit class GetAnomalyMonitorsRequestOps[Self <: GetAnomalyMonitorsRequest] (val x: Self) extends AnyVal {
    
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
    def setMaxResults(value: PageSize): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setMonitorArnListVarargs(value: Value*): Self = this.set("MonitorArnList", js.Array(value :_*))
    
    @scala.inline
    def setMonitorArnList(value: Values): Self = this.set("MonitorArnList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitorArnList: Self = this.set("MonitorArnList", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: NextPageToken): Self = this.set("NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("NextPageToken", js.undefined)
  }
}
