package typings.atAwsDashSdkClientDashSqsDashNode.commandsDeleteMessageCommandMod

import typings.atAwsDashSdkClientDashSqsDashNode.sQSConfigurationMod.SQSResolvedConfiguration
import typings.atAwsDashSdkClientDashSqsDashNode.typesDeleteMessageInputMod.DeleteMessageInput
import typings.atAwsDashSdkClientDashSqsDashNode.typesDeleteMessageOutputMod.DeleteMessageOutput
import typings.atAwsDashSdkClientDashSqsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/DeleteMessageCommand", "DeleteMessageCommand")
@js.native
class DeleteMessageCommand protected () extends Command[
      InputTypesUnion, 
      DeleteMessageInput, 
      OutputTypesUnion, 
      DeleteMessageOutput, 
      SQSResolvedConfiguration, 
      Readable
    ] {
  def this(input: DeleteMessageInput) = this()
  /* CompleteClass */
  override val input: DeleteMessageInput = js.native
  val middlewareStack: MiddlewareStack[DeleteMessageInput, DeleteMessageOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: SQSResolvedConfiguration
  ): Handler[DeleteMessageInput, DeleteMessageOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: SQSResolvedConfiguration
  ): Handler[DeleteMessageInput, DeleteMessageOutput] = js.native
}

