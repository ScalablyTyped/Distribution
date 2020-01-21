package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLicenseConfigurationRequest extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the license configuration.
    */
  var LicenseConfigurationArn: String = js.native
}

object GetLicenseConfigurationRequest {
  @scala.inline
  def apply(LicenseConfigurationArn: String): GetLicenseConfigurationRequest = {
    val __obj = js.Dynamic.literal(LicenseConfigurationArn = LicenseConfigurationArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetLicenseConfigurationRequest]
  }
}

