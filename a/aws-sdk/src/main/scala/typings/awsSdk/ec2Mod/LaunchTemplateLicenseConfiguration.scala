package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateLicenseConfiguration extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the license configuration.
    */
  var LicenseConfigurationArn: js.UndefOr[String] = js.undefined
}
object LaunchTemplateLicenseConfiguration {
  
  inline def apply(): LaunchTemplateLicenseConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateLicenseConfiguration]
  }
  
  extension [Self <: LaunchTemplateLicenseConfiguration](x: Self) {
    
    inline def setLicenseConfigurationArn(value: String): Self = StObject.set(x, "LicenseConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setLicenseConfigurationArnUndefined: Self = StObject.set(x, "LicenseConfigurationArn", js.undefined)
  }
}
