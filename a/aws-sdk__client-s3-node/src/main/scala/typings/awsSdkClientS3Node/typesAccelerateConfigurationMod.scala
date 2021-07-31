package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Enabled
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Suspended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAccelerateConfigurationMod {
  
  trait AccelerateConfiguration extends StObject {
    
    /**
      * <p>The accelerate configuration of the bucket.</p>
      */
    var Status: js.UndefOr[Enabled | Suspended | String] = js.undefined
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
