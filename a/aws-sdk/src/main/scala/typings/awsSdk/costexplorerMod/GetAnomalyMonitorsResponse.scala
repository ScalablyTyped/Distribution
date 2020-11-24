package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAnomalyMonitorsResponse extends js.Object {
  
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
  implicit class GetAnomalyMonitorsResponseOps[Self <: GetAnomalyMonitorsResponse] (val x: Self) extends AnyVal {
    
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
    def setAnomalyMonitorsVarargs(value: AnomalyMonitor*): Self = this.set("AnomalyMonitors", js.Array(value :_*))
    
    @scala.inline
    def setAnomalyMonitors(value: AnomalyMonitors): Self = this.set("AnomalyMonitors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageToken(value: NextPageToken): Self = this.set("NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("NextPageToken", js.undefined)
  }
}
