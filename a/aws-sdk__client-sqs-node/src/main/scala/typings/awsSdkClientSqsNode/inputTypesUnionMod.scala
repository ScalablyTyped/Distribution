package typings.awsSdkClientSqsNode

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
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
import typings.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchRequestEntryMod.ChangeMessageVisibilityBatchRequestEntry
import typings.awsSdkClientSqsNode.typesDeleteMessageBatchRequestEntryMod.DeleteMessageBatchRequestEntry
import typings.awsSdkClientSqsNode.typesSendMessageBatchRequestEntryMod.SendMessageBatchRequestEntry
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientSqsNode.typesAddPermissionInputMod.AddPermissionInput
    - typings.awsSdkClientSqsNode.typesChangeMessageVisibilityInputMod.ChangeMessageVisibilityInput
    - typings.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchInputMod.ChangeMessageVisibilityBatchInput
    - typings.awsSdkClientSqsNode.typesCreateQueueInputMod.CreateQueueInput
    - typings.awsSdkClientSqsNode.typesDeleteMessageInputMod.DeleteMessageInput
    - typings.awsSdkClientSqsNode.typesDeleteMessageBatchInputMod.DeleteMessageBatchInput
    - typings.awsSdkClientSqsNode.typesDeleteQueueInputMod.DeleteQueueInput
    - typings.awsSdkClientSqsNode.typesGetQueueAttributesInputMod.GetQueueAttributesInput
    - typings.awsSdkClientSqsNode.typesGetQueueUrlInputMod.GetQueueUrlInput
    - typings.awsSdkClientSqsNode.typesListDeadLetterSourceQueuesInputMod.ListDeadLetterSourceQueuesInput
    - typings.awsSdkClientSqsNode.typesListQueueTagsInputMod.ListQueueTagsInput
    - typings.awsSdkClientSqsNode.typesListQueuesInputMod.ListQueuesInput
    - typings.awsSdkClientSqsNode.typesPurgeQueueInputMod.PurgeQueueInput
    - typings.awsSdkClientSqsNode.typesReceiveMessageInputMod.ReceiveMessageInput
    - typings.awsSdkClientSqsNode.typesRemovePermissionInputMod.RemovePermissionInput
    - typings.awsSdkClientSqsNode.typesSendMessageInputMod.SendMessageInput
    - typings.awsSdkClientSqsNode.typesSendMessageBatchInputMod.SendMessageBatchInput
    - typings.awsSdkClientSqsNode.typesSetQueueAttributesInputMod.SetQueueAttributesInput
    - typings.awsSdkClientSqsNode.typesTagQueueInputMod.TagQueueInput
    - typings.awsSdkClientSqsNode.typesUntagQueueInputMod.UntagQueueInput
  */
  trait InputTypesUnion extends StObject
  object InputTypesUnion {
    
    @scala.inline
    def AddPermissionInput(
      AWSAccountIds: js.Array[String] | Iterable[String],
      Actions: js.Array[String] | Iterable[String],
      Label: String,
      QueueUrl: String
    ): typings.awsSdkClientSqsNode.typesAddPermissionInputMod.AddPermissionInput = {
      val __obj = js.Dynamic.literal(AWSAccountIds = AWSAccountIds.asInstanceOf[js.Any], Actions = Actions.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesAddPermissionInputMod.AddPermissionInput]
    }
    
    @scala.inline
    def ChangeMessageVisibilityBatchInput(
      Entries: js.Array[ChangeMessageVisibilityBatchRequestEntry] | Iterable[ChangeMessageVisibilityBatchRequestEntry],
      QueueUrl: String
    ): typings.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchInputMod.ChangeMessageVisibilityBatchInput = {
      val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchInputMod.ChangeMessageVisibilityBatchInput]
    }
    
    @scala.inline
    def ChangeMessageVisibilityInput(QueueUrl: String, ReceiptHandle: String, VisibilityTimeout: Double): typings.awsSdkClientSqsNode.typesChangeMessageVisibilityInputMod.ChangeMessageVisibilityInput = {
      val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any], ReceiptHandle = ReceiptHandle.asInstanceOf[js.Any], VisibilityTimeout = VisibilityTimeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesChangeMessageVisibilityInputMod.ChangeMessageVisibilityInput]
    }
    
    @scala.inline
    def CreateQueueInput(QueueName: String): typings.awsSdkClientSqsNode.typesCreateQueueInputMod.CreateQueueInput = {
      val __obj = js.Dynamic.literal(QueueName = QueueName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesCreateQueueInputMod.CreateQueueInput]
    }
    
    @scala.inline
    def DeleteMessageBatchInput(
      Entries: js.Array[DeleteMessageBatchRequestEntry] | Iterable[DeleteMessageBatchRequestEntry],
      QueueUrl: String
    ): typings.awsSdkClientSqsNode.typesDeleteMessageBatchInputMod.DeleteMessageBatchInput = {
      val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesDeleteMessageBatchInputMod.DeleteMessageBatchInput]
    }
    
    @scala.inline
    def DeleteMessageInput(QueueUrl: String, ReceiptHandle: String): typings.awsSdkClientSqsNode.typesDeleteMessageInputMod.DeleteMessageInput = {
      val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any], ReceiptHandle = ReceiptHandle.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesDeleteMessageInputMod.DeleteMessageInput]
    }
    
    @scala.inline
    def DeleteQueueInput(QueueUrl: String): typings.awsSdkClientSqsNode.typesDeleteQueueInputMod.DeleteQueueInput = {
      val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesDeleteQueueInputMod.DeleteQueueInput]
    }
    
    @scala.inline
    def GetQueueAttributesInput(QueueUrl: String): typings.awsSdkClientSqsNode.typesGetQueueAttributesInputMod.GetQueueAttributesInput = {
      val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesGetQueueAttributesInputMod.GetQueueAttributesInput]
    }
    
    @scala.inline
    def GetQueueUrlInput(QueueName: String): typings.awsSdkClientSqsNode.typesGetQueueUrlInputMod.GetQueueUrlInput = {
      val __obj = js.Dynamic.literal(QueueName = QueueName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesGetQueueUrlInputMod.GetQueueUrlInput]
    }
    
    @scala.inline
    def ListDeadLetterSourceQueuesInput(QueueUrl: String): typings.awsSdkClientSqsNode.typesListDeadLetterSourceQueuesInputMod.ListDeadLetterSourceQueuesInput = {
      val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesListDeadLetterSourceQueuesInputMod.ListDeadLetterSourceQueuesInput]
    }
    
    @scala.inline
    def ListQueueTagsInput(QueueUrl: String): typings.awsSdkClientSqsNode.typesListQueueTagsInputMod.ListQueueTagsInput = {
      val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesListQueueTagsInputMod.ListQueueTagsInput]
    }
    
    @scala.inline
    def ListQueuesInput(): typings.awsSdkClientSqsNode.typesListQueuesInputMod.ListQueuesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesListQueuesInputMod.ListQueuesInput]
    }
    
    @scala.inline
    def PurgeQueueInput(QueueUrl: String): typings.awsSdkClientSqsNode.typesPurgeQueueInputMod.PurgeQueueInput = {
      val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesPurgeQueueInputMod.PurgeQueueInput]
    }
    
    @scala.inline
    def ReceiveMessageInput(QueueUrl: String): typings.awsSdkClientSqsNode.typesReceiveMessageInputMod.ReceiveMessageInput = {
      val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesReceiveMessageInputMod.ReceiveMessageInput]
    }
    
    @scala.inline
    def RemovePermissionInput(Label: String, QueueUrl: String): typings.awsSdkClientSqsNode.typesRemovePermissionInputMod.RemovePermissionInput = {
      val __obj = js.Dynamic.literal(Label = Label.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesRemovePermissionInputMod.RemovePermissionInput]
    }
    
    @scala.inline
    def SendMessageBatchInput(
      Entries: js.Array[SendMessageBatchRequestEntry] | Iterable[SendMessageBatchRequestEntry],
      QueueUrl: String
    ): typings.awsSdkClientSqsNode.typesSendMessageBatchInputMod.SendMessageBatchInput = {
      val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesSendMessageBatchInputMod.SendMessageBatchInput]
    }
    
    @scala.inline
    def SendMessageInput(MessageBody: String, QueueUrl: String): typings.awsSdkClientSqsNode.typesSendMessageInputMod.SendMessageInput = {
      val __obj = js.Dynamic.literal(MessageBody = MessageBody.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesSendMessageInputMod.SendMessageInput]
    }
    
    @scala.inline
    def SetQueueAttributesInput(
      Attributes: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in 'All' | 'Policy' | 'VisibilityTimeout' | 'MaximumMessageSize' | 'MessageRetentionPeriod' | 'ApproximateNumberOfMessages' | 'ApproximateNumberOfMessagesNotVisible' | 'CreatedTimestamp' | 'LastModifiedTimestamp' | 'QueueArn' | 'ApproximateNumberOfMessagesDelayed' | 'DelaySeconds' | 'ReceiveMessageWaitTimeSeconds' | 'RedrivePolicy' | 'FifoQueue' | 'ContentBasedDeduplication' | 'KmsMasterKeyId' | 'KmsDataKeyReusePeriodSeconds' | string ]: string}
      */ typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.SetQueueAttributesInput with TopLevel[js.Any]) | (Iterable[
          js.Tuple2[
            All | Policy | VisibilityTimeout | MaximumMessageSize | MessageRetentionPeriod | ApproximateNumberOfMessages | ApproximateNumberOfMessagesNotVisible | CreatedTimestamp | LastModifiedTimestamp | QueueArn | ApproximateNumberOfMessagesDelayed | DelaySeconds | ReceiveMessageWaitTimeSeconds | RedrivePolicy | FifoQueue | ContentBasedDeduplication | KmsMasterKeyId | KmsDataKeyReusePeriodSeconds | String, 
            String
          ]
        ]),
      QueueUrl: String
    ): typings.awsSdkClientSqsNode.typesSetQueueAttributesInputMod.SetQueueAttributesInput = {
      val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesSetQueueAttributesInputMod.SetQueueAttributesInput]
    }
    
    @scala.inline
    def TagQueueInput(QueueUrl: String, Tags: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): typings.awsSdkClientSqsNode.typesTagQueueInputMod.TagQueueInput = {
      val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesTagQueueInputMod.TagQueueInput]
    }
    
    @scala.inline
    def UntagQueueInput(QueueUrl: String, TagKeys: js.Array[String] | Iterable[String]): typings.awsSdkClientSqsNode.typesUntagQueueInputMod.UntagQueueInput = {
      val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesUntagQueueInputMod.UntagQueueInput]
    }
  }
}
