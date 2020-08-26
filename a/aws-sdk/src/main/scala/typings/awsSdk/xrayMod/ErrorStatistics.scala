package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorStatistics extends js.Object {
  /**
    * The number of requests that failed with untracked 4xx Client Error status codes.
    */
  var OtherCount: js.UndefOr[NullableLong] = js.native
  /**
    * The number of requests that failed with a 419 throttling status code.
    */
  var ThrottleCount: js.UndefOr[NullableLong] = js.native
  /**
    * The total number of requests that failed with a 4xx Client Error status code.
    */
  var TotalCount: js.UndefOr[NullableLong] = js.native
}

object ErrorStatistics {
  @scala.inline
  def apply(): ErrorStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorStatistics]
  }
  @scala.inline
  implicit class ErrorStatisticsOps[Self <: ErrorStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOtherCount(value: NullableLong): Self = this.set("OtherCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOtherCount: Self = this.set("OtherCount", js.undefined)
    @scala.inline
    def setThrottleCount(value: NullableLong): Self = this.set("ThrottleCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrottleCount: Self = this.set("ThrottleCount", js.undefined)
    @scala.inline
    def setTotalCount(value: NullableLong): Self = this.set("TotalCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalCount: Self = this.set("TotalCount", js.undefined)
  }
  
}

