package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesCloudFunctionConfigurationMod.CloudFunctionConfiguration
import typings.awsSdkClientS3Browser.typesCloudFunctionConfigurationMod.UnmarshalledCloudFunctionConfiguration
import typings.awsSdkClientS3Browser.typesQueueConfigurationDeprecatedMod.QueueConfigurationDeprecated
import typings.awsSdkClientS3Browser.typesQueueConfigurationDeprecatedMod.UnmarshalledQueueConfigurationDeprecated
import typings.awsSdkClientS3Browser.typesTopicConfigurationDeprecatedMod.TopicConfigurationDeprecated
import typings.awsSdkClientS3Browser.typesTopicConfigurationDeprecatedMod.UnmarshalledTopicConfigurationDeprecated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNotificationConfigurationDeprecatedMod {
  
  trait NotificationConfigurationDeprecated extends StObject {
    
    /**
      * _CloudFunctionConfiguration shape
      */
    var CloudFunctionConfiguration: js.UndefOr[
        typings.awsSdkClientS3Browser.typesCloudFunctionConfigurationMod.CloudFunctionConfiguration
      ] = js.undefined
    
    /**
      * _QueueConfigurationDeprecated shape
      */
    var QueueConfiguration: js.UndefOr[QueueConfigurationDeprecated] = js.undefined
    
    /**
      * _TopicConfigurationDeprecated shape
      */
    var TopicConfiguration: js.UndefOr[TopicConfigurationDeprecated] = js.undefined
  }
  object NotificationConfigurationDeprecated {
    
    @scala.inline
    def apply(): NotificationConfigurationDeprecated = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationConfigurationDeprecated]
    }
    
    @scala.inline
    implicit class NotificationConfigurationDeprecatedMutableBuilder[Self <: NotificationConfigurationDeprecated] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloudFunctionConfiguration(value: CloudFunctionConfiguration): Self = StObject.set(x, "CloudFunctionConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudFunctionConfigurationUndefined: Self = StObject.set(x, "CloudFunctionConfiguration", js.undefined)
      
      @scala.inline
      def setQueueConfiguration(value: QueueConfigurationDeprecated): Self = StObject.set(x, "QueueConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueConfigurationUndefined: Self = StObject.set(x, "QueueConfiguration", js.undefined)
      
      @scala.inline
      def setTopicConfiguration(value: TopicConfigurationDeprecated): Self = StObject.set(x, "TopicConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicConfigurationUndefined: Self = StObject.set(x, "TopicConfiguration", js.undefined)
    }
  }
  
  trait UnmarshalledNotificationConfigurationDeprecated
    extends StObject
       with NotificationConfigurationDeprecated {
    
    /**
      * _CloudFunctionConfiguration shape
      */
    @JSName("CloudFunctionConfiguration")
    var CloudFunctionConfiguration_UnmarshalledNotificationConfigurationDeprecated: js.UndefOr[UnmarshalledCloudFunctionConfiguration] = js.undefined
    
    /**
      * _QueueConfigurationDeprecated shape
      */
    @JSName("QueueConfiguration")
    var QueueConfiguration_UnmarshalledNotificationConfigurationDeprecated: js.UndefOr[UnmarshalledQueueConfigurationDeprecated] = js.undefined
    
    /**
      * _TopicConfigurationDeprecated shape
      */
    @JSName("TopicConfiguration")
    var TopicConfiguration_UnmarshalledNotificationConfigurationDeprecated: js.UndefOr[UnmarshalledTopicConfigurationDeprecated] = js.undefined
  }
  object UnmarshalledNotificationConfigurationDeprecated {
    
    @scala.inline
    def apply(): UnmarshalledNotificationConfigurationDeprecated = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledNotificationConfigurationDeprecated]
    }
    
    @scala.inline
    implicit class UnmarshalledNotificationConfigurationDeprecatedMutableBuilder[Self <: UnmarshalledNotificationConfigurationDeprecated] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloudFunctionConfiguration(value: UnmarshalledCloudFunctionConfiguration): Self = StObject.set(x, "CloudFunctionConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudFunctionConfigurationUndefined: Self = StObject.set(x, "CloudFunctionConfiguration", js.undefined)
      
      @scala.inline
      def setQueueConfiguration(value: UnmarshalledQueueConfigurationDeprecated): Self = StObject.set(x, "QueueConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueConfigurationUndefined: Self = StObject.set(x, "QueueConfiguration", js.undefined)
      
      @scala.inline
      def setTopicConfiguration(value: UnmarshalledTopicConfigurationDeprecated): Self = StObject.set(x, "TopicConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicConfigurationUndefined: Self = StObject.set(x, "TopicConfiguration", js.undefined)
    }
  }
}
