package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Enabled
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Suspended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAccelerateConfigurationMod {
  
  @js.native
  trait AccelerateConfiguration extends StObject {
    
    /**
      * <p>The accelerate configuration of the bucket.</p>
      */
    var Status: js.UndefOr[Enabled | Suspended | String] = js.native
  }
  object AccelerateConfiguration {
    
    @scala.inline
    def apply(): AccelerateConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccelerateConfiguration]
    }
    
    @scala.inline
    implicit class AccelerateConfigurationMutableBuilder[Self <: AccelerateConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: Enabled | Suspended | String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    }
  }
  
  type UnmarshalledAccelerateConfiguration = AccelerateConfiguration
}
