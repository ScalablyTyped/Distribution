package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportImageLicenseConfigurationRequest extends js.Object {
  /**
    * The ARN of a license configuration.
    */
  var LicenseConfigurationArn: js.UndefOr[String] = js.native
}

object ImportImageLicenseConfigurationRequest {
  @scala.inline
  def apply(): ImportImageLicenseConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportImageLicenseConfigurationRequest]
  }
  @scala.inline
  implicit class ImportImageLicenseConfigurationRequestOps[Self <: ImportImageLicenseConfigurationRequest] (val x: Self) extends AnyVal {
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
    def setLicenseConfigurationArn(value: String): Self = this.set("LicenseConfigurationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicenseConfigurationArn: Self = this.set("LicenseConfigurationArn", js.undefined)
  }
  
}

