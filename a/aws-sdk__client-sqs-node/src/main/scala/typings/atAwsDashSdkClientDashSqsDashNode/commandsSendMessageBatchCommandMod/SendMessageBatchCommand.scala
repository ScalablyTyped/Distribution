package typings.atAwsDashSdkClientDashSqsDashNode.commandsSendMessageBatchCommandMod

import typings.atAwsDashSdkClientDashSqsDashNode.sQSConfigurationMod.SQSResolvedConfiguration
import typings.atAwsDashSdkClientDashSqsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesSendMessageBatchInputMod.SendMessageBatchInput
import typings.atAwsDashSdkClientDashSqsDashNode.typesSendMessageBatchOutputMod.SendMessageBatchOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/SendMessageBatchCommand", "SendMessageBatchCommand")
@js.native
class SendMessageBatchCommand protected () extends Command[
      InputTypesUnion, 
      SendMessageBatchInput, 
      OutputTypesUnion, 
      SendMessageBatchOutput, 
      SQSResolvedConfiguration, 
      Readable
    ] {
  def this(input: SendMessageBatchInput) = this()
  /* CompleteClass */
  override val input: SendMessageBatchInput = js.native
  val middlewareStack: MiddlewareStack[SendMessageBatchInput, SendMessageBatchOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: SQSResolvedConfiguration
  ): Handler[SendMessageBatchInput, SendMessageBatchOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: SQSResolvedConfiguration
  ): Handler[SendMessageBatchInput, SendMessageBatchOutput] = js.native
}

