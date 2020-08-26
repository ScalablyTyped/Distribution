package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSampledRequestsResponse extends js.Object {
  /**
    * The total number of requests from which GetSampledRequests got a sample of MaxItems requests. If PopulationSize is less than MaxItems, the sample includes every request that your AWS resource received during the specified time range.
    */
  var PopulationSize: js.UndefOr[typings.awsSdk.wafMod.PopulationSize] = js.native
  /**
    * A complex type that contains detailed information about each of the requests in the sample.
    */
  var SampledRequests: js.UndefOr[SampledHTTPRequests] = js.native
  /**
    * Usually, TimeWindow is the time range that you specified in the GetSampledRequests request. However, if your AWS resource received more than 5,000 requests during the time range that you specified in the request, GetSampledRequests returns the time range for the first 5,000 requests. Times are in Coordinated Universal Time (UTC) format.
    */
  var TimeWindow: js.UndefOr[typings.awsSdk.wafMod.TimeWindow] = js.native
}

object GetSampledRequestsResponse {
  @scala.inline
  def apply(): GetSampledRequestsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSampledRequestsResponse]
  }
  @scala.inline
  implicit class GetSampledRequestsResponseOps[Self <: GetSampledRequestsResponse] (val x: Self) extends AnyVal {
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
    def setPopulationSize(value: PopulationSize): Self = this.set("PopulationSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopulationSize: Self = this.set("PopulationSize", js.undefined)
    @scala.inline
    def setSampledRequestsVarargs(value: SampledHTTPRequest*): Self = this.set("SampledRequests", js.Array(value :_*))
    @scala.inline
    def setSampledRequests(value: SampledHTTPRequests): Self = this.set("SampledRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampledRequests: Self = this.set("SampledRequests", js.undefined)
    @scala.inline
    def setTimeWindow(value: TimeWindow): Self = this.set("TimeWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeWindow: Self = this.set("TimeWindow", js.undefined)
  }
  
}

