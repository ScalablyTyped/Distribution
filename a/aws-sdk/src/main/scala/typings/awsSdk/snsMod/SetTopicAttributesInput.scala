package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetTopicAttributesInput extends js.Object {
  /**
    * A map of attributes with their corresponding values. The following lists the names, descriptions, and values of the special request parameters that the SetTopicAttributes action uses:    DeliveryPolicy – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S endpoints.    DisplayName – The display name to use for a topic with SMS subscriptions.    Policy – The policy that defines who can access your topic. By default, only the topic owner can publish or subscribe to the topic.   The following attribute applies only to server-side-encryption:    KmsMasterKeyId – The ID of an AWS-managed customer master key (CMK) for Amazon SNS or a custom CMK. For more information, see Key Terms. For more examples, see KeyId in the AWS Key Management Service API Reference.    The following attribute applies only to FIFO topics:    ContentBasedDeduplication – Enables content-based deduplication. Amazon SNS uses a SHA-256 hash to generate the MessageDeduplicationId using the body of the message (but not the attributes of the message).     When ContentBasedDeduplication is in effect, messages with identical content sent within the deduplication interval are treated as duplicates and only one copy of the message is delivered.     If the queue has ContentBasedDeduplication set, your MessageDeduplicationId overrides the generated one.   
    */
  var AttributeName: attributeName = js.native
  /**
    * The new value for the attribute.
    */
  var AttributeValue: js.UndefOr[attributeValue] = js.native
  /**
    * The ARN of the topic to modify.
    */
  var TopicArn: topicARN = js.native
}

object SetTopicAttributesInput {
  @scala.inline
  def apply(AttributeName: attributeName, TopicArn: topicARN): SetTopicAttributesInput = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], TopicArn = TopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTopicAttributesInput]
  }
  @scala.inline
  implicit class SetTopicAttributesInputOps[Self <: SetTopicAttributesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttributeName(value: attributeName): Self = this.set("AttributeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopicArn(value: topicARN): Self = this.set("TopicArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributeValue(value: attributeValue): Self = this.set("AttributeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeValue: Self = this.set("AttributeValue", js.undefined)
  }
  
}

