package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LicenseSpecification extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the license configuration.
    */
  var LicenseConfigurationArn: String = js.native
}

object LicenseSpecification {
  @scala.inline
  def apply(LicenseConfigurationArn: String): LicenseSpecification = {
    val __obj = js.Dynamic.literal(LicenseConfigurationArn = LicenseConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseSpecification]
  }
  @scala.inline
  implicit class LicenseSpecificationOps[Self <: LicenseSpecification] (val x: Self) extends AnyVal {
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
  }
  
}

