package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.typesBatchResultErrorEntryMod.UnmarshalledBatchResultErrorEntry
import typings.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchResultEntryMod.UnmarshalledChangeMessageVisibilityBatchResultEntry
import typings.awsSdkClientSqsNode.typesDeleteMessageBatchResultEntryMod.UnmarshalledDeleteMessageBatchResultEntry
import typings.awsSdkClientSqsNode.typesSendMessageBatchResultEntryMod.UnmarshalledSendMessageBatchResultEntry
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientSqsNode.typesAddPermissionOutputMod.AddPermissionOutput
    - typings.awsSdkClientSqsNode.typesChangeMessageVisibilityOutputMod.ChangeMessageVisibilityOutput
    - typings.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchOutputMod.ChangeMessageVisibilityBatchOutput
    - typings.awsSdkClientSqsNode.typesCreateQueueOutputMod.CreateQueueOutput
    - typings.awsSdkClientSqsNode.typesDeleteMessageOutputMod.DeleteMessageOutput
    - typings.awsSdkClientSqsNode.typesDeleteMessageBatchOutputMod.DeleteMessageBatchOutput
    - typings.awsSdkClientSqsNode.typesDeleteQueueOutputMod.DeleteQueueOutput
    - typings.awsSdkClientSqsNode.typesGetQueueAttributesOutputMod.GetQueueAttributesOutput
    - typings.awsSdkClientSqsNode.typesGetQueueUrlOutputMod.GetQueueUrlOutput
    - typings.awsSdkClientSqsNode.typesListDeadLetterSourceQueuesOutputMod.ListDeadLetterSourceQueuesOutput
    - typings.awsSdkClientSqsNode.typesListQueueTagsOutputMod.ListQueueTagsOutput
    - typings.awsSdkClientSqsNode.typesListQueuesOutputMod.ListQueuesOutput
    - typings.awsSdkClientSqsNode.typesPurgeQueueOutputMod.PurgeQueueOutput
    - typings.awsSdkClientSqsNode.typesReceiveMessageOutputMod.ReceiveMessageOutput
    - typings.awsSdkClientSqsNode.typesRemovePermissionOutputMod.RemovePermissionOutput
    - typings.awsSdkClientSqsNode.typesSendMessageOutputMod.SendMessageOutput
    - typings.awsSdkClientSqsNode.typesSendMessageBatchOutputMod.SendMessageBatchOutput
    - typings.awsSdkClientSqsNode.typesSetQueueAttributesOutputMod.SetQueueAttributesOutput
    - typings.awsSdkClientSqsNode.typesTagQueueOutputMod.TagQueueOutput
    - typings.awsSdkClientSqsNode.typesUntagQueueOutputMod.UntagQueueOutput
  */
  trait OutputTypesUnion extends StObject
  object OutputTypesUnion {
    
    @scala.inline
    def AddPermissionOutput($metadata: ResponseMetadata): typings.awsSdkClientSqsNode.typesAddPermissionOutputMod.AddPermissionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesAddPermissionOutputMod.AddPermissionOutput]
    }
    
    @scala.inline
    def ChangeMessageVisibilityBatchOutput(
      $metadata: ResponseMetadata,
      Failed: js.Array[UnmarshalledBatchResultErrorEntry],
      Successful: js.Array[UnmarshalledChangeMessageVisibilityBatchResultEntry]
    ): typings.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchOutputMod.ChangeMessageVisibilityBatchOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Failed = Failed.asInstanceOf[js.Any], Successful = Successful.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchOutputMod.ChangeMessageVisibilityBatchOutput]
    }
    
    @scala.inline
    def ChangeMessageVisibilityOutput($metadata: ResponseMetadata): typings.awsSdkClientSqsNode.typesChangeMessageVisibilityOutputMod.ChangeMessageVisibilityOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesChangeMessageVisibilityOutputMod.ChangeMessageVisibilityOutput]
    }
    
    @scala.inline
    def CreateQueueOutput($metadata: ResponseMetadata): typings.awsSdkClientSqsNode.typesCreateQueueOutputMod.CreateQueueOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesCreateQueueOutputMod.CreateQueueOutput]
    }
    
    @scala.inline
    def DeleteMessageBatchOutput(
      $metadata: ResponseMetadata,
      Failed: js.Array[UnmarshalledBatchResultErrorEntry],
      Successful: js.Array[UnmarshalledDeleteMessageBatchResultEntry]
    ): typings.awsSdkClientSqsNode.typesDeleteMessageBatchOutputMod.DeleteMessageBatchOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Failed = Failed.asInstanceOf[js.Any], Successful = Successful.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesDeleteMessageBatchOutputMod.DeleteMessageBatchOutput]
    }
    
    @scala.inline
    def DeleteMessageOutput($metadata: ResponseMetadata): typings.awsSdkClientSqsNode.typesDeleteMessageOutputMod.DeleteMessageOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesDeleteMessageOutputMod.DeleteMessageOutput]
    }
    
    @scala.inline
    def DeleteQueueOutput($metadata: ResponseMetadata): typings.awsSdkClientSqsNode.typesDeleteQueueOutputMod.DeleteQueueOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesDeleteQueueOutputMod.DeleteQueueOutput]
    }
    
    @scala.inline
    def GetQueueAttributesOutput($metadata: ResponseMetadata): typings.awsSdkClientSqsNode.typesGetQueueAttributesOutputMod.GetQueueAttributesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesGetQueueAttributesOutputMod.GetQueueAttributesOutput]
    }
    
    @scala.inline
    def GetQueueUrlOutput($metadata: ResponseMetadata): typings.awsSdkClientSqsNode.typesGetQueueUrlOutputMod.GetQueueUrlOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesGetQueueUrlOutputMod.GetQueueUrlOutput]
    }
    
    @scala.inline
    def ListDeadLetterSourceQueuesOutput($metadata: ResponseMetadata, queueUrls: js.Array[String]): typings.awsSdkClientSqsNode.typesListDeadLetterSourceQueuesOutputMod.ListDeadLetterSourceQueuesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], queueUrls = queueUrls.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesListDeadLetterSourceQueuesOutputMod.ListDeadLetterSourceQueuesOutput]
    }
    
    @scala.inline
    def ListQueueTagsOutput($metadata: ResponseMetadata): typings.awsSdkClientSqsNode.typesListQueueTagsOutputMod.ListQueueTagsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesListQueueTagsOutputMod.ListQueueTagsOutput]
    }
    
    @scala.inline
    def ListQueuesOutput($metadata: ResponseMetadata): typings.awsSdkClientSqsNode.typesListQueuesOutputMod.ListQueuesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesListQueuesOutputMod.ListQueuesOutput]
    }
    
    @scala.inline
    def PurgeQueueOutput($metadata: ResponseMetadata): typings.awsSdkClientSqsNode.typesPurgeQueueOutputMod.PurgeQueueOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesPurgeQueueOutputMod.PurgeQueueOutput]
    }
    
    @scala.inline
    def ReceiveMessageOutput($metadata: ResponseMetadata): typings.awsSdkClientSqsNode.typesReceiveMessageOutputMod.ReceiveMessageOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesReceiveMessageOutputMod.ReceiveMessageOutput]
    }
    
    @scala.inline
    def RemovePermissionOutput($metadata: ResponseMetadata): typings.awsSdkClientSqsNode.typesRemovePermissionOutputMod.RemovePermissionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesRemovePermissionOutputMod.RemovePermissionOutput]
    }
    
    @scala.inline
    def SendMessageBatchOutput(
      $metadata: ResponseMetadata,
      Failed: js.Array[UnmarshalledBatchResultErrorEntry],
      Successful: js.Array[UnmarshalledSendMessageBatchResultEntry]
    ): typings.awsSdkClientSqsNode.typesSendMessageBatchOutputMod.SendMessageBatchOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Failed = Failed.asInstanceOf[js.Any], Successful = Successful.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesSendMessageBatchOutputMod.SendMessageBatchOutput]
    }
    
    @scala.inline
    def SendMessageOutput($metadata: ResponseMetadata): typings.awsSdkClientSqsNode.typesSendMessageOutputMod.SendMessageOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesSendMessageOutputMod.SendMessageOutput]
    }
    
    @scala.inline
    def SetQueueAttributesOutput($metadata: ResponseMetadata): typings.awsSdkClientSqsNode.typesSetQueueAttributesOutputMod.SetQueueAttributesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesSetQueueAttributesOutputMod.SetQueueAttributesOutput]
    }
    
    @scala.inline
    def TagQueueOutput($metadata: ResponseMetadata): typings.awsSdkClientSqsNode.typesTagQueueOutputMod.TagQueueOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesTagQueueOutputMod.TagQueueOutput]
    }
    
    @scala.inline
    def UntagQueueOutput($metadata: ResponseMetadata): typings.awsSdkClientSqsNode.typesUntagQueueOutputMod.UntagQueueOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientSqsNode.typesUntagQueueOutputMod.UntagQueueOutput]
    }
  }
}
