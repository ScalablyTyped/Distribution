package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateScheduledAuditResponse extends js.Object {
  /**
    * The ARN of the scheduled audit.
    */
  var scheduledAuditArn: js.UndefOr[ScheduledAuditArn] = js.native
}

object UpdateScheduledAuditResponse {
  @scala.inline
  def apply(): UpdateScheduledAuditResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateScheduledAuditResponse]
  }
  @scala.inline
  implicit class UpdateScheduledAuditResponseOps[Self <: UpdateScheduledAuditResponse] (val x: Self) extends AnyVal {
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
    def setScheduledAuditArn(value: ScheduledAuditArn): Self = this.set("scheduledAuditArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduledAuditArn: Self = this.set("scheduledAuditArn", js.undefined)
  }
  
}

