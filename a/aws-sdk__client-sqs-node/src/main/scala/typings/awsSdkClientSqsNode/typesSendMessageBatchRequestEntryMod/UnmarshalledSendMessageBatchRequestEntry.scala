package typings.awsSdkClientSqsNode.typesSendMessageBatchRequestEntryMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientSqsNode.typesMessageAttributeValueMod.UnmarshalledMessageAttributeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledSendMessageBatchRequestEntry extends SendMessageBatchRequestEntry {
  
  /**
    * <p>Each message attribute consists of a <code>Name</code>, <code>Type</code>, and <code>Value</code>. For more information, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-attributes.html">Amazon SQS Message Attributes</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.</p>
    */
  @JSName("MessageAttributes")
  var MessageAttributes_UnmarshalledSendMessageBatchRequestEntry: js.UndefOr[StringDictionary[UnmarshalledMessageAttributeValue]] = js.native
}
object UnmarshalledSendMessageBatchRequestEntry {
  
  @scala.inline
  def apply(Id: String, MessageBody: String): UnmarshalledSendMessageBatchRequestEntry = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], MessageBody = MessageBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSendMessageBatchRequestEntry]
  }
  
  @scala.inline
  implicit class UnmarshalledSendMessageBatchRequestEntryOps[Self <: UnmarshalledSendMessageBatchRequestEntry] (val x: Self) extends AnyVal {
    
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
    def setMessageAttributes(value: StringDictionary[UnmarshalledMessageAttributeValue]): Self = this.set("MessageAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageAttributes: Self = this.set("MessageAttributes", js.undefined)
  }
}
