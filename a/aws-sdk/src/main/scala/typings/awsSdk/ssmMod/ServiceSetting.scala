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
  def apply(): ServiceSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceSetting]
  }
  @scala.inline
  implicit class ServiceSettingOps[Self <: ServiceSetting] (val x: Self) extends AnyVal {
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
    def setARN(value: String): Self = this.set("ARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteARN: Self = this.set("ARN", js.undefined)
    @scala.inline
    def setLastModifiedDate(value: DateTime): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("LastModifiedDate", js.undefined)
    @scala.inline
    def setLastModifiedUser(value: String): Self = this.set("LastModifiedUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedUser: Self = this.set("LastModifiedUser", js.undefined)
    @scala.inline
    def setSettingId(value: ServiceSettingId): Self = this.set("SettingId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettingId: Self = this.set("SettingId", js.undefined)
    @scala.inline
    def setSettingValue(value: ServiceSettingValue): Self = this.set("SettingValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettingValue: Self = this.set("SettingValue", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

