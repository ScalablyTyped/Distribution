package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportImageLicenseConfigurationResponse extends StObject {
  
  /**
    * The ARN of a license configuration.
    */
  var LicenseConfigurationArn: js.UndefOr[String] = js.native
}
object ImportImageLicenseConfigurationResponse {
  
  @scala.inline
  def apply(): ImportImageLicenseConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportImageLicenseConfigurationResponse]
  }
  
  @scala.inline
  implicit class ImportImageLicenseConfigurationResponseMutableBuilder[Self <: ImportImageLicenseConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLicenseConfigurationArn(value: String): Self = StObject.set(x, "LicenseConfigurationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseConfigurationArnUndefined: Self = StObject.set(x, "LicenseConfigurationArn", js.undefined)
  }
}
