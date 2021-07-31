package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLicenseConfigurationRequest extends StObject {
  
  /**
    * ID of the license configuration.
    */
  var LicenseConfigurationArn: String
}
object DeleteLicenseConfigurationRequest {
  
  @scala.inline
  def apply(LicenseConfigurationArn: String): DeleteLicenseConfigurationRequest = {
    val __obj = js.Dynamic.literal(LicenseConfigurationArn = LicenseConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLicenseConfigurationRequest]
  }
  
  @scala.inline
  implicit class DeleteLicenseConfigurationRequestMutableBuilder[Self <: DeleteLicenseConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLicenseConfigurationArn(value: String): Self = StObject.set(x, "LicenseConfigurationArn", value.asInstanceOf[js.Any])
  }
}
