package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Disabled
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Enabled
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Suspended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesVersioningConfigurationMod {
  
  type UnmarshalledVersioningConfiguration = VersioningConfiguration
  
  @js.native
  trait VersioningConfiguration extends StObject {
    
    /**
      * <p>Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is only returned if the bucket has been configured with MFA delete. If the bucket has never been so configured, this element is not returned.</p>
      */
    var MFADelete: js.UndefOr[Enabled | Disabled | String] = js.native
    
    /**
      * <p>The versioning state of the bucket.</p>
      */
    var Status: js.UndefOr[Enabled | Suspended | String] = js.native
  }
  object VersioningConfiguration {
    
    @scala.inline
    def apply(): VersioningConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VersioningConfiguration]
    }
    
    @scala.inline
    implicit class VersioningConfigurationMutableBuilder[Self <: VersioningConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMFADelete(value: Enabled | Disabled | String): Self = StObject.set(x, "MFADelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMFADeleteUndefined: Self = StObject.set(x, "MFADelete", js.undefined)
      
      @scala.inline
      def setStatus(value: Enabled | Suspended | String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    }
  }
}
