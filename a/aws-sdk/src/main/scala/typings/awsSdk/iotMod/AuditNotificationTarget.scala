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
  def apply(): AuditNotificationTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditNotificationTarget]
  }
  @scala.inline
  implicit class AuditNotificationTargetOps[Self <: AuditNotificationTarget] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Enabled): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
    @scala.inline
    def setTargetArn(value: TargetArn): Self = this.set("targetArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetArn: Self = this.set("targetArn", js.undefined)
  }
  
}

