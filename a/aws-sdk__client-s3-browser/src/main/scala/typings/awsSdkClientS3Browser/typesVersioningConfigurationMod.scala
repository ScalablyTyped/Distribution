package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Disabled
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Enabled
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Suspended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesVersioningConfigurationMod {
  
  type UnmarshalledVersioningConfiguration = VersioningConfiguration
  
  trait VersioningConfiguration extends StObject {
    
    /**
      * <p>Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is only returned if the bucket has been configured with MFA delete. If the bucket has never been so configured, this element is not returned.</p>
      */
    var MFADelete: js.UndefOr[Enabled | Disabled | String] = js.undefined
    
    /**
      * <p>The versioning state of the bucket.</p>
      */
    var Status: js.UndefOr[Enabled | Suspended | String] = js.undefined
  }
  object VersioningConfiguration {
    
    inline def apply(): VersioningConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VersioningConfiguration]
    }
    
    extension [Self <: VersioningConfiguration](x: Self) {
      
      inline def setMFADelete(value: Enabled | Disabled | String): Self = StObject.set(x, "MFADelete", value.asInstanceOf[js.Any])
      
      inline def setMFADeleteUndefined: Self = StObject.set(x, "MFADelete", js.undefined)
      
      inline def setStatus(value: Enabled | Suspended | String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    }
  }
}
