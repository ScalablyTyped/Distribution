package typings.atAwsDashSdkClientDashSqsDashNode.commandsDeleteMessageBatchCommandMod

import typings.atAwsDashSdkClientDashSqsDashNode.sQSConfigurationMod.SQSResolvedConfiguration
import typings.atAwsDashSdkClientDashSqsDashNode.typesDeleteMessageBatchInputMod.DeleteMessageBatchInput
import typings.atAwsDashSdkClientDashSqsDashNode.typesDeleteMessageBatchOutputMod.DeleteMessageBatchOutput
import typings.atAwsDashSdkClientDashSqsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/DeleteMessageBatchCommand", "DeleteMessageBatchCommand")
@js.native
class DeleteMessageBatchCommand protected () extends Command[
      InputTypesUnion, 
      DeleteMessageBatchInput, 
      OutputTypesUnion, 
      DeleteMessageBatchOutput, 
      SQSResolvedConfiguration, 
      Readable
    ] {
  def this(input: DeleteMessageBatchInput) = this()
  /* CompleteClass */
  override val input: DeleteMessageBatchInput = js.native
  val middlewareStack: MiddlewareStack[DeleteMessageBatchInput, DeleteMessageBatchOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: SQSResolvedConfiguration
  ): Handler[DeleteMessageBatchInput, DeleteMessageBatchOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: SQSResolvedConfiguration
  ): Handler[DeleteMessageBatchInput, DeleteMessageBatchOutput] = js.native
}

