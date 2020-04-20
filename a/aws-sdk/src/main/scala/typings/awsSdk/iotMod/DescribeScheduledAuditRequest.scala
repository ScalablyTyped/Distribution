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
}

