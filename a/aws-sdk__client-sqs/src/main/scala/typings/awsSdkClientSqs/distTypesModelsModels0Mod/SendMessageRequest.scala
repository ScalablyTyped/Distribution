package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendMessageRequest extends StObject {
  
  /**
    * <p>
    *           The length of time, in seconds, for which to delay a specific message. Valid values: 0 to 900. Maximum: 15 minutes. Messages with a positive <code>DelaySeconds</code> value become available for processing after the delay period is finished.
    *           If you don't specify a value, the default value for the queue applies.
    *     </p>
    *          <note>
    *             <p>When you set <code>FifoQueue</code>, you can't set <code>DelaySeconds</code> per message. You can set this parameter only on a queue level.</p>
    *          </note>
    */
  var DelaySeconds: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>Each message attribute consists of a <code>Name</code>, <code>Type</code>,
    * and <code>Value</code>. For more information, see
    * <a href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-message-metadata.html#sqs-message-attributes">Amazon SQS
    * message attributes</a> in the <i>Amazon SQS Developer Guide</i>.</p>
    */
  var MessageAttributes: js.UndefOr[Record[String, MessageAttributeValue]] = js.undefined
  
  /**
    * <p>The message to send. The minimum size is one character. The maximum size is 256 KB.</p>
    *          <important>
    *             <p>A message can include only XML, JSON, and unformatted text. The following Unicode characters are allowed:</p>
    *             <p>
    *                <code>#x9</code> | <code>#xA</code> | <code>#xD</code> | <code>#x20</code> to <code>#xD7FF</code> | <code>#xE000</code> to <code>#xFFFD</code> | <code>#x10000</code> to <code>#x10FFFF</code>
    *             </p>
    *             <p>Any characters not included in this list will be rejected. For more information, see the <a href="http://www.w3.org/TR/REC-xml/#charsets">W3C specification for characters</a>.</p>
    *          </important>
    */
  var MessageBody: js.UndefOr[String] = js.undefined
  
  /**
    * <p>This parameter applies only to FIFO (first-in-first-out) queues.</p>
    *          <p>The token used for deduplication of sent messages. If a message with a particular <code>MessageDeduplicationId</code> is sent successfully, any messages sent with the same <code>MessageDeduplicationId</code>
    *           are accepted successfully but aren't delivered during the 5-minute deduplication interval. For more information, see <a href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues-exactly-once-processing.html">
    *           Exactly-once processing</a> in the <i>Amazon SQS Developer Guide</i>.</p>
    *          <ul>
    *             <li>
    *                <p>Every message must have a unique <code>MessageDeduplicationId</code>,</p>
    *                <ul>
    *                   <li>
    *                      <p>You may provide a <code>MessageDeduplicationId</code> explicitly.</p>
    *                   </li>
    *                   <li>
    *                      <p>If you aren't able to provide a <code>MessageDeduplicationId</code> and you enable <code>ContentBasedDeduplication</code> for your queue,
    *                           Amazon SQS uses a SHA-256 hash to generate the <code>MessageDeduplicationId</code> using the body of the message (but not the attributes of the message).
    *                       </p>
    *                   </li>
    *                   <li>
    *                      <p>If you don't provide a <code>MessageDeduplicationId</code> and the queue doesn't have <code>ContentBasedDeduplication</code> set,
    *                           the action fails with an error.</p>
    *                   </li>
    *                   <li>
    *                      <p>If the queue has <code>ContentBasedDeduplication</code> set, your <code>MessageDeduplicationId</code> overrides the generated one.</p>
    *                   </li>
    *                </ul>
    *             </li>
    *             <li>
    *                <p>When <code>ContentBasedDeduplication</code> is in effect, messages with identical content sent within the deduplication interval are treated as duplicates
    *                   and only one copy of the message is delivered.</p>
    *             </li>
    *             <li>
    *                <p>If you send one message with <code>ContentBasedDeduplication</code> enabled and then another message with a <code>MessageDeduplicationId</code> that is the same
    *                   as the one generated for the first <code>MessageDeduplicationId</code>, the two messages are treated as duplicates and only one copy of the message is delivered.
    *               </p>
    *             </li>
    *          </ul>
    *          <note>
    *             <p>The <code>MessageDeduplicationId</code> is available to the consumer of the
    *                 message (this can be useful for troubleshooting delivery issues).</p>
    *             <p>If a message is sent successfully but the acknowledgement is lost and the message is resent with the same
    *               <code>MessageDeduplicationId</code> after the deduplication interval, Amazon SQS can't detect duplicate messages.</p>
    *             <p>Amazon SQS continues to keep track of the message deduplication ID even after the message is received and deleted.</p>
    *          </note>
    *          <p>The maximum length of <code>MessageDeduplicationId</code> is 128 characters. <code>MessageDeduplicationId</code> can contain alphanumeric characters (<code>a-z</code>, <code>A-Z</code>, <code>0-9</code>) and
    *           punctuation (<code>!"#$%&'()*+,-./:;<=>?@[\]^_`\{|\}~</code>).</p>
    *          <p>For best practices of using <code>MessageDeduplicationId</code>, see
    *           <a href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagededuplicationid-property.html">Using the MessageDeduplicationId Property</a>
    *           in the <i>Amazon SQS Developer Guide</i>.</p>
    */
  var MessageDeduplicationId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>This parameter applies only to FIFO (first-in-first-out) queues.</p>
    *          <p>The tag that specifies that a message belongs to a specific message group. Messages
    *             that belong to the same message group are processed in a FIFO manner (however,
    *             messages in different message groups might be processed out of order). To interleave
    *             multiple ordered streams within a single queue, use <code>MessageGroupId</code> values
    *             (for example, session data for multiple users). In this scenario, multiple consumers can
    *             process the queue, but the session data of each user is processed in a FIFO
    *             fashion.</p>
    *          <ul>
    *             <li>
    *                <p>You must associate a non-empty <code>MessageGroupId</code> with a message. If you don't provide a <code>MessageGroupId</code>, the action fails.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>ReceiveMessage</code> might return messages with multiple <code>MessageGroupId</code> values. For each <code>MessageGroupId</code>, the messages are sorted by time sent. The caller can't
    *               specify a <code>MessageGroupId</code>.</p>
    *             </li>
    *          </ul>
    *          <p>The length of <code>MessageGroupId</code> is 128 characters. Valid values: alphanumeric characters and punctuation <code>(!"#$%&'()*+,-./:;<=>?@[\]^_`\{|\}~)</code>.</p>
    *          <p>For best practices of using <code>MessageGroupId</code>, see
    *           <a href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagegroupid-property.html">Using the MessageGroupId Property</a>
    *           in the <i>Amazon SQS Developer Guide</i>.</p>
    *          <important>
    *             <p>
    *                <code>MessageGroupId</code> is required for FIFO queues. You can't use it for Standard queues.</p>
    *          </important>
    */
  var MessageGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The message system attribute to send. Each message system attribute consists of a <code>Name</code>, <code>Type</code>, and <code>Value</code>.</p>
    *          <important>
    *             <ul>
    *                <li>
    *                   <p>Currently, the only supported message system attribute is <code>AWSTraceHeader</code>.
    *                     Its type must be <code>String</code> and its value must be a correctly formatted
    *                     X-Ray trace header string.</p>
    *                </li>
    *                <li>
    *                   <p>The size of a message system attribute doesn't count towards the total size of a message.</p>
    *                </li>
    *             </ul>
    *          </important>
    */
  var MessageSystemAttributes: js.UndefOr[Record[String, MessageSystemAttributeValue]] = js.undefined
  
  /**
    * <p>The URL of the Amazon SQS queue to which a message is sent.</p>
    *          <p>Queue URLs and names are case-sensitive.</p>
    */
  var QueueUrl: js.UndefOr[String] = js.undefined
}
object SendMessageRequest {
  
  inline def apply(): SendMessageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendMessageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendMessageRequest] (val x: Self) extends AnyVal {
    
    inline def setDelaySeconds(value: Double): Self = StObject.set(x, "DelaySeconds", value.asInstanceOf[js.Any])
    
    inline def setDelaySecondsUndefined: Self = StObject.set(x, "DelaySeconds", js.undefined)
    
    inline def setMessageAttributes(value: Record[String, MessageAttributeValue]): Self = StObject.set(x, "MessageAttributes", value.asInstanceOf[js.Any])
    
    inline def setMessageAttributesUndefined: Self = StObject.set(x, "MessageAttributes", js.undefined)
    
    inline def setMessageBody(value: String): Self = StObject.set(x, "MessageBody", value.asInstanceOf[js.Any])
    
    inline def setMessageBodyUndefined: Self = StObject.set(x, "MessageBody", js.undefined)
    
    inline def setMessageDeduplicationId(value: String): Self = StObject.set(x, "MessageDeduplicationId", value.asInstanceOf[js.Any])
    
    inline def setMessageDeduplicationIdUndefined: Self = StObject.set(x, "MessageDeduplicationId", js.undefined)
    
    inline def setMessageGroupId(value: String): Self = StObject.set(x, "MessageGroupId", value.asInstanceOf[js.Any])
    
    inline def setMessageGroupIdUndefined: Self = StObject.set(x, "MessageGroupId", js.undefined)
    
    inline def setMessageSystemAttributes(value: Record[String, MessageSystemAttributeValue]): Self = StObject.set(x, "MessageSystemAttributes", value.asInstanceOf[js.Any])
    
    inline def setMessageSystemAttributesUndefined: Self = StObject.set(x, "MessageSystemAttributes", js.undefined)
    
    inline def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
    
    inline def setQueueUrlUndefined: Self = StObject.set(x, "QueueUrl", js.undefined)
  }
}
