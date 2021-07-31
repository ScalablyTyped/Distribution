package typings.awsSdkClientGlacierNode

import typings.std.Iterable
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
    
    @scala.inline
    def apply(): UnmarshalledVaultNotificationConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledVaultNotificationConfig]
    }
    
    @scala.inline
    implicit class UnmarshalledVaultNotificationConfigMutableBuilder[Self <: UnmarshalledVaultNotificationConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvents(value: js.Array[String]): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
      
      @scala.inline
      def setEventsVarargs(value: String*): Self = StObject.set(x, "Events", js.Array(value :_*))
    }
  }
  
  trait VaultNotificationConfig extends StObject {
    
    /**
      * <p>A list of one or more events for which Amazon Glacier will send a notification to the specified Amazon SNS topic.</p>
      */
    var Events: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
    
    /**
      * <p>The Amazon Simple Notification Service (Amazon SNS) topic Amazon Resource Name (ARN).</p>
      */
    var SNSTopic: js.UndefOr[String] = js.undefined
  }
  object VaultNotificationConfig {
    
    @scala.inline
    def apply(): VaultNotificationConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VaultNotificationConfig]
    }
    
    @scala.inline
    implicit class VaultNotificationConfigMutableBuilder[Self <: VaultNotificationConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvents(value: js.Array[String] | Iterable[String]): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
      
      @scala.inline
      def setEventsVarargs(value: String*): Self = StObject.set(x, "Events", js.Array(value :_*))
      
      @scala.inline
      def setSNSTopic(value: String): Self = StObject.set(x, "SNSTopic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSNSTopicUndefined: Self = StObject.set(x, "SNSTopic", js.undefined)
    }
  }
}
