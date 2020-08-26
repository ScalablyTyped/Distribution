package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSendStatisticsResponse extends js.Object {
  /**
    * A list of data points, each of which represents 15 minutes of activity.
    */
  var SendDataPoints: js.UndefOr[SendDataPointList] = js.native
}

object GetSendStatisticsResponse {
  @scala.inline
  def apply(): GetSendStatisticsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSendStatisticsResponse]
  }
  @scala.inline
  implicit class GetSendStatisticsResponseOps[Self <: GetSendStatisticsResponse] (val x: Self) extends AnyVal {
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
    def setSendDataPointsVarargs(value: SendDataPoint*): Self = this.set("SendDataPoints", js.Array(value :_*))
    @scala.inline
    def setSendDataPoints(value: SendDataPointList): Self = this.set("SendDataPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendDataPoints: Self = this.set("SendDataPoints", js.undefined)
  }
  
}

