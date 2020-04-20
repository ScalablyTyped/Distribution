package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLicenseConfigurationRequest extends js.Object {
  /**
    * ID of the license configuration.
    */
  var LicenseConfigurationArn: String = js.native
}

object DeleteLicenseConfigurationRequest {
  @scala.inline
  def apply(LicenseConfigurationArn: String): DeleteLicenseConfigurationRequest = {
    val __obj = js.Dynamic.literal(LicenseConfigurationArn = LicenseConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLicenseConfigurationRequest]
  }
}

