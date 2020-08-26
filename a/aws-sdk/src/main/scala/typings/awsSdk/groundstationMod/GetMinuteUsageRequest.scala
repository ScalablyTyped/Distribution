package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMinuteUsageRequest extends js.Object {
  /**
    * The month being requested, with a value of 1-12.
    */
  var month: Integer = js.native
  /**
    * The year being requested, in the format of YYYY.
    */
  var year: Integer = js.native
}

object GetMinuteUsageRequest {
  @scala.inline
  def apply(month: Integer, year: Integer): GetMinuteUsageRequest = {
    val __obj = js.Dynamic.literal(month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMinuteUsageRequest]
  }
  @scala.inline
  implicit class GetMinuteUsageRequestOps[Self <: GetMinuteUsageRequest] (val x: Self) extends AnyVal {
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
    def setMonth(value: Integer): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def setYear(value: Integer): Self = this.set("year", value.asInstanceOf[js.Any])
  }
  
}

