package typings.awsSdkClientS3Browser.typesNotificationConfigurationDeprecatedMod

import typings.awsSdkClientS3Browser.typesCloudFunctionConfigurationMod.UnmarshalledCloudFunctionConfiguration
import typings.awsSdkClientS3Browser.typesQueueConfigurationDeprecatedMod.UnmarshalledQueueConfigurationDeprecated
import typings.awsSdkClientS3Browser.typesTopicConfigurationDeprecatedMod.UnmarshalledTopicConfigurationDeprecated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledNotificationConfigurationDeprecated extends NotificationConfigurationDeprecated {
  
  /**
    * _CloudFunctionConfiguration shape
    */
  @JSName("CloudFunctionConfiguration")
  var CloudFunctionConfiguration_UnmarshalledNotificationConfigurationDeprecated: js.UndefOr[UnmarshalledCloudFunctionConfiguration] = js.native
  
  /**
    * _QueueConfigurationDeprecated shape
    */
  @JSName("QueueConfiguration")
  var QueueConfiguration_UnmarshalledNotificationConfigurationDeprecated: js.UndefOr[UnmarshalledQueueConfigurationDeprecated] = js.native
  
  /**
    * _TopicConfigurationDeprecated shape
    */
  @JSName("TopicConfiguration")
  var TopicConfiguration_UnmarshalledNotificationConfigurationDeprecated: js.UndefOr[UnmarshalledTopicConfigurationDeprecated] = js.native
}
object UnmarshalledNotificationConfigurationDeprecated {
  
  @scala.inline
  def apply(): UnmarshalledNotificationConfigurationDeprecated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledNotificationConfigurationDeprecated]
  }
  
  @scala.inline
  implicit class UnmarshalledNotificationConfigurationDeprecatedOps[Self <: UnmarshalledNotificationConfigurationDeprecated] (val x: Self) extends AnyVal {
    
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
