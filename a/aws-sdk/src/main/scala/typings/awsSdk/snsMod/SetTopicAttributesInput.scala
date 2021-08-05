package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetTopicAttributesInput extends StObject {
  
  /**
    * A map of attributes with their corresponding values. The following lists the names, descriptions, and values of the special request parameters that the SetTopicAttributes action uses:    DeliveryPolicy – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S endpoints.    DisplayName – The display name to use for a topic with SMS subscriptions.    Policy – The policy that defines who can access your topic. By default, only the topic owner can publish or subscribe to the topic.   The following attribute applies only to server-side-encryption:    KmsMasterKeyId – The ID of an AWS-managed customer master key (CMK) for Amazon SNS or a custom CMK. For more information, see Key Terms. For more examples, see KeyId in the AWS Key Management Service API Reference.    The following attribute applies only to FIFO topics:    ContentBasedDeduplication – Enables content-based deduplication for FIFO topics.    By default, ContentBasedDeduplication is set to false. If you create a FIFO topic and this attribute is false, you must specify a value for the MessageDeduplicationId parameter for the Publish action.    When you set ContentBasedDeduplication to true, Amazon SNS uses a SHA-256 hash to generate the MessageDeduplicationId using the body of the message (but not the attributes of the message). (Optional) To override the generated value, you can specify a value for the the MessageDeduplicationId parameter for the Publish action.    
    */
  var AttributeName: attributeName
  
  /**
    * The new value for the attribute.
    */
  var AttributeValue: js.UndefOr[attributeValue] = js.undefined
  
  /**
    * The ARN of the topic to modify.
    */
  var TopicArn: topicARN
}
object SetTopicAttributesInput {
  
  inline def apply(AttributeName: attributeName, TopicArn: topicARN): SetTopicAttributesInput = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], TopicArn = TopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTopicAttributesInput]
  }
  
  extension [Self <: SetTopicAttributesInput](x: Self) {
    
    inline def setAttributeName(value: attributeName): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeValue(value: attributeValue): Self = StObject.set(x, "AttributeValue", value.asInstanceOf[js.Any])
    
    inline def setAttributeValueUndefined: Self = StObject.set(x, "AttributeValue", js.undefined)
    
    inline def setTopicArn(value: topicARN): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
  }
}
