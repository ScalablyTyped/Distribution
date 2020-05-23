package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuditNotificationTarget extends js.Object {
  /**
    * True if notifications to the target are enabled.
    */
  var enabled: js.UndefOr[Enabled] = js.native
  /**
    * The ARN of the role that grants permission to send notifications to the target.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
  /**
    * The ARN of the target (SNS topic) to which audit notifications are sent.
    */
  var targetArn: js.UndefOr[TargetArn] = js.native
}

object AuditNotificationTarget {
  @scala.inline
  def apply(enabled: js.UndefOr[Enabled] = js.undefined, roleArn: RoleArn = null, targetArn: TargetArn = null): AuditNotificationTarget = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    if (targetArn != null) __obj.updateDynamic("targetArn")(targetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditNotificationTarget]
  }
}

