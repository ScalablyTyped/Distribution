package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAnomaliesResponse extends js.Object {
  
  /**
    *  A list of cost anomalies. 
    */
  var Anomalies: typings.awsSdk.costexplorerMod.Anomalies = js.native
  
  /**
    *  The token to retrieve the next set of results. AWS provides the token when the response from a previous call has more results than the maximum page size. 
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.costexplorerMod.NextPageToken] = js.native
}
object GetAnomaliesResponse {
  
  @scala.inline
  def apply(Anomalies: Anomalies): GetAnomaliesResponse = {
    val __obj = js.Dynamic.literal(Anomalies = Anomalies.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAnomaliesResponse]
  }
  
  @scala.inline
  implicit class GetAnomaliesResponseOps[Self <: GetAnomaliesResponse] (val x: Self) extends AnyVal {
    
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
    def setAnomaliesVarargs(value: Anomaly*): Self = this.set("Anomalies", js.Array(value :_*))
    
    @scala.inline
    def setAnomalies(value: Anomalies): Self = this.set("Anomalies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageToken(value: NextPageToken): Self = this.set("NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("NextPageToken", js.undefined)
  }
}
