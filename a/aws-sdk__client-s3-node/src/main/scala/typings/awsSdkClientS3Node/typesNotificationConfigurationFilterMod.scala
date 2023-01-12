package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.typesS3KeyFilterMod.S3KeyFilter
import typings.awsSdkClientS3Node.typesS3KeyFilterMod.UnmarshalledS3KeyFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNotificationConfigurationFilterMod {
  
  trait NotificationConfigurationFilter extends StObject {
    
    /**
      * <p>Container for object key name prefix and suffix filtering rules.</p>
      */
    var Key: js.UndefOr[S3KeyFilter] = js.undefined
  }
  object NotificationConfigurationFilter {
    
    inline def apply(): NotificationConfigurationFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationConfigurationFilter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NotificationConfigurationFilter] (val x: Self) extends AnyVal {
      
      inline def setKey(value: S3KeyFilter): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    }
  }
  
  trait UnmarshalledNotificationConfigurationFilter
    extends StObject
       with NotificationConfigurationFilter {
    
    /**
      * <p>Container for object key name prefix and suffix filtering rules.</p>
      */
    @JSName("Key")
    var Key_UnmarshalledNotificationConfigurationFilter: js.UndefOr[UnmarshalledS3KeyFilter] = js.undefined
  }
  object UnmarshalledNotificationConfigurationFilter {
    
    inline def apply(): UnmarshalledNotificationConfigurationFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledNotificationConfigurationFilter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledNotificationConfigurationFilter] (val x: Self) extends AnyVal {
      
      inline def setKey(value: UnmarshalledS3KeyFilter): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    }
  }
}
