package typings.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAuditStreamConfigurationRequest extends js.Object {
  /**
    * The ARN of the Amazon Kinesis data stream that receives the audit events.
    */
  var AuditStreamArn: js.UndefOr[typings.awsSdk.worklinkMod.AuditStreamArn] = js.native
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsSdk.worklinkMod.FleetArn = js.native
}

object UpdateAuditStreamConfigurationRequest {
  @scala.inline
  def apply(FleetArn: FleetArn, AuditStreamArn: AuditStreamArn = null): UpdateAuditStreamConfigurationRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any])
    if (AuditStreamArn != null) __obj.updateDynamic("AuditStreamArn")(AuditStreamArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAuditStreamConfigurationRequest]
  }
}

