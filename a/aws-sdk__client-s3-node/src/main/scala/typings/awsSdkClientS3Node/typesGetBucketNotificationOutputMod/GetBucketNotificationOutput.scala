package typings.awsSdkClientS3Node.typesGetBucketNotificationOutputMod

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Node.typesCloudFunctionConfigurationMod.UnmarshalledCloudFunctionConfiguration
import typings.awsSdkClientS3Node.typesQueueConfigurationDeprecatedMod.UnmarshalledQueueConfigurationDeprecated
import typings.awsSdkClientS3Node.typesTopicConfigurationDeprecatedMod.UnmarshalledTopicConfigurationDeprecated
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketNotificationOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  
  /**
    * _CloudFunctionConfiguration shape
    */
  var CloudFunctionConfiguration: js.UndefOr[UnmarshalledCloudFunctionConfiguration] = js.native
  
  /**
    * _QueueConfigurationDeprecated shape
    */
  var QueueConfiguration: js.UndefOr[UnmarshalledQueueConfigurationDeprecated] = js.native
  
  /**
    * _TopicConfigurationDeprecated shape
    */
  var TopicConfiguration: js.UndefOr[UnmarshalledTopicConfigurationDeprecated] = js.native
}
object GetBucketNotificationOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): GetBucketNotificationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketNotificationOutput]
  }
  
  @scala.inline
  implicit class GetBucketNotificationOutputOps[Self <: GetBucketNotificationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCloudFunctionConfiguration(value: UnmarshalledCloudFunctionConfiguration): Self = this.set("CloudFunctionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudFunctionConfiguration: Self = this.set("CloudFunctionConfiguration", js.undefined)
    
    @scala.inline
    def setQueueConfiguration(value: UnmarshalledQueueConfigurationDeprecated): Self = this.set("QueueConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueueConfiguration: Self = this.set("QueueConfiguration", js.undefined)
    
    @scala.inline
    def setTopicConfiguration(value: UnmarshalledTopicConfigurationDeprecated): Self = this.set("TopicConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicConfiguration: Self = this.set("TopicConfiguration", js.undefined)
  }
}
