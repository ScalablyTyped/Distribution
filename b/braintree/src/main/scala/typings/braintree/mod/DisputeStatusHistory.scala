package typings.braintree.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisputeStatusHistory extends js.Object {
  var disbursementDate: Date = js.native
  var effectiveDate: Date = js.native
  var status: DisputeStatus = js.native
  var timestamp: Date = js.native
}

object DisputeStatusHistory {
  @scala.inline
  def apply(disbursementDate: Date, effectiveDate: Date, status: DisputeStatus, timestamp: Date): DisputeStatusHistory = {
    val __obj = js.Dynamic.literal(disbursementDate = disbursementDate.asInstanceOf[js.Any], effectiveDate = effectiveDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisputeStatusHistory]
  }
  @scala.inline
  implicit class DisputeStatusHistoryOps[Self <: DisputeStatusHistory] (val x: Self) extends AnyVal {
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
    def setDisbursementDate(value: Date): Self = this.set("disbursementDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setEffectiveDate(value: Date): Self = this.set("effectiveDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: DisputeStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

