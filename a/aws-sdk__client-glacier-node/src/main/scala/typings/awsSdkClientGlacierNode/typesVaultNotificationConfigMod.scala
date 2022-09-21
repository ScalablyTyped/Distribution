package typings.awsSdkClientGlacierNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesVaultNotificationConfigMod {
  
  trait UnmarshalledVaultNotificationConfig
    extends StObject
       with VaultNotificationConfig {
    
    /**
      * <p>A list of one or more events for which Amazon Glacier will send a notification to the specified Amazon SNS topic.</p>
      */
    @JSName("Events")
    var Events_UnmarshalledVaultNotificationConfig: js.UndefOr[js.Array[String]] = js.undefined
  }
  object UnmarshalledVaultNotificationConfig {
    
    inline def apply(): UnmarshalledVaultNotificationConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledVaultNotificationConfig]
    }
    
    extension [Self <: UnmarshalledVaultNotificationConfig](x: Self) {
      
      inline def setEvents(value: js.Array[String]): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
      
      inline def setEventsVarargs(value: String*): Self = StObject.set(x, "Events", js.Array(value*))
    }
  }
  
  trait VaultNotificationConfig extends StObject {
    
    /**
      * <p>A list of one or more events for which Amazon Glacier will send a notification to the specified Amazon SNS topic.</p>
      */
    var Events: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.undefined
    
    /**
      * <p>The Amazon Simple Notification Service (Amazon SNS) topic Amazon Resource Name (ARN).</p>
      */
    var SNSTopic: js.UndefOr[String] = js.undefined
  }
  object VaultNotificationConfig {
    
    inline def apply(): VaultNotificationConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VaultNotificationConfig]
    }
    
    extension [Self <: VaultNotificationConfig](x: Self) {
      
      inline def setEvents(value: js.Array[String] | js.Iterable[String]): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
      
      inline def setEventsVarargs(value: String*): Self = StObject.set(x, "Events", js.Array(value*))
      
      inline def setSNSTopic(value: String): Self = StObject.set(x, "SNSTopic", value.asInstanceOf[js.Any])
      
      inline def setSNSTopicUndefined: Self = StObject.set(x, "SNSTopic", js.undefined)
    }
  }
}
