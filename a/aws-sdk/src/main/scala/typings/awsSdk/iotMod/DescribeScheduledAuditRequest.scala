package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScheduledAuditRequest extends js.Object {
  /**
    * The name of the scheduled audit whose information you want to get.
    */
  var scheduledAuditName: ScheduledAuditName = js.native
}

object DescribeScheduledAuditRequest {
  @scala.inline
  def apply(scheduledAuditName: ScheduledAuditName): DescribeScheduledAuditRequest = {
    val __obj = js.Dynamic.literal(scheduledAuditName = scheduledAuditName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScheduledAuditRequest]
  }
  @scala.inline
  implicit class DescribeScheduledAuditRequestOps[Self <: DescribeScheduledAuditRequest] (val x: Self) extends AnyVal {
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

