package typings.awsSdkClientSqs

import typings.awsSdkClientSqs.distTypesCommandsAddPermissionCommandMod.AddPermissionCommandInput
import typings.awsSdkClientSqs.distTypesCommandsAddPermissionCommandMod.AddPermissionCommandOutput
import typings.awsSdkClientSqs.distTypesCommandsChangeMessageVisibilityBatchCommandMod.ChangeMessageVisibilityBatchCommandInput
import typings.awsSdkClientSqs.distTypesCommandsChangeMessageVisibilityBatchCommandMod.ChangeMessageVisibilityBatchCommandOutput
import typings.awsSdkClientSqs.distTypesCommandsChangeMessageVisibilityCommandMod.ChangeMessageVisibilityCommandInput
import typings.awsSdkClientSqs.distTypesCommandsChangeMessageVisibilityCommandMod.ChangeMessageVisibilityCommandOutput
import typings.awsSdkClientSqs.distTypesCommandsCreateQueueCommandMod.CreateQueueCommandInput
import typings.awsSdkClientSqs.distTypesCommandsCreateQueueCommandMod.CreateQueueCommandOutput
import typings.awsSdkClientSqs.distTypesCommandsDeleteMessageBatchCommandMod.DeleteMessageBatchCommandInput
import typings.awsSdkClientSqs.distTypesCommandsDeleteMessageBatchCommandMod.DeleteMessageBatchCommandOutput
import typings.awsSdkClientSqs.distTypesCommandsDeleteMessageCommandMod.DeleteMessageCommandInput
import typings.awsSdkClientSqs.distTypesCommandsDeleteMessageCommandMod.DeleteMessageCommandOutput
import typings.awsSdkClientSqs.distTypesCommandsDeleteQueueCommandMod.DeleteQueueCommandInput
import typings.awsSdkClientSqs.distTypesCommandsDeleteQueueCommandMod.DeleteQueueCommandOutput
import typings.awsSdkClientSqs.distTypesCommandsGetQueueAttributesCommandMod.GetQueueAttributesCommandInput
import typings.awsSdkClientSqs.distTypesCommandsGetQueueAttributesCommandMod.GetQueueAttributesCommandOutput
import typings.awsSdkClientSqs.distTypesCommandsGetQueueUrlCommandMod.GetQueueUrlCommandInput
import typings.awsSdkClientSqs.distTypesCommandsGetQueueUrlCommandMod.GetQueueUrlCommandOutput
import typings.awsSdkClientSqs.distTypesCommandsListDeadLetterSourceQueuesCommandMod.ListDeadLetterSourceQueuesCommandInput
import typings.awsSdkClientSqs.distTypesCommandsListDeadLetterSourceQueuesCommandMod.ListDeadLetterSourceQueuesCommandOutput
import typings.awsSdkClientSqs.distTypesCommandsListQueueTagsCommandMod.ListQueueTagsCommandInput
import typings.awsSdkClientSqs.distTypesCommandsListQueueTagsCommandMod.ListQueueTagsCommandOutput
import typings.awsSdkClientSqs.distTypesCommandsListQueuesCommandMod.ListQueuesCommandInput
import typings.awsSdkClientSqs.distTypesCommandsListQueuesCommandMod.ListQueuesCommandOutput
import typings.awsSdkClientSqs.distTypesCommandsPurgeQueueCommandMod.PurgeQueueCommandInput
import typings.awsSdkClientSqs.distTypesCommandsPurgeQueueCommandMod.PurgeQueueCommandOutput
import typings.awsSdkClientSqs.distTypesCommandsReceiveMessageCommandMod.ReceiveMessageCommandInput
import typings.awsSdkClientSqs.distTypesCommandsReceiveMessageCommandMod.ReceiveMessageCommandOutput
import typings.awsSdkClientSqs.distTypesCommandsRemovePermissionCommandMod.RemovePermissionCommandInput
import typings.awsSdkClientSqs.distTypesCommandsRemovePermissionCommandMod.RemovePermissionCommandOutput
import typings.awsSdkClientSqs.distTypesCommandsSendMessageBatchCommandMod.SendMessageBatchCommandInput
import typings.awsSdkClientSqs.distTypesCommandsSendMessageBatchCommandMod.SendMessageBatchCommandOutput
import typings.awsSdkClientSqs.distTypesCommandsSendMessageCommandMod.SendMessageCommandInput
import typings.awsSdkClientSqs.distTypesCommandsSendMessageCommandMod.SendMessageCommandOutput
import typings.awsSdkClientSqs.distTypesCommandsSetQueueAttributesCommandMod.SetQueueAttributesCommandInput
import typings.awsSdkClientSqs.distTypesCommandsSetQueueAttributesCommandMod.SetQueueAttributesCommandOutput
import typings.awsSdkClientSqs.distTypesCommandsTagQueueCommandMod.TagQueueCommandInput
import typings.awsSdkClientSqs.distTypesCommandsTagQueueCommandMod.TagQueueCommandOutput
import typings.awsSdkClientSqs.distTypesCommandsUntagQueueCommandMod.UntagQueueCommandInput
import typings.awsSdkClientSqs.distTypesCommandsUntagQueueCommandMod.UntagQueueCommandOutput
import typings.awsSdkClientSqs.distTypesSqsclientMod.SQSClient
import typings.awsSdkClientSqs.distTypesSqsclientMod.SQSClientConfig
import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSqsMod {
  
  @JSImport("@aws-sdk/client-sqs/dist-types/SQS", "SQS")
  @js.native
  open class SQS protected () extends SQSClient {
    def this(configuration: SQSClientConfig) = this()
    
    /**
      * @see {@link AddPermissionCommand}
      */
    def addPermission(args: AddPermissionCommandInput): js.Promise[AddPermissionCommandOutput] = js.native
    def addPermission(
      args: AddPermissionCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[AddPermissionCommandOutput], Unit]
    ): Unit = js.native
    def addPermission(args: AddPermissionCommandInput, options: HttpHandlerOptions): js.Promise[AddPermissionCommandOutput] = js.native
    def addPermission(
      args: AddPermissionCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[AddPermissionCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * @see {@link ChangeMessageVisibilityCommand}
      */
    def changeMessageVisibility(args: ChangeMessageVisibilityCommandInput): js.Promise[ChangeMessageVisibilityCommandOutput] = js.native
    def changeMessageVisibility(
      args: ChangeMessageVisibilityCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[ChangeMessageVisibilityCommandOutput], Unit]
    ): Unit = js.native
    def changeMessageVisibility(args: ChangeMessageVisibilityCommandInput, options: HttpHandlerOptions): js.Promise[ChangeMessageVisibilityCommandOutput] = js.native
    def changeMessageVisibility(
      args: ChangeMessageVisibilityCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[ChangeMessageVisibilityCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * @see {@link ChangeMessageVisibilityBatchCommand}
      */
    def changeMessageVisibilityBatch(args: ChangeMessageVisibilityBatchCommandInput): js.Promise[ChangeMessageVisibilityBatchCommandOutput] = js.native
    def changeMessageVisibilityBatch(
      args: ChangeMessageVisibilityBatchCommandInput,
      cb: js.Function2[
          /* err */ Any, 
          /* data */ js.UndefOr[ChangeMessageVisibilityBatchCommandOutput], 
          Unit
        ]
    ): Unit = js.native
    def changeMessageVisibilityBatch(args: ChangeMessageVisibilityBatchCommandInput, options: HttpHandlerOptions): js.Promise[ChangeMessageVisibilityBatchCommandOutput] = js.native
    def changeMessageVisibilityBatch(
      args: ChangeMessageVisibilityBatchCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[
          /* err */ Any, 
          /* data */ js.UndefOr[ChangeMessageVisibilityBatchCommandOutput], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * @see {@link CreateQueueCommand}
      */
    def createQueue(args: CreateQueueCommandInput): js.Promise[CreateQueueCommandOutput] = js.native
    def createQueue(
      args: CreateQueueCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[CreateQueueCommandOutput], Unit]
    ): Unit = js.native
    def createQueue(args: CreateQueueCommandInput, options: HttpHandlerOptions): js.Promise[CreateQueueCommandOutput] = js.native
    def createQueue(
      args: CreateQueueCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[CreateQueueCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * @see {@link DeleteMessageCommand}
      */
    def deleteMessage(args: DeleteMessageCommandInput): js.Promise[DeleteMessageCommandOutput] = js.native
    def deleteMessage(
      args: DeleteMessageCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[DeleteMessageCommandOutput], Unit]
    ): Unit = js.native
    def deleteMessage(args: DeleteMessageCommandInput, options: HttpHandlerOptions): js.Promise[DeleteMessageCommandOutput] = js.native
    def deleteMessage(
      args: DeleteMessageCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[DeleteMessageCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * @see {@link DeleteMessageBatchCommand}
      */
    def deleteMessageBatch(args: DeleteMessageBatchCommandInput): js.Promise[DeleteMessageBatchCommandOutput] = js.native
    def deleteMessageBatch(
      args: DeleteMessageBatchCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[DeleteMessageBatchCommandOutput], Unit]
    ): Unit = js.native
    def deleteMessageBatch(args: DeleteMessageBatchCommandInput, options: HttpHandlerOptions): js.Promise[DeleteMessageBatchCommandOutput] = js.native
    def deleteMessageBatch(
      args: DeleteMessageBatchCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[DeleteMessageBatchCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * @see {@link DeleteQueueCommand}
      */
    def deleteQueue(args: DeleteQueueCommandInput): js.Promise[DeleteQueueCommandOutput] = js.native
    def deleteQueue(
      args: DeleteQueueCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[DeleteQueueCommandOutput], Unit]
    ): Unit = js.native
    def deleteQueue(args: DeleteQueueCommandInput, options: HttpHandlerOptions): js.Promise[DeleteQueueCommandOutput] = js.native
    def deleteQueue(
      args: DeleteQueueCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[DeleteQueueCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * @see {@link GetQueueAttributesCommand}
      */
    def getQueueAttributes(args: GetQueueAttributesCommandInput): js.Promise[GetQueueAttributesCommandOutput] = js.native
    def getQueueAttributes(
      args: GetQueueAttributesCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[GetQueueAttributesCommandOutput], Unit]
    ): Unit = js.native
    def getQueueAttributes(args: GetQueueAttributesCommandInput, options: HttpHandlerOptions): js.Promise[GetQueueAttributesCommandOutput] = js.native
    def getQueueAttributes(
      args: GetQueueAttributesCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[GetQueueAttributesCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * @see {@link GetQueueUrlCommand}
      */
    def getQueueUrl(args: GetQueueUrlCommandInput): js.Promise[GetQueueUrlCommandOutput] = js.native
    def getQueueUrl(
      args: GetQueueUrlCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[GetQueueUrlCommandOutput], Unit]
    ): Unit = js.native
    def getQueueUrl(args: GetQueueUrlCommandInput, options: HttpHandlerOptions): js.Promise[GetQueueUrlCommandOutput] = js.native
    def getQueueUrl(
      args: GetQueueUrlCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[GetQueueUrlCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * @see {@link ListDeadLetterSourceQueuesCommand}
      */
    def listDeadLetterSourceQueues(args: ListDeadLetterSourceQueuesCommandInput): js.Promise[ListDeadLetterSourceQueuesCommandOutput] = js.native
    def listDeadLetterSourceQueues(
      args: ListDeadLetterSourceQueuesCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[ListDeadLetterSourceQueuesCommandOutput], Unit]
    ): Unit = js.native
    def listDeadLetterSourceQueues(args: ListDeadLetterSourceQueuesCommandInput, options: HttpHandlerOptions): js.Promise[ListDeadLetterSourceQueuesCommandOutput] = js.native
    def listDeadLetterSourceQueues(
      args: ListDeadLetterSourceQueuesCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[ListDeadLetterSourceQueuesCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * @see {@link ListQueueTagsCommand}
      */
    def listQueueTags(args: ListQueueTagsCommandInput): js.Promise[ListQueueTagsCommandOutput] = js.native
    def listQueueTags(
      args: ListQueueTagsCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[ListQueueTagsCommandOutput], Unit]
    ): Unit = js.native
    def listQueueTags(args: ListQueueTagsCommandInput, options: HttpHandlerOptions): js.Promise[ListQueueTagsCommandOutput] = js.native
    def listQueueTags(
      args: ListQueueTagsCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[ListQueueTagsCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * @see {@link ListQueuesCommand}
      */
    def listQueues(args: ListQueuesCommandInput): js.Promise[ListQueuesCommandOutput] = js.native
    def listQueues(
      args: ListQueuesCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[ListQueuesCommandOutput], Unit]
    ): Unit = js.native
    def listQueues(args: ListQueuesCommandInput, options: HttpHandlerOptions): js.Promise[ListQueuesCommandOutput] = js.native
    def listQueues(
      args: ListQueuesCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[ListQueuesCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * @see {@link PurgeQueueCommand}
      */
    def purgeQueue(args: PurgeQueueCommandInput): js.Promise[PurgeQueueCommandOutput] = js.native
    def purgeQueue(
      args: PurgeQueueCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[PurgeQueueCommandOutput], Unit]
    ): Unit = js.native
    def purgeQueue(args: PurgeQueueCommandInput, options: HttpHandlerOptions): js.Promise[PurgeQueueCommandOutput] = js.native
    def purgeQueue(
      args: PurgeQueueCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[PurgeQueueCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * @see {@link ReceiveMessageCommand}
      */
    def receiveMessage(args: ReceiveMessageCommandInput): js.Promise[ReceiveMessageCommandOutput] = js.native
    def receiveMessage(
      args: ReceiveMessageCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[ReceiveMessageCommandOutput], Unit]
    ): Unit = js.native
    def receiveMessage(args: ReceiveMessageCommandInput, options: HttpHandlerOptions): js.Promise[ReceiveMessageCommandOutput] = js.native
    def receiveMessage(
      args: ReceiveMessageCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[ReceiveMessageCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * @see {@link RemovePermissionCommand}
      */
    def removePermission(args: RemovePermissionCommandInput): js.Promise[RemovePermissionCommandOutput] = js.native
    def removePermission(
      args: RemovePermissionCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[RemovePermissionCommandOutput], Unit]
    ): Unit = js.native
    def removePermission(args: RemovePermissionCommandInput, options: HttpHandlerOptions): js.Promise[RemovePermissionCommandOutput] = js.native
    def removePermission(
      args: RemovePermissionCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[RemovePermissionCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * @see {@link SendMessageCommand}
      */
    def sendMessage(args: SendMessageCommandInput): js.Promise[SendMessageCommandOutput] = js.native
    def sendMessage(
      args: SendMessageCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[SendMessageCommandOutput], Unit]
    ): Unit = js.native
    def sendMessage(args: SendMessageCommandInput, options: HttpHandlerOptions): js.Promise[SendMessageCommandOutput] = js.native
    def sendMessage(
      args: SendMessageCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[SendMessageCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * @see {@link SendMessageBatchCommand}
      */
    def sendMessageBatch(args: SendMessageBatchCommandInput): js.Promise[SendMessageBatchCommandOutput] = js.native
    def sendMessageBatch(
      args: SendMessageBatchCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[SendMessageBatchCommandOutput], Unit]
    ): Unit = js.native
    def sendMessageBatch(args: SendMessageBatchCommandInput, options: HttpHandlerOptions): js.Promise[SendMessageBatchCommandOutput] = js.native
    def sendMessageBatch(
      args: SendMessageBatchCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[SendMessageBatchCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * @see {@link SetQueueAttributesCommand}
      */
    def setQueueAttributes(args: SetQueueAttributesCommandInput): js.Promise[SetQueueAttributesCommandOutput] = js.native
    def setQueueAttributes(
      args: SetQueueAttributesCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[SetQueueAttributesCommandOutput], Unit]
    ): Unit = js.native
    def setQueueAttributes(args: SetQueueAttributesCommandInput, options: HttpHandlerOptions): js.Promise[SetQueueAttributesCommandOutput] = js.native
    def setQueueAttributes(
      args: SetQueueAttributesCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[SetQueueAttributesCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * @see {@link TagQueueCommand}
      */
    def tagQueue(args: TagQueueCommandInput): js.Promise[TagQueueCommandOutput] = js.native
    def tagQueue(
      args: TagQueueCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[TagQueueCommandOutput], Unit]
    ): Unit = js.native
    def tagQueue(args: TagQueueCommandInput, options: HttpHandlerOptions): js.Promise[TagQueueCommandOutput] = js.native
    def tagQueue(
      args: TagQueueCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[TagQueueCommandOutput], Unit]
    ): Unit = js.native
    
    /**
      * @see {@link UntagQueueCommand}
      */
    def untagQueue(args: UntagQueueCommandInput): js.Promise[UntagQueueCommandOutput] = js.native
    def untagQueue(
      args: UntagQueueCommandInput,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[UntagQueueCommandOutput], Unit]
    ): Unit = js.native
    def untagQueue(args: UntagQueueCommandInput, options: HttpHandlerOptions): js.Promise[UntagQueueCommandOutput] = js.native
    def untagQueue(
      args: UntagQueueCommandInput,
      options: HttpHandlerOptions,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[UntagQueueCommandOutput], Unit]
    ): Unit = js.native
  }
}
