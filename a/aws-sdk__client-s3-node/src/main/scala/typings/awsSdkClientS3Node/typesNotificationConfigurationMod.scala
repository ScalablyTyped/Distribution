package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.typesLambdaFunctionConfigurationMod.LambdaFunctionConfiguration
import typings.awsSdkClientS3Node.typesLambdaFunctionConfigurationMod.UnmarshalledLambdaFunctionConfiguration
import typings.awsSdkClientS3Node.typesQueueConfigurationMod.QueueConfiguration
import typings.awsSdkClientS3Node.typesQueueConfigurationMod.UnmarshalledQueueConfiguration
import typings.awsSdkClientS3Node.typesTopicConfigurationMod.TopicConfiguration
import typings.awsSdkClientS3Node.typesTopicConfigurationMod.UnmarshalledTopicConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNotificationConfigurationMod {
  
  trait NotificationConfiguration extends StObject {
    
    /**
      * _LambdaFunctionConfigurationList shape
      */
    var LambdaFunctionConfigurations: js.UndefOr[js.Array[LambdaFunctionConfiguration] | js.Iterable[LambdaFunctionConfiguration]] = js.undefined
    
    /**
      * _QueueConfigurationList shape
      */
    var QueueConfigurations: js.UndefOr[js.Array[QueueConfiguration] | js.Iterable[QueueConfiguration]] = js.undefined
    
    /**
      * _TopicConfigurationList shape
      */
    var TopicConfigurations: js.UndefOr[js.Array[TopicConfiguration] | js.Iterable[TopicConfiguration]] = js.undefined
  }
  object NotificationConfiguration {
    
    inline def apply(): NotificationConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationConfiguration]
    }
    
    extension [Self <: NotificationConfiguration](x: Self) {
      
      inline def setLambdaFunctionConfigurations(value: js.Array[LambdaFunctionConfiguration] | js.Iterable[LambdaFunctionConfiguration]): Self = StObject.set(x, "LambdaFunctionConfigurations", value.asInstanceOf[js.Any])
      
      inline def setLambdaFunctionConfigurationsUndefined: Self = StObject.set(x, "LambdaFunctionConfigurations", js.undefined)
      
      inline def setLambdaFunctionConfigurationsVarargs(value: LambdaFunctionConfiguration*): Self = StObject.set(x, "LambdaFunctionConfigurations", js.Array(value*))
      
      inline def setQueueConfigurations(value: js.Array[QueueConfiguration] | js.Iterable[QueueConfiguration]): Self = StObject.set(x, "QueueConfigurations", value.asInstanceOf[js.Any])
      
      inline def setQueueConfigurationsUndefined: Self = StObject.set(x, "QueueConfigurations", js.undefined)
      
      inline def setQueueConfigurationsVarargs(value: QueueConfiguration*): Self = StObject.set(x, "QueueConfigurations", js.Array(value*))
      
      inline def setTopicConfigurations(value: js.Array[TopicConfiguration] | js.Iterable[TopicConfiguration]): Self = StObject.set(x, "TopicConfigurations", value.asInstanceOf[js.Any])
      
      inline def setTopicConfigurationsUndefined: Self = StObject.set(x, "TopicConfigurations", js.undefined)
      
      inline def setTopicConfigurationsVarargs(value: TopicConfiguration*): Self = StObject.set(x, "TopicConfigurations", js.Array(value*))
    }
  }
  
  trait UnmarshalledNotificationConfiguration
    extends StObject
       with NotificationConfiguration {
    
    /**
      * _LambdaFunctionConfigurationList shape
      */
    @JSName("LambdaFunctionConfigurations")
    var LambdaFunctionConfigurations_UnmarshalledNotificationConfiguration: js.UndefOr[js.Array[UnmarshalledLambdaFunctionConfiguration]] = js.undefined
    
    /**
      * _QueueConfigurationList shape
      */
    @JSName("QueueConfigurations")
    var QueueConfigurations_UnmarshalledNotificationConfiguration: js.UndefOr[js.Array[UnmarshalledQueueConfiguration]] = js.undefined
    
    /**
      * _TopicConfigurationList shape
      */
    @JSName("TopicConfigurations")
    var TopicConfigurations_UnmarshalledNotificationConfiguration: js.UndefOr[js.Array[UnmarshalledTopicConfiguration]] = js.undefined
  }
  object UnmarshalledNotificationConfiguration {
    
    inline def apply(): UnmarshalledNotificationConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledNotificationConfiguration]
    }
    
    extension [Self <: UnmarshalledNotificationConfiguration](x: Self) {
      
      inline def setLambdaFunctionConfigurations(value: js.Array[UnmarshalledLambdaFunctionConfiguration]): Self = StObject.set(x, "LambdaFunctionConfigurations", value.asInstanceOf[js.Any])
      
      inline def setLambdaFunctionConfigurationsUndefined: Self = StObject.set(x, "LambdaFunctionConfigurations", js.undefined)
      
      inline def setLambdaFunctionConfigurationsVarargs(value: UnmarshalledLambdaFunctionConfiguration*): Self = StObject.set(x, "LambdaFunctionConfigurations", js.Array(value*))
      
      inline def setQueueConfigurations(value: js.Array[UnmarshalledQueueConfiguration]): Self = StObject.set(x, "QueueConfigurations", value.asInstanceOf[js.Any])
      
      inline def setQueueConfigurationsUndefined: Self = StObject.set(x, "QueueConfigurations", js.undefined)
      
      inline def setQueueConfigurationsVarargs(value: UnmarshalledQueueConfiguration*): Self = StObject.set(x, "QueueConfigurations", js.Array(value*))
      
      inline def setTopicConfigurations(value: js.Array[UnmarshalledTopicConfiguration]): Self = StObject.set(x, "TopicConfigurations", value.asInstanceOf[js.Any])
      
      inline def setTopicConfigurationsUndefined: Self = StObject.set(x, "TopicConfigurations", js.undefined)
      
      inline def setTopicConfigurationsVarargs(value: UnmarshalledTopicConfiguration*): Self = StObject.set(x, "TopicConfigurations", js.Array(value*))
    }
  }
}
