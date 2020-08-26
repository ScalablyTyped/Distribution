package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationS3LogsConfigurationResult extends js.Object {
  /**
    * A value that describes whether S3 data event logs are automatically enabled for new members of the organization.
    */
  var AutoEnable: Boolean = js.native
}

object OrganizationS3LogsConfigurationResult {
  @scala.inline
  def apply(AutoEnable: Boolean): OrganizationS3LogsConfigurationResult = {
    val __obj = js.Dynamic.literal(AutoEnable = AutoEnable.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationS3LogsConfigurationResult]
  }
  @scala.inline
  implicit class OrganizationS3LogsConfigurationResultOps[Self <: OrganizationS3LogsConfigurationResult] (val x: Self) extends AnyVal {
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
    def setAutoEnable(value: Boolean): Self = this.set("AutoEnable", value.asInstanceOf[js.Any])
  }
  
}

