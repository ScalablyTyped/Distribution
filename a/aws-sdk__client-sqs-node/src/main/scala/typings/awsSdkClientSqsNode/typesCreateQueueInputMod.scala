package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.All
import typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.ApproximateNumberOfMessages
import typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.ApproximateNumberOfMessagesDelayed
import typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.ApproximateNumberOfMessagesNotVisible
import typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.ContentBasedDeduplication
import typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.CreatedTimestamp
import typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.DelaySeconds
import typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.FifoQueue
import typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.KmsDataKeyReusePeriodSeconds
import typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.KmsMasterKeyId
import typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.LastModifiedTimestamp
import typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.MaximumMessageSize
import typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.MessageRetentionPeriod
import typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.Policy
import typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.QueueArn
import typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.ReceiveMessageWaitTimeSeconds
import typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.RedrivePolicy
import typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.VisibilityTimeout
import typings.awsSdkClientSqsNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.distTypesAbortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateQueueInputMod {
  
  trait CreateQueueInput
    extends StObject
       with InputTypesUnion {
    
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ] = js.undefined
    
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>A map of attributes with their corresponding values.</p> <p>The following lists the names, descriptions, and values of the special request parameters that the <code>CreateQueue</code> action uses:</p> <ul> <li> <p> <code>DelaySeconds</code> - The length of time, in seconds, for which the delivery of all messages in the queue is delayed. Valid values: An integer from 0 to 900 seconds (15 minutes). Default: 0. </p> </li> <li> <p> <code>MaximumMessageSize</code> - The limit of how many bytes a message can contain before Amazon SQS rejects it. Valid values: An integer from 1,024 bytes (1 KiB) to 262,144 bytes (256 KiB). Default: 262,144 (256 KiB). </p> </li> <li> <p> <code>MessageRetentionPeriod</code> - The length of time, in seconds, for which Amazon SQS retains a message. Valid values: An integer from 60 seconds (1 minute) to 1,209,600 seconds (14 days). Default: 345,600 (4 days). </p> </li> <li> <p> <code>Policy</code> - The queue's policy. A valid AWS policy. For more information about policy structure, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/PoliciesOverview.html">Overview of AWS IAM Policies</a> in the <i>Amazon IAM User Guide</i>. </p> </li> <li> <p> <code>ReceiveMessageWaitTimeSeconds</code> - The length of time, in seconds, for which a <code> <a>ReceiveMessage</a> </code> action waits for a message to arrive. Valid values: An integer from 0 to 20 (seconds). Default: 0. </p> </li> <li> <p> <code>RedrivePolicy</code> - The string that includes the parameters for the dead-letter queue functionality of the source queue. For more information about the redrive policy and dead-letter queues, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html">Using Amazon SQS Dead-Letter Queues</a> in the <i>Amazon Simple Queue Service Developer Guide</i>. </p> <ul> <li> <p> <code>deadLetterTargetArn</code> - The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon SQS moves messages after the value of <code>maxReceiveCount</code> is exceeded.</p> </li> <li> <p> <code>maxReceiveCount</code> - The number of times a message is delivered to the source queue before being moved to the dead-letter queue. When the <code>ReceiveCount</code> for a message exceeds the <code>maxReceiveCount</code> for a queue, Amazon SQS moves the message to the dead-letter-queue.</p> </li> </ul> <note> <p>The dead-letter queue of a FIFO queue must also be a FIFO queue. Similarly, the dead-letter queue of a standard queue must also be a standard queue.</p> </note> </li> <li> <p> <code>VisibilityTimeout</code> - The visibility timeout for the queue, in seconds. Valid values: An integer from 0 to 43,200 (12 hours). Default: 30. For more information about the visibility timeout, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html">Visibility Timeout</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.</p> </li> </ul> <p>The following attributes apply only to <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html">server-side-encryption</a>:</p> <ul> <li> <p> <code>KmsMasterKeyId</code> - The ID of an AWS-managed customer master key (CMK) for Amazon SQS or a custom CMK. For more information, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms">Key Terms</a>. While the alias of the AWS-managed CMK for Amazon SQS is always <code>alias/aws/sqs</code>, the alias of a custom CMK can, for example, be <code>alias/<i>MyAlias</i> </code>. For more examples, see <a href="http://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters">KeyId</a> in the <i>AWS Key Management Service API Reference</i>. </p> </li> <li> <p> <code>KmsDataKeyReusePeriodSeconds</code> - The length of time, in seconds, for which Amazon SQS can reuse a <a href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#data-keys">data key</a> to encrypt or decrypt messages before calling AWS KMS again. An integer representing seconds, between 60 seconds (1 minute) and 86,400 seconds (24 hours). Default: 300 (5 minutes). A shorter time period provides better security but results in more calls to KMS which might incur charges after Free Tier. For more information, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-how-does-the-data-key-reuse-period-work">How Does the Data Key Reuse Period Work?</a>. </p> </li> </ul> <p>The following attributes apply only to <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html">FIFO (first-in-first-out) queues</a>:</p> <ul> <li> <p> <code>FifoQueue</code> - Designates a queue as FIFO. Valid values: <code>true</code>, <code>false</code>. You can provide this attribute only during queue creation. You can't change it for an existing queue. When you set this attribute, you must also provide the <code>MessageGroupId</code> for your messages explicitly.</p> <p>For more information, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-understanding-logic">FIFO Queue Logic</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.</p> </li> <li> <p> <code>ContentBasedDeduplication</code> - Enables content-based deduplication. Valid values: <code>true</code>, <code>false</code>. For more information, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing">Exactly-Once Processing</a> in the <i>Amazon Simple Queue Service Developer Guide</i>. </p> <ul> <li> <p>Every message must have a unique <code>MessageDeduplicationId</code>,</p> <ul> <li> <p>You may provide a <code>MessageDeduplicationId</code> explicitly.</p> </li> <li> <p>If you aren't able to provide a <code>MessageDeduplicationId</code> and you enable <code>ContentBasedDeduplication</code> for your queue, Amazon SQS uses a SHA-256 hash to generate the <code>MessageDeduplicationId</code> using the body of the message (but not the attributes of the message). </p> </li> <li> <p>If you don't provide a <code>MessageDeduplicationId</code> and the queue doesn't have <code>ContentBasedDeduplication</code> set, the action fails with an error.</p> </li> <li> <p>If the queue has <code>ContentBasedDeduplication</code> set, your <code>MessageDeduplicationId</code> overrides the generated one.</p> </li> </ul> </li> <li> <p>When <code>ContentBasedDeduplication</code> is in effect, messages with identical content sent within the deduplication interval are treated as duplicates and only one copy of the message is delivered.</p> </li> <li> <p>If you send one message with <code>ContentBasedDeduplication</code> enabled and then another message with a <code>MessageDeduplicationId</code> that is the same as the one generated for the first <code>MessageDeduplicationId</code>, the two messages are treated as duplicates and only one copy of the message is delivered. </p> </li> </ul> </li> </ul>
      */
    var Attributes: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in 'All' | 'Policy' | 'VisibilityTimeout' | 'MaximumMessageSize' | 'MessageRetentionPeriod' | 'ApproximateNumberOfMessages' | 'ApproximateNumberOfMessagesNotVisible' | 'CreatedTimestamp' | 'LastModifiedTimestamp' | 'QueueArn' | 'ApproximateNumberOfMessagesDelayed' | 'DelaySeconds' | 'ReceiveMessageWaitTimeSeconds' | 'RedrivePolicy' | 'FifoQueue' | 'ContentBasedDeduplication' | 'KmsMasterKeyId' | 'KmsDataKeyReusePeriodSeconds' | string ]: string} */ js.Any) | (js.Iterable[
          js.Tuple2[
            All | Policy | VisibilityTimeout | MaximumMessageSize | MessageRetentionPeriod | ApproximateNumberOfMessages | ApproximateNumberOfMessagesNotVisible | CreatedTimestamp | LastModifiedTimestamp | QueueArn | ApproximateNumberOfMessagesDelayed | DelaySeconds | ReceiveMessageWaitTimeSeconds | RedrivePolicy | FifoQueue | ContentBasedDeduplication | KmsMasterKeyId | KmsDataKeyReusePeriodSeconds | String, 
            String
          ]
        ])
      ] = js.undefined
    
    /**
      * <p>The name of the new queue. The following limits apply to this name:</p> <ul> <li> <p>A queue name can have up to 80 characters.</p> </li> <li> <p>Valid values: alphanumeric characters, hyphens (<code>-</code>), and underscores (<code>_</code>).</p> </li> <li> <p>A FIFO queue name must end with the <code>.fifo</code> suffix.</p> </li> </ul> <p>Queue URLs and names are case-sensitive.</p>
      */
    var QueueName: String
  }
  object CreateQueueInput {
    
    inline def apply(QueueName: String): CreateQueueInput = {
      val __obj = js.Dynamic.literal(QueueName = QueueName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateQueueInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateQueueInput] (val x: Self) extends AnyVal {
      
      inline def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      inline def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      inline def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      inline def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      inline def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      inline def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      inline def setAttributes(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in 'All' | 'Policy' | 'VisibilityTimeout' | 'MaximumMessageSize' | 'MessageRetentionPeriod' | 'ApproximateNumberOfMessages' | 'ApproximateNumberOfMessagesNotVisible' | 'CreatedTimestamp' | 'LastModifiedTimestamp' | 'QueueArn' | 'ApproximateNumberOfMessagesDelayed' | 'DelaySeconds' | 'ReceiveMessageWaitTimeSeconds' | 'RedrivePolicy' | 'FifoQueue' | 'ContentBasedDeduplication' | 'KmsMasterKeyId' | 'KmsDataKeyReusePeriodSeconds' | string ]: string} */ js.Any) | (js.Iterable[
              js.Tuple2[
                All | Policy | VisibilityTimeout | MaximumMessageSize | MessageRetentionPeriod | ApproximateNumberOfMessages | ApproximateNumberOfMessagesNotVisible | CreatedTimestamp | LastModifiedTimestamp | QueueArn | ApproximateNumberOfMessagesDelayed | DelaySeconds | ReceiveMessageWaitTimeSeconds | RedrivePolicy | FifoQueue | ContentBasedDeduplication | KmsMasterKeyId | KmsDataKeyReusePeriodSeconds | String, 
                String
              ]
            ])
      ): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
      
      inline def setQueueName(value: String): Self = StObject.set(x, "QueueName", value.asInstanceOf[js.Any])
    }
  }
}
