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
}

