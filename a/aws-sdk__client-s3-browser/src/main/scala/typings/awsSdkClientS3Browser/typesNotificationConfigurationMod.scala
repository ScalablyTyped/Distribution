package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesLambdaFunctionConfigurationMod.LambdaFunctionConfiguration
import typings.awsSdkClientS3Browser.typesLambdaFunctionConfigurationMod.UnmarshalledLambdaFunctionConfiguration
import typings.awsSdkClientS3Browser.typesQueueConfigurationMod.QueueConfiguration
import typings.awsSdkClientS3Browser.typesQueueConfigurationMod.UnmarshalledQueueConfiguration
import typings.awsSdkClientS3Browser.typesTopicConfigurationMod.TopicConfiguration
import typings.awsSdkClientS3Browser.typesTopicConfigurationMod.UnmarshalledTopicConfiguration
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNotificationConfigurationMod {
  
  @js.native
  trait NotificationConfiguration extends StObject {
    
    /**
      * _LambdaFunctionConfigurationList shape
      */
    var LambdaFunctionConfigurations: js.UndefOr[js.Array[LambdaFunctionConfiguration] | Iterable[LambdaFunctionConfiguration]] = js.native
    
    /**
      * _QueueConfigurationList shape
      */
    var QueueConfigurations: js.UndefOr[js.Array[QueueConfiguration] | Iterable[QueueConfiguration]] = js.native
    
    /**
      * _TopicConfigurationList shape
      */
    var TopicConfigurations: js.UndefOr[js.Array[TopicConfiguration] | Iterable[TopicConfiguration]] = js.native
  }
  object NotificationConfiguration {
    
    @scala.inline
    def apply(): NotificationConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationConfiguration]
    }
    
    @scala.inline
    implicit class NotificationConfigurationMutableBuilder[Self <: NotificationConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLambdaFunctionConfigurations(value: js.Array[LambdaFunctionConfiguration] | Iterable[LambdaFunctionConfiguration]): Self = StObject.set(x, "LambdaFunctionConfigurations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambdaFunctionConfigurationsUndefined: Self = StObject.set(x, "LambdaFunctionConfigurations", js.undefined)
      
      @scala.inline
      def setLambdaFunctionConfigurationsVarargs(value: LambdaFunctionConfiguration*): Self = StObject.set(x, "LambdaFunctionConfigurations", js.Array(value :_*))
      
      @scala.inline
      def setQueueConfigurations(value: js.Array[QueueConfiguration] | Iterable[QueueConfiguration]): Self = StObject.set(x, "QueueConfigurations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueConfigurationsUndefined: Self = StObject.set(x, "QueueConfigurations", js.undefined)
      
      @scala.inline
      def setQueueConfigurationsVarargs(value: QueueConfiguration*): Self = StObject.set(x, "QueueConfigurations", js.Array(value :_*))
      
      @scala.inline
      def setTopicConfigurations(value: js.Array[TopicConfiguration] | Iterable[TopicConfiguration]): Self = StObject.set(x, "TopicConfigurations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicConfigurationsUndefined: Self = StObject.set(x, "TopicConfigurations", js.undefined)
      
      @scala.inline
      def setTopicConfigurationsVarargs(value: TopicConfiguration*): Self = StObject.set(x, "TopicConfigurations", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UnmarshalledNotificationConfiguration extends NotificationConfiguration {
    
    /**
      * _LambdaFunctionConfigurationList shape
      */
    @JSName("LambdaFunctionConfigurations")
    var LambdaFunctionConfigurations_UnmarshalledNotificationConfiguration: js.UndefOr[js.Array[UnmarshalledLambdaFunctionConfiguration]] = js.native
    
    /**
      * _QueueConfigurationList shape
      */
    @JSName("QueueConfigurations")
    var QueueConfigurations_UnmarshalledNotificationConfiguration: js.UndefOr[js.Array[UnmarshalledQueueConfiguration]] = js.native
    
    /**
      * _TopicConfigurationList shape
      */
    @JSName("TopicConfigurations")
    var TopicConfigurations_UnmarshalledNotificationConfiguration: js.UndefOr[js.Array[UnmarshalledTopicConfiguration]] = js.native
  }
  object UnmarshalledNotificationConfiguration {
    
    @scala.inline
    def apply(): UnmarshalledNotificationConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledNotificationConfiguration]
    }
    
    @scala.inline
    implicit class UnmarshalledNotificationConfigurationMutableBuilder[Self <: UnmarshalledNotificationConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLambdaFunctionConfigurations(value: js.Array[UnmarshalledLambdaFunctionConfiguration]): Self = StObject.set(x, "LambdaFunctionConfigurations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambdaFunctionConfigurationsUndefined: Self = StObject.set(x, "LambdaFunctionConfigurations", js.undefined)
      
      @scala.inline
      def setLambdaFunctionConfigurationsVarargs(value: UnmarshalledLambdaFunctionConfiguration*): Self = StObject.set(x, "LambdaFunctionConfigurations", js.Array(value :_*))
      
      @scala.inline
      def setQueueConfigurations(value: js.Array[UnmarshalledQueueConfiguration]): Self = StObject.set(x, "QueueConfigurations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueConfigurationsUndefined: Self = StObject.set(x, "QueueConfigurations", js.undefined)
      
      @scala.inline
      def setQueueConfigurationsVarargs(value: UnmarshalledQueueConfiguration*): Self = StObject.set(x, "QueueConfigurations", js.Array(value :_*))
      
      @scala.inline
      def setTopicConfigurations(value: js.Array[UnmarshalledTopicConfiguration]): Self = StObject.set(x, "TopicConfigurations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicConfigurationsUndefined: Self = StObject.set(x, "TopicConfigurations", js.undefined)
      
      @scala.inline
      def setTopicConfigurationsVarargs(value: UnmarshalledTopicConfiguration*): Self = StObject.set(x, "TopicConfigurations", js.Array(value :_*))
    }
  }
}
