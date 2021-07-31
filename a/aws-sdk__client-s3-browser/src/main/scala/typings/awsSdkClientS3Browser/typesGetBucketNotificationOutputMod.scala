package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesCloudFunctionConfigurationMod.UnmarshalledCloudFunctionConfiguration
import typings.awsSdkClientS3Browser.typesQueueConfigurationDeprecatedMod.UnmarshalledQueueConfigurationDeprecated
import typings.awsSdkClientS3Browser.typesTopicConfigurationDeprecatedMod.UnmarshalledTopicConfigurationDeprecated
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBucketNotificationOutputMod {
  
  trait GetBucketNotificationOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * _CloudFunctionConfiguration shape
      */
    var CloudFunctionConfiguration: js.UndefOr[UnmarshalledCloudFunctionConfiguration] = js.undefined
    
    /**
      * _QueueConfigurationDeprecated shape
      */
    var QueueConfiguration: js.UndefOr[UnmarshalledQueueConfigurationDeprecated] = js.undefined
    
    /**
      * _TopicConfigurationDeprecated shape
      */
    var TopicConfiguration: js.UndefOr[UnmarshalledTopicConfigurationDeprecated] = js.undefined
  }
  object GetBucketNotificationOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GetBucketNotificationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketNotificationOutput]
    }
    
    @scala.inline
    implicit class GetBucketNotificationOutputMutableBuilder[Self <: GetBucketNotificationOutput] (val x: Self) extends AnyVal {
      
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
