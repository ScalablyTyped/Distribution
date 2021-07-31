package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLicenseConfigurationRequest extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the license configuration.
    */
  var LicenseConfigurationArn: String
}
object GetLicenseConfigurationRequest {
  
  @scala.inline
  def apply(LicenseConfigurationArn: String): GetLicenseConfigurationRequest = {
    val __obj = js.Dynamic.literal(LicenseConfigurationArn = LicenseConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLicenseConfigurationRequest]
  }
  
  @scala.inline
  implicit class GetLicenseConfigurationRequestMutableBuilder[Self <: GetLicenseConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLicenseConfigurationArn(value: String): Self = StObject.set(x, "LicenseConfigurationArn", value.asInstanceOf[js.Any])
  }
}
