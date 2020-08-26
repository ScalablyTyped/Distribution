package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTopicInput extends js.Object {
  /**
    * A map of attributes with their corresponding values. The following lists the names, descriptions, and values of the special request parameters that the CreateTopic action uses:    DeliveryPolicy – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S endpoints.    DisplayName – The display name to use for a topic with SMS subscriptions.    FifoTopic – Set to true to create a FIFO topic.    Policy – The policy that defines who can access your topic. By default, only the topic owner can publish or subscribe to the topic.   The following attribute applies only to server-side-encryption:    KmsMasterKeyId – The ID of an AWS-managed customer master key (CMK) for Amazon SNS or a custom CMK. For more information, see Key Terms. For more examples, see KeyId in the AWS Key Management Service API Reference.    The following attribute applies only to FIFO topics:    ContentBasedDeduplication – Enables content-based deduplication. Amazon SNS uses a SHA-256 hash to generate the MessageDeduplicationId using the body of the message (but not the attributes of the message).     When ContentBasedDeduplication is in effect, messages with identical content sent within the deduplication interval are treated as duplicates and only one copy of the message is delivered.     If the queue has ContentBasedDeduplication set, your MessageDeduplicationId overrides the generated one.   
    */
  var Attributes: js.UndefOr[TopicAttributesMap] = js.native
  /**
    * The name of the topic you want to create. Constraints: Topic names must be made up of only uppercase and lowercase ASCII letters, numbers, underscores, and hyphens, and must be between 1 and 256 characters long. For a FIFO (first-in-first-out) topic, the name must end with the .fifo suffix. 
    */
  var Name: topicName = js.native
  /**
    * The list of tags to add to a new topic.  To be able to tag a topic on creation, you must have the sns:CreateTopic and sns:TagResource permissions. 
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateTopicInput {
  @scala.inline
  def apply(Name: topicName): CreateTopicInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTopicInput]
  }
  @scala.inline
  implicit class CreateTopicInputOps[Self <: CreateTopicInput] (val x: Self) extends AnyVal {
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
    def setName(value: topicName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributes(value: TopicAttributesMap): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

