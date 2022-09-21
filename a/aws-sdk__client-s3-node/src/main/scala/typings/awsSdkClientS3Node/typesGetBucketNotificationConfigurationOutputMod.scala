package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Node.typesLambdaFunctionConfigurationMod.UnmarshalledLambdaFunctionConfiguration
import typings.awsSdkClientS3Node.typesQueueConfigurationMod.UnmarshalledQueueConfiguration
import typings.awsSdkClientS3Node.typesTopicConfigurationMod.UnmarshalledTopicConfiguration
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBucketNotificationConfigurationOutputMod {
  
  trait GetBucketNotificationConfigurationOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * _LambdaFunctionConfigurationList shape
      */
    var LambdaFunctionConfigurations: js.UndefOr[js.Array[UnmarshalledLambdaFunctionConfiguration]] = js.undefined
    
    /**
      * _QueueConfigurationList shape
      */
    var QueueConfigurations: js.UndefOr[js.Array[UnmarshalledQueueConfiguration]] = js.undefined
    
    /**
      * _TopicConfigurationList shape
      */
    var TopicConfigurations: js.UndefOr[js.Array[UnmarshalledTopicConfiguration]] = js.undefined
  }
  object GetBucketNotificationConfigurationOutput {
    
    inline def apply($metadata: ResponseMetadata): GetBucketNotificationConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketNotificationConfigurationOutput]
    }
    
    extension [Self <: GetBucketNotificationConfigurationOutput](x: Self) {
      
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
