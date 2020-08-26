package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteScheduledAuditRequest extends js.Object {
  /**
    * The name of the scheduled audit you want to delete.
    */
  var scheduledAuditName: ScheduledAuditName = js.native
}

object DeleteScheduledAuditRequest {
  @scala.inline
  def apply(scheduledAuditName: ScheduledAuditName): DeleteScheduledAuditRequest = {
    val __obj = js.Dynamic.literal(scheduledAuditName = scheduledAuditName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteScheduledAuditRequest]
  }
  @scala.inline
  implicit class DeleteScheduledAuditRequestOps[Self <: DeleteScheduledAuditRequest] (val x: Self) extends AnyVal {
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
    def setScheduledAuditName(value: ScheduledAuditName): Self = this.set("scheduledAuditName", value.asInstanceOf[js.Any])
  }
  
}

