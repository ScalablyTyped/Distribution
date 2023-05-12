package typings.awsSdk2Types.clientsSqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQueueAttributesRequest extends StObject {
  
  /**
    * A list of attributes for which to retrieve information. The AttributeName.N parameter is optional, but if you don't specify values for this parameter, the request returns empty results.  In the future, new attributes might be added. If you write code that calls this action, we recommend that you structure your code so that it can handle new attributes gracefully.  The following attributes are supported:  The ApproximateNumberOfMessagesDelayed, ApproximateNumberOfMessagesNotVisible, and ApproximateNumberOfMessagesVisible metrics may not achieve consistency until at least 1 minute after the producers stop sending messages. This period is required for the queue metadata to reach eventual consistency.      All – Returns all values.     ApproximateNumberOfMessages – Returns the approximate number of messages available for retrieval from the queue.    ApproximateNumberOfMessagesDelayed – Returns the approximate number of messages in the queue that are delayed and not available for reading immediately. This can happen when the queue is configured as a delay queue or when a message has been sent with a delay parameter.    ApproximateNumberOfMessagesNotVisible – Returns the approximate number of messages that are in flight. Messages are considered to be in flight if they have been sent to a client but have not yet been deleted or have not yet reached the end of their visibility window.     CreatedTimestamp – Returns the time when the queue was created in seconds (epoch time).    DelaySeconds – Returns the default delay on the queue in seconds.    LastModifiedTimestamp – Returns the time when the queue was last changed in seconds (epoch time).    MaximumMessageSize – Returns the limit of how many bytes a message can contain before Amazon SQS rejects it.    MessageRetentionPeriod – Returns the length of time, in seconds, for which Amazon SQS retains a message.    Policy – Returns the policy of the queue.    QueueArn – Returns the Amazon resource name (ARN) of the queue.    ReceiveMessageWaitTimeSeconds – Returns the length of time, in seconds, for which the ReceiveMessage action waits for a message to arrive.     RedrivePolicy – The string that includes the parameters for the dead-letter queue functionality of the source queue as a JSON object. For more information about the redrive policy and dead-letter queues, see Using Amazon SQS Dead-Letter Queues in the Amazon SQS Developer Guide.    deadLetterTargetArn – The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon SQS moves messages after the value of maxReceiveCount is exceeded.    maxReceiveCount – The number of times a message is delivered to the source queue before being moved to the dead-letter queue. When the ReceiveCount for a message exceeds the maxReceiveCount for a queue, Amazon SQS moves the message to the dead-letter-queue.      VisibilityTimeout – Returns the visibility timeout for the queue. For more information about the visibility timeout, see Visibility Timeout in the Amazon SQS Developer Guide.    The following attributes apply only to server-side-encryption:    KmsMasterKeyId – Returns the ID of an Amazon Web Services managed customer master key (CMK) for Amazon SQS or a custom CMK. For more information, see Key Terms.     KmsDataKeyReusePeriodSeconds – Returns the length of time, in seconds, for which Amazon SQS can reuse a data key to encrypt or decrypt messages before calling KMS again. For more information, see How Does the Data Key Reuse Period Work?.     SqsManagedSseEnabled – Returns information about whether the queue is using SSE-SQS encryption using SQS owned encryption keys. Only one server-side encryption option is supported per queue (e.g. SSE-KMS or SSE-SQS).   The following attributes apply only to FIFO (first-in-first-out) queues:    FifoQueue – Returns information about whether the queue is FIFO. For more information, see FIFO queue logic in the Amazon SQS Developer Guide.  To determine whether a queue is FIFO, you can check whether QueueName ends with the .fifo suffix.     ContentBasedDeduplication – Returns whether content-based deduplication is enabled for the queue. For more information, see Exactly-once processing in the Amazon SQS Developer Guide.    The following attributes apply only to high throughput for FIFO queues:    DeduplicationScope – Specifies whether message deduplication occurs at the message group or queue level. Valid values are messageGroup and queue.    FifoThroughputLimit – Specifies whether the FIFO queue throughput quota applies to the entire queue or per message group. Valid values are perQueue and perMessageGroupId. The perMessageGroupId value is allowed only when the value for DeduplicationScope is messageGroup.   To enable high throughput for FIFO queues, do the following:   Set DeduplicationScope to messageGroup.   Set FifoThroughputLimit to perMessageGroupId.   If you set these attributes to anything other than the values shown for enabling high throughput, normal throughput is in effect and deduplication occurs as specified. For information on throughput quotas, see Quotas related to messages in the Amazon SQS Developer Guide.
    */
  var AttributeNames: js.UndefOr[AttributeNameList] = js.undefined
  
  /**
    * The URL of the Amazon SQS queue whose attribute information is retrieved. Queue URLs and names are case-sensitive.
    */
  var QueueUrl: String
}
object GetQueueAttributesRequest {
  
  inline def apply(QueueUrl: String): GetQueueAttributesRequest = {
    val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueueAttributesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetQueueAttributesRequest] (val x: Self) extends AnyVal {
    
    inline def setAttributeNames(value: AttributeNameList): Self = StObject.set(x, "AttributeNames", value.asInstanceOf[js.Any])
    
    inline def setAttributeNamesUndefined: Self = StObject.set(x, "AttributeNames", js.undefined)
    
    inline def setAttributeNamesVarargs(value: QueueAttributeName*): Self = StObject.set(x, "AttributeNames", js.Array(value*))
    
    inline def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
  }
}
