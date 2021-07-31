package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLicenseConfigurationResponse extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the license configuration.
    */
  var LicenseConfigurationArn: js.UndefOr[String] = js.undefined
}
object CreateLicenseConfigurationResponse {
  
  @scala.inline
  def apply(): CreateLicenseConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLicenseConfigurationResponse]
  }
  
  @scala.inline
  implicit class CreateLicenseConfigurationResponseMutableBuilder[Self <: CreateLicenseConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLicenseConfigurationArn(value: String): Self = StObject.set(x, "LicenseConfigurationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseConfigurationArnUndefined: Self = StObject.set(x, "LicenseConfigurationArn", js.undefined)
  }
}
