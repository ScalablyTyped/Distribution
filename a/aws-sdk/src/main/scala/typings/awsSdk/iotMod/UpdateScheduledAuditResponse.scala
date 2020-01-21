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
  def apply(scheduledAuditArn: ScheduledAuditArn = null): UpdateScheduledAuditResponse = {
    val __obj = js.Dynamic.literal()
    if (scheduledAuditArn != null) __obj.updateDynamic("scheduledAuditArn")(scheduledAuditArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateScheduledAuditResponse]
  }
}

