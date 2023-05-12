package typings.awsSdkClientSqs

import typings.awsSdkClientSqs.anon.ExceptionOptionTypeBatchE
import typings.awsSdkClientSqs.anon.ExceptionOptionTypeBatchR
import typings.awsSdkClientSqs.anon.ExceptionOptionTypeEmptyB
import typings.awsSdkClientSqs.anon.ExceptionOptionTypeInvali
import typings.awsSdkClientSqs.anon.ExceptionOptionTypeMessag
import typings.awsSdkClientSqs.anon.ExceptionOptionTypeOverLi
import typings.awsSdkClientSqs.anon.ExceptionOptionTypePurgeQ
import typings.awsSdkClientSqs.anon.ExceptionOptionTypeQueueD
import typings.awsSdkClientSqs.anon.ExceptionOptionTypeQueueN
import typings.awsSdkClientSqs.anon.ExceptionOptionTypeReceip
import typings.awsSdkClientSqs.anon.ExceptionOptionTypeTooMan
import typings.awsSdkClientSqs.anon.ExceptionOptionTypeUnsupp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesModelsMod {
  
  @JSImport("@aws-sdk/client-sqs/dist-types/models", "BatchEntryIdsNotDistinct")
  @js.native
  open class BatchEntryIdsNotDistinct protected ()
    extends typings.awsSdkClientSqs.distTypesModelsModels0Mod.BatchEntryIdsNotDistinct {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeBatchE) = this()
  }
  
  @JSImport("@aws-sdk/client-sqs/dist-types/models", "BatchRequestTooLong")
  @js.native
  open class BatchRequestTooLong protected ()
    extends typings.awsSdkClientSqs.distTypesModelsModels0Mod.BatchRequestTooLong {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeBatchR) = this()
  }
  
  @JSImport("@aws-sdk/client-sqs/dist-types/models", "EmptyBatchRequest")
  @js.native
  open class EmptyBatchRequest protected ()
    extends typings.awsSdkClientSqs.distTypesModelsModels0Mod.EmptyBatchRequest {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeEmptyB) = this()
  }
  
  @JSImport("@aws-sdk/client-sqs/dist-types/models", "InvalidAttributeName")
  @js.native
  open class InvalidAttributeName protected ()
    extends typings.awsSdkClientSqs.distTypesModelsModels0Mod.InvalidAttributeName {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
  }
  
  @JSImport("@aws-sdk/client-sqs/dist-types/models", "InvalidBatchEntryId")
  @js.native
  open class InvalidBatchEntryId protected ()
    extends typings.awsSdkClientSqs.distTypesModelsModels0Mod.InvalidBatchEntryId {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
  }
  
  @JSImport("@aws-sdk/client-sqs/dist-types/models", "InvalidIdFormat")
  @js.native
  open class InvalidIdFormat protected ()
    extends typings.awsSdkClientSqs.distTypesModelsModels0Mod.InvalidIdFormat {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
  }
  
  @JSImport("@aws-sdk/client-sqs/dist-types/models", "InvalidMessageContents")
  @js.native
  open class InvalidMessageContents protected ()
    extends typings.awsSdkClientSqs.distTypesModelsModels0Mod.InvalidMessageContents {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
  }
  
  @JSImport("@aws-sdk/client-sqs/dist-types/models", "MessageNotInflight")
  @js.native
  open class MessageNotInflight protected ()
    extends typings.awsSdkClientSqs.distTypesModelsModels0Mod.MessageNotInflight {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeMessag) = this()
  }
  
  object MessageSystemAttributeName {
    
    @JSImport("@aws-sdk/client-sqs/dist-types/models", "MessageSystemAttributeName.AWSTraceHeader")
    @js.native
    val AWSTraceHeader: typings.awsSdkClientSqs.awsSdkClientSqsStrings.AWSTraceHeader = js.native
    
    @JSImport("@aws-sdk/client-sqs/dist-types/models", "MessageSystemAttributeName.ApproximateFirstReceiveTimestamp")
    @js.native
    val ApproximateFirstReceiveTimestamp: typings.awsSdkClientSqs.awsSdkClientSqsStrings.ApproximateFirstReceiveTimestamp = js.native
    
    @JSImport("@aws-sdk/client-sqs/dist-types/models", "MessageSystemAttributeName.ApproximateReceiveCount")
    @js.native
    val ApproximateReceiveCount: typings.awsSdkClientSqs.awsSdkClientSqsStrings.ApproximateReceiveCount = js.native
    
    @JSImport("@aws-sdk/client-sqs/dist-types/models", "MessageSystemAttributeName.MessageDeduplicationId")
    @js.native
    val MessageDeduplicationId: typings.awsSdkClientSqs.awsSdkClientSqsStrings.MessageDeduplicationId = js.native
    
    @JSImport("@aws-sdk/client-sqs/dist-types/models", "MessageSystemAttributeName.MessageGroupId")
    @js.native
    val MessageGroupId: typings.awsSdkClientSqs.awsSdkClientSqsStrings.MessageGroupId = js.native
    
    @JSImport("@aws-sdk/client-sqs/dist-types/models", "MessageSystemAttributeName.SenderId")
    @js.native
    val SenderId: typings.awsSdkClientSqs.awsSdkClientSqsStrings.SenderId = js.native
    
    @JSImport("@aws-sdk/client-sqs/dist-types/models", "MessageSystemAttributeName.SentTimestamp")
    @js.native
    val SentTimestamp: typings.awsSdkClientSqs.awsSdkClientSqsStrings.SentTimestamp = js.native
    
    @JSImport("@aws-sdk/client-sqs/dist-types/models", "MessageSystemAttributeName.SequenceNumber")
    @js.native
    val SequenceNumber: typings.awsSdkClientSqs.awsSdkClientSqsStrings.SequenceNumber = js.native
  }
  
  object MessageSystemAttributeNameForSends {
    
    @JSImport("@aws-sdk/client-sqs/dist-types/models", "MessageSystemAttributeNameForSends.AWSTraceHeader")
    @js.native
    val AWSTraceHeader: typings.awsSdkClientSqs.awsSdkClientSqsStrings.AWSTraceHeader = js.native
  }
  
  @JSImport("@aws-sdk/client-sqs/dist-types/models", "OverLimit")
  @js.native
  open class OverLimit protected ()
    extends typings.awsSdkClientSqs.distTypesModelsModels0Mod.OverLimit {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeOverLi) = this()
  }
  
  @JSImport("@aws-sdk/client-sqs/dist-types/models", "PurgeQueueInProgress")
  @js.native
  open class PurgeQueueInProgress protected ()
    extends typings.awsSdkClientSqs.distTypesModelsModels0Mod.PurgeQueueInProgress {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypePurgeQ) = this()
  }
  
  object QueueAttributeName {
    
    @JSImport("@aws-sdk/client-sqs/dist-types/models", "QueueAttributeName.All")
    @js.native
    val All: typings.awsSdkClientSqs.awsSdkClientSqsStrings.All = js.native
    
    @JSImport("@aws-sdk/client-sqs/dist-types/models", "QueueAttributeName.ApproximateNumberOfMessages")
    @js.native
    val ApproximateNumberOfMessages: typings.awsSdkClientSqs.awsSdkClientSqsStrings.ApproximateNumberOfMessages = js.native
    
    @JSImport("@aws-sdk/client-sqs/dist-types/models", "QueueAttributeName.ApproximateNumberOfMessagesDelayed")
    @js.native
    val ApproximateNumberOfMessagesDelayed: typings.awsSdkClientSqs.awsSdkClientSqsStrings.ApproximateNumberOfMessagesDelayed = js.native
    
    @JSImport("@aws-sdk/client-sqs/dist-types/models", "QueueAttributeName.ApproximateNumberOfMessagesNotVisible")
    @js.native
    val ApproximateNumberOfMessagesNotVisible: typings.awsSdkClientSqs.awsSdkClientSqsStrings.ApproximateNumberOfMessagesNotVisible = js.native
    
    @JSImport("@aws-sdk/client-sqs/dist-types/models", "QueueAttributeName.ContentBasedDeduplication")
    @js.native
    val ContentBasedDeduplication: typings.awsSdkClientSqs.awsSdkClientSqsStrings.ContentBasedDeduplication = js.native
    
    @JSImport("@aws-sdk/client-sqs/dist-types/models", "QueueAttributeName.CreatedTimestamp")
    @js.native
    val CreatedTimestamp: typings.awsSdkClientSqs.awsSdkClientSqsStrings.CreatedTimestamp = js.native
    
    @JSImport("@aws-sdk/client-sqs/dist-types/models", "QueueAttributeName.DeduplicationScope")
    @js.native
    val DeduplicationScope: typings.awsSdkClientSqs.awsSdkClientSqsStrings.DeduplicationScope = js.native
    
    @JSImport("@aws-sdk/client-sqs/dist-types/models", "QueueAttributeName.DelaySeconds")
    @js.native
    val DelaySeconds: typings.awsSdkClientSqs.awsSdkClientSqsStrings.DelaySeconds = js.native
    
    @JSImport("@aws-sdk/client-sqs/dist-types/models", "QueueAttributeName.FifoQueue")
    @js.native
    val FifoQueue: typings.awsSdkClientSqs.awsSdkClientSqsStrings.FifoQueue = js.native
    
    @JSImport("@aws-sdk/client-sqs/dist-types/models", "QueueAttributeName.FifoThroughputLimit")
    @js.native
    val FifoThroughputLimit: typings.awsSdkClientSqs.awsSdkClientSqsStrings.FifoThroughputLimit = js.native
    
    @JSImport("@aws-sdk/client-sqs/dist-types/models", "QueueAttributeName.KmsDataKeyReusePeriodSeconds")
    @js.native
    val KmsDataKeyReusePeriodSeconds: typings.awsSdkClientSqs.awsSdkClientSqsStrings.KmsDataKeyReusePeriodSeconds = js.native
    
    @JSImport("@aws-sdk/client-sqs/dist-types/models", "QueueAttributeName.KmsMasterKeyId")
    @js.native
    val KmsMasterKeyId: typings.awsSdkClientSqs.awsSdkClientSqsStrings.KmsMasterKeyId = js.native
    
    @JSImport("@aws-sdk/client-sqs/dist-types/models", "QueueAttributeName.LastModifiedTimestamp")
    @js.native
    val LastModifiedTimestamp: typings.awsSdkClientSqs.awsSdkClientSqsStrings.LastModifiedTimestamp = js.native
    
    @JSImport("@aws-sdk/client-sqs/dist-types/models", "QueueAttributeName.MaximumMessageSize")
    @js.native
    val MaximumMessageSize: typings.awsSdkClientSqs.awsSdkClientSqsStrings.MaximumMessageSize = js.native
    
    @JSImport("@aws-sdk/client-sqs/dist-types/models", "QueueAttributeName.MessageRetentionPeriod")
    @js.native
    val MessageRetentionPeriod: typings.awsSdkClientSqs.awsSdkClientSqsStrings.MessageRetentionPeriod = js.native
    
    @JSImport("@aws-sdk/client-sqs/dist-types/models", "QueueAttributeName.Policy")
    @js.native
    val Policy: typings.awsSdkClientSqs.awsSdkClientSqsStrings.Policy = js.native
    
    @JSImport("@aws-sdk/client-sqs/dist-types/models", "QueueAttributeName.QueueArn")
    @js.native
    val QueueArn: typings.awsSdkClientSqs.awsSdkClientSqsStrings.QueueArn = js.native
    
    @JSImport("@aws-sdk/client-sqs/dist-types/models", "QueueAttributeName.ReceiveMessageWaitTimeSeconds")
    @js.native
    val ReceiveMessageWaitTimeSeconds: typings.awsSdkClientSqs.awsSdkClientSqsStrings.ReceiveMessageWaitTimeSeconds = js.native
    
    @JSImport("@aws-sdk/client-sqs/dist-types/models", "QueueAttributeName.RedriveAllowPolicy")
    @js.native
    val RedriveAllowPolicy: typings.awsSdkClientSqs.awsSdkClientSqsStrings.RedriveAllowPolicy = js.native
    
    @JSImport("@aws-sdk/client-sqs/dist-types/models", "QueueAttributeName.RedrivePolicy")
    @js.native
    val RedrivePolicy: typings.awsSdkClientSqs.awsSdkClientSqsStrings.RedrivePolicy = js.native
    
    @JSImport("@aws-sdk/client-sqs/dist-types/models", "QueueAttributeName.SqsManagedSseEnabled")
    @js.native
    val SqsManagedSseEnabled: typings.awsSdkClientSqs.awsSdkClientSqsStrings.SqsManagedSseEnabled = js.native
    
    @JSImport("@aws-sdk/client-sqs/dist-types/models", "QueueAttributeName.VisibilityTimeout")
    @js.native
    val VisibilityTimeout: typings.awsSdkClientSqs.awsSdkClientSqsStrings.VisibilityTimeout = js.native
  }
  
  @JSImport("@aws-sdk/client-sqs/dist-types/models", "QueueDeletedRecently")
  @js.native
  open class QueueDeletedRecently protected ()
    extends typings.awsSdkClientSqs.distTypesModelsModels0Mod.QueueDeletedRecently {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeQueueD) = this()
  }
  
  @JSImport("@aws-sdk/client-sqs/dist-types/models", "QueueDoesNotExist")
  @js.native
  open class QueueDoesNotExist protected ()
    extends typings.awsSdkClientSqs.distTypesModelsModels0Mod.QueueDoesNotExist {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeQueueD) = this()
  }
  
  @JSImport("@aws-sdk/client-sqs/dist-types/models", "QueueNameExists")
  @js.native
  open class QueueNameExists protected ()
    extends typings.awsSdkClientSqs.distTypesModelsModels0Mod.QueueNameExists {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeQueueN) = this()
  }
  
  @JSImport("@aws-sdk/client-sqs/dist-types/models", "ReceiptHandleIsInvalid")
  @js.native
  open class ReceiptHandleIsInvalid protected ()
    extends typings.awsSdkClientSqs.distTypesModelsModels0Mod.ReceiptHandleIsInvalid {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeReceip) = this()
  }
  
  @JSImport("@aws-sdk/client-sqs/dist-types/models", "TooManyEntriesInBatchRequest")
  @js.native
  open class TooManyEntriesInBatchRequest protected ()
    extends typings.awsSdkClientSqs.distTypesModelsModels0Mod.TooManyEntriesInBatchRequest {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeTooMan) = this()
  }
  
  @JSImport("@aws-sdk/client-sqs/dist-types/models", "UnsupportedOperation")
  @js.native
  open class UnsupportedOperation protected ()
    extends typings.awsSdkClientSqs.distTypesModelsModels0Mod.UnsupportedOperation {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeUnsupp) = this()
  }
}
