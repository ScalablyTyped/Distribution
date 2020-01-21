package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceSetting extends js.Object {
  /**
    * The ARN of the service setting.
    */
  var ARN: js.UndefOr[String] = js.native
  /**
    * The last time the service setting was modified.
    */
  var LastModifiedDate: js.UndefOr[DateTime] = js.native
  /**
    * The ARN of the last modified user. This field is populated only if the setting value was overwritten.
    */
  var LastModifiedUser: js.UndefOr[String] = js.native
  /**
    * The ID of the service setting.
    */
  var SettingId: js.UndefOr[ServiceSettingId] = js.native
  /**
    * The value of the service setting.
    */
  var SettingValue: js.UndefOr[ServiceSettingValue] = js.native
  /**
    * The status of the service setting. The value can be Default, Customized or PendingUpdate.   Default: The current setting uses a default value provisioned by the AWS service team.   Customized: The current setting use a custom value specified by the customer.   PendingUpdate: The current setting uses a default or custom value, but a setting change request is pending approval.  
    */
  var Status: js.UndefOr[String] = js.native
}

object ServiceSetting {
  @scala.inline
  def apply(
    ARN: String = null,
    LastModifiedDate: DateTime = null,
    LastModifiedUser: String = null,
    SettingId: ServiceSettingId = null,
    SettingValue: ServiceSettingValue = null,
    Status: String = null
  ): ServiceSetting = {
    val __obj = js.Dynamic.literal()
    if (ARN != null) __obj.updateDynamic("ARN")(ARN.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (LastModifiedUser != null) __obj.updateDynamic("LastModifiedUser")(LastModifiedUser.asInstanceOf[js.Any])
    if (SettingId != null) __obj.updateDynamic("SettingId")(SettingId.asInstanceOf[js.Any])
    if (SettingValue != null) __obj.updateDynamic("SettingValue")(SettingValue.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceSetting]
  }
}

