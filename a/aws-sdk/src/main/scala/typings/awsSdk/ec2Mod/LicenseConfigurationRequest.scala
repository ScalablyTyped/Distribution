package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicenseConfigurationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the license configuration.
    */
  var LicenseConfigurationArn: js.UndefOr[String] = js.undefined
}
object LicenseConfigurationRequest {
  
  @scala.inline
  def apply(): LicenseConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseConfigurationRequest]
  }
  
  @scala.inline
  implicit class LicenseConfigurationRequestMutableBuilder[Self <: LicenseConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLicenseConfigurationArn(value: String): Self = StObject.set(x, "LicenseConfigurationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseConfigurationArnUndefined: Self = StObject.set(x, "LicenseConfigurationArn", js.undefined)
  }
}
