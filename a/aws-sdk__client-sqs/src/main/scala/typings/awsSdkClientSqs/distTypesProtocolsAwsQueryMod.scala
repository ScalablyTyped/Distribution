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
import typings.awsSdkProtocolHttp.mod.HttpRequest
import typings.awsSdkProtocolHttp.mod.HttpResponse
import typings.awsSdkTypes.distTypesSerdeMod.SerdeContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesProtocolsAwsQueryMod {
  
  @JSImport("@aws-sdk/client-sqs/dist-types/protocols/Aws_query", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deAddPermissionCommand(output: HttpResponse, context: SerdeContext): js.Promise[AddPermissionCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_AddPermissionCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AddPermissionCommandOutput]]
  
  inline def deChangeMessageVisibilityBatchCommand(output: HttpResponse, context: SerdeContext): js.Promise[ChangeMessageVisibilityBatchCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_ChangeMessageVisibilityBatchCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ChangeMessageVisibilityBatchCommandOutput]]
  
  inline def deChangeMessageVisibilityCommand(output: HttpResponse, context: SerdeContext): js.Promise[ChangeMessageVisibilityCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_ChangeMessageVisibilityCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ChangeMessageVisibilityCommandOutput]]
  
  inline def deCreateQueueCommand(output: HttpResponse, context: SerdeContext): js.Promise[CreateQueueCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_CreateQueueCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CreateQueueCommandOutput]]
  
  inline def deDeleteMessageBatchCommand(output: HttpResponse, context: SerdeContext): js.Promise[DeleteMessageBatchCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_DeleteMessageBatchCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DeleteMessageBatchCommandOutput]]
  
  inline def deDeleteMessageCommand(output: HttpResponse, context: SerdeContext): js.Promise[DeleteMessageCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_DeleteMessageCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DeleteMessageCommandOutput]]
  
  inline def deDeleteQueueCommand(output: HttpResponse, context: SerdeContext): js.Promise[DeleteQueueCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_DeleteQueueCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DeleteQueueCommandOutput]]
  
  inline def deGetQueueAttributesCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetQueueAttributesCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_GetQueueAttributesCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetQueueAttributesCommandOutput]]
  
  inline def deGetQueueUrlCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetQueueUrlCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_GetQueueUrlCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetQueueUrlCommandOutput]]
  
  inline def deListDeadLetterSourceQueuesCommand(output: HttpResponse, context: SerdeContext): js.Promise[ListDeadLetterSourceQueuesCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_ListDeadLetterSourceQueuesCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ListDeadLetterSourceQueuesCommandOutput]]
  
  inline def deListQueueTagsCommand(output: HttpResponse, context: SerdeContext): js.Promise[ListQueueTagsCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_ListQueueTagsCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ListQueueTagsCommandOutput]]
  
  inline def deListQueuesCommand(output: HttpResponse, context: SerdeContext): js.Promise[ListQueuesCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_ListQueuesCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ListQueuesCommandOutput]]
  
  inline def dePurgeQueueCommand(output: HttpResponse, context: SerdeContext): js.Promise[PurgeQueueCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_PurgeQueueCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PurgeQueueCommandOutput]]
  
  inline def deReceiveMessageCommand(output: HttpResponse, context: SerdeContext): js.Promise[ReceiveMessageCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_ReceiveMessageCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReceiveMessageCommandOutput]]
  
  inline def deRemovePermissionCommand(output: HttpResponse, context: SerdeContext): js.Promise[RemovePermissionCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_RemovePermissionCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RemovePermissionCommandOutput]]
  
  inline def deSendMessageBatchCommand(output: HttpResponse, context: SerdeContext): js.Promise[SendMessageBatchCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_SendMessageBatchCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SendMessageBatchCommandOutput]]
  
  inline def deSendMessageCommand(output: HttpResponse, context: SerdeContext): js.Promise[SendMessageCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_SendMessageCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SendMessageCommandOutput]]
  
  inline def deSetQueueAttributesCommand(output: HttpResponse, context: SerdeContext): js.Promise[SetQueueAttributesCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_SetQueueAttributesCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SetQueueAttributesCommandOutput]]
  
  inline def deTagQueueCommand(output: HttpResponse, context: SerdeContext): js.Promise[TagQueueCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_TagQueueCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TagQueueCommandOutput]]
  
  inline def deUntagQueueCommand(output: HttpResponse, context: SerdeContext): js.Promise[UntagQueueCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("de_UntagQueueCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UntagQueueCommandOutput]]
  
  inline def seAddPermissionCommand(input: AddPermissionCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_AddPermissionCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seChangeMessageVisibilityBatchCommand(input: ChangeMessageVisibilityBatchCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_ChangeMessageVisibilityBatchCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seChangeMessageVisibilityCommand(input: ChangeMessageVisibilityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_ChangeMessageVisibilityCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seCreateQueueCommand(input: CreateQueueCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_CreateQueueCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seDeleteMessageBatchCommand(input: DeleteMessageBatchCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_DeleteMessageBatchCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seDeleteMessageCommand(input: DeleteMessageCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_DeleteMessageCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seDeleteQueueCommand(input: DeleteQueueCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_DeleteQueueCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seGetQueueAttributesCommand(input: GetQueueAttributesCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_GetQueueAttributesCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seGetQueueUrlCommand(input: GetQueueUrlCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_GetQueueUrlCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seListDeadLetterSourceQueuesCommand(input: ListDeadLetterSourceQueuesCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_ListDeadLetterSourceQueuesCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seListQueueTagsCommand(input: ListQueueTagsCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_ListQueueTagsCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seListQueuesCommand(input: ListQueuesCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_ListQueuesCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def sePurgeQueueCommand(input: PurgeQueueCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_PurgeQueueCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seReceiveMessageCommand(input: ReceiveMessageCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_ReceiveMessageCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seRemovePermissionCommand(input: RemovePermissionCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_RemovePermissionCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seSendMessageBatchCommand(input: SendMessageBatchCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_SendMessageBatchCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seSendMessageCommand(input: SendMessageCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_SendMessageCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seSetQueueAttributesCommand(input: SetQueueAttributesCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_SetQueueAttributesCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seTagQueueCommand(input: TagQueueCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_TagQueueCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def seUntagQueueCommand(input: UntagQueueCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("se_UntagQueueCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
}
