package typings.atAwsDashSdkClientDashSqsDashNode.commandsReceiveMessageCommandMod

import typings.atAwsDashSdkClientDashSqsDashNode.sQSConfigurationMod.SQSResolvedConfiguration
import typings.atAwsDashSdkClientDashSqsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesReceiveMessageInputMod.ReceiveMessageInput
import typings.atAwsDashSdkClientDashSqsDashNode.typesReceiveMessageOutputMod.ReceiveMessageOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/ReceiveMessageCommand", "ReceiveMessageCommand")
@js.native
class ReceiveMessageCommand protected () extends Command[
      InputTypesUnion, 
      ReceiveMessageInput, 
      OutputTypesUnion, 
      ReceiveMessageOutput, 
      SQSResolvedConfiguration, 
      Readable
    ] {
  def this(input: ReceiveMessageInput) = this()
  /* CompleteClass */
  override val input: ReceiveMessageInput = js.native
  val middlewareStack: MiddlewareStack[ReceiveMessageInput, ReceiveMessageOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: SQSResolvedConfiguration
  ): Handler[ReceiveMessageInput, ReceiveMessageOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: SQSResolvedConfiguration
  ): Handler[ReceiveMessageInput, ReceiveMessageOutput] = js.native
}

