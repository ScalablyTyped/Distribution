package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDistributionsResult extends js.Object {
  
  /**
    * An array of objects that describe your distributions.
    */
  var distributions: js.UndefOr[DistributionList] = js.native
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetDistributions request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GetDistributionsResult {
  
  @scala.inline
  def apply(): GetDistributionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDistributionsResult]
  }
  
  @scala.inline
  implicit class GetDistributionsResultOps[Self <: GetDistributionsResult] (val x: Self) extends AnyVal {
    
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
    def setDistributionsVarargs(value: LightsailDistribution*): Self = this.set("distributions", js.Array(value :_*))
    
    @scala.inline
    def setDistributions(value: DistributionList): Self = this.set("distributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistributions: Self = this.set("distributions", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
