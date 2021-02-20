package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishInput extends StObject {
  
  /**
    * The message you want to send. If you are publishing to a topic and you want to send the same message to all transport protocols, include the text of the message as a String value. If you want to send different messages for each transport protocol, set the value of the MessageStructure parameter to json and use a JSON object for the Message parameter.   Constraints:   With the exception of SMS, messages must be UTF-8 encoded strings and at most 256 KB in size (262,144 bytes, not 262,144 characters).   For SMS, each message can contain up to 140 characters. This character limit depends on the encoding schema. For example, an SMS message can contain 160 GSM characters, 140 ASCII characters, or 70 UCS-2 characters. If you publish a message that exceeds this size limit, Amazon SNS sends the message as multiple messages, each fitting within the size limit. Messages aren't truncated mid-word but are cut off at whole-word boundaries. The total size limit for a single SMS Publish action is 1,600 characters.   JSON-specific constraints:   Keys in the JSON object that correspond to supported transport protocols must have simple JSON string values.   The values will be parsed (unescaped) before they are used in outgoing messages.   Outbound notifications are JSON encoded (meaning that the characters will be reescaped for sending).   Values have a minimum length of 0 (the empty string, "", is allowed).   Values have a maximum length bounded by the overall message size (so, including multiple protocols may limit message sizes).   Non-string values will cause the key to be ignored.   Keys that do not correspond to supported transport protocols are ignored.   Duplicate keys are not allowed.   Failure to parse or validate any key or value in the message will cause the Publish call to return an error (no partial delivery).  
    */
  var Message: message = js.native
  
  /**
    * Message attributes for Publish action.
    */
  var MessageAttributes: js.UndefOr[MessageAttributeMap] = js.native
  
  /**
    * This parameter applies only to FIFO (first-in-first-out) topics. The MessageDeduplicationId can contain up to 128 alphanumeric characters (a-z, A-Z, 0-9) and punctuation (!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~). Every message must have a unique MessageDeduplicationId, which is a token used for deduplication of sent messages. If a message with a particular MessageDeduplicationId is sent successfully, any message sent with the same MessageDeduplicationId during the 5-minute deduplication interval is treated as a duplicate.  If the topic has ContentBasedDeduplication set, the system generates a MessageDeduplicationId based on the contents of the message. Your MessageDeduplicationId overrides the generated one.
    */
  var MessageDeduplicationId: js.UndefOr[String] = js.native
  
  /**
    * This parameter applies only to FIFO (first-in-first-out) topics. The MessageGroupId can contain up to 128 alphanumeric characters (a-z, A-Z, 0-9) and punctuation (!"#$%&amp;'()*+,-./:;&lt;=&gt;?@[\]^_`{|}~). The MessageGroupId is a tag that specifies that a message belongs to a specific message group. Messages that belong to the same message group are processed in a FIFO manner (however, messages in different message groups might be processed out of order). Every message must include a MessageGroupId.
    */
  var MessageGroupId: js.UndefOr[String] = js.native
  
  /**
    * Set MessageStructure to json if you want to send a different message for each protocol. For example, using one publish action, you can send a short message to your SMS subscribers and a longer message to your email subscribers. If you set MessageStructure to json, the value of the Message parameter must:    be a syntactically valid JSON object; and   contain at least a top-level JSON key of "default" with a value that is a string.   You can define other top-level keys that define the message you want to send to a specific transport protocol (e.g., "http"). Valid value: json 
    */
  var MessageStructure: js.UndefOr[messageStructure] = js.native
  
  /**
    * The phone number to which you want to deliver an SMS message. Use E.164 format. If you don't specify a value for the PhoneNumber parameter, you must specify a value for the TargetArn or TopicArn parameters.
    */
  var PhoneNumber: js.UndefOr[String] = js.native
  
  /**
    * Optional parameter to be used as the "Subject" line when the message is delivered to email endpoints. This field will also be included, if present, in the standard JSON messages delivered to other endpoints. Constraints: Subjects must be ASCII text that begins with a letter, number, or punctuation mark; must not include line breaks or control characters; and must be less than 100 characters long.
    */
  var Subject: js.UndefOr[subject] = js.native
  
  /**
    * If you don't specify a value for the TargetArn parameter, you must specify a value for the PhoneNumber or TopicArn parameters.
    */
  var TargetArn: js.UndefOr[String] = js.native
  
  /**
    * The topic you want to publish to. If you don't specify a value for the TopicArn parameter, you must specify a value for the PhoneNumber or TargetArn parameters.
    */
  var TopicArn: js.UndefOr[topicARN] = js.native
}
object PublishInput {
  
  @scala.inline
  def apply(Message: message): PublishInput = {
    val __obj = js.Dynamic.literal(Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishInput]
  }
  
  @scala.inline
  implicit class PublishInputMutableBuilder[Self <: PublishInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageAttributes(value: MessageAttributeMap): Self = StObject.set(x, "MessageAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageAttributesUndefined: Self = StObject.set(x, "MessageAttributes", js.undefined)
    
    @scala.inline
    def setMessageDeduplicationId(value: String): Self = StObject.set(x, "MessageDeduplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageDeduplicationIdUndefined: Self = StObject.set(x, "MessageDeduplicationId", js.undefined)
    
    @scala.inline
    def setMessageGroupId(value: String): Self = StObject.set(x, "MessageGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageGroupIdUndefined: Self = StObject.set(x, "MessageGroupId", js.undefined)
    
    @scala.inline
    def setMessageStructure(value: messageStructure): Self = StObject.set(x, "MessageStructure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageStructureUndefined: Self = StObject.set(x, "MessageStructure", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "PhoneNumber", js.undefined)
    
    @scala.inline
    def setSubject(value: subject): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "Subject", js.undefined)
    
    @scala.inline
    def setTargetArn(value: String): Self = StObject.set(x, "TargetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetArnUndefined: Self = StObject.set(x, "TargetArn", js.undefined)
    
    @scala.inline
    def setTopicArn(value: topicARN): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicArnUndefined: Self = StObject.set(x, "TopicArn", js.undefined)
  }
}
