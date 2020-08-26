package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAccountAuditConfigurationResponse extends js.Object {
  /**
    * Which audit checks are enabled and disabled for this account.
    */
  var auditCheckConfigurations: js.UndefOr[AuditCheckConfigurations] = js.native
  /**
    * Information about the targets to which audit notifications are sent for this account.
    */
  var auditNotificationTargetConfigurations: js.UndefOr[AuditNotificationTargetConfigurations] = js.native
  /**
    * The ARN of the role that grants permission to AWS IoT to access information about your devices, policies, certificates, and other items as required when performing an audit. On the first call to UpdateAccountAuditConfiguration, this parameter is required.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
}

object DescribeAccountAuditConfigurationResponse {
  @scala.inline
  def apply(): DescribeAccountAuditConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountAuditConfigurationResponse]
  }
  @scala.inline
  implicit class DescribeAccountAuditConfigurationResponseOps[Self <: DescribeAccountAuditConfigurationResponse] (val x: Self) extends AnyVal {
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
    def setAuditCheckConfigurations(value: AuditCheckConfigurations): Self = this.set("auditCheckConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuditCheckConfigurations: Self = this.set("auditCheckConfigurations", js.undefined)
    @scala.inline
    def setAuditNotificationTargetConfigurations(value: AuditNotificationTargetConfigurations): Self = this.set("auditNotificationTargetConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuditNotificationTargetConfigurations: Self = this.set("auditNotificationTargetConfigurations", js.undefined)
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
  }
  
}

