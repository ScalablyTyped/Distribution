package typings.atAwsDashSdkClientDashSqsDashNode.commandsSendMessageCommandMod

import typings.atAwsDashSdkClientDashSqsDashNode.sQSConfigurationMod.SQSResolvedConfiguration
import typings.atAwsDashSdkClientDashSqsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesSendMessageInputMod.SendMessageInput
import typings.atAwsDashSdkClientDashSqsDashNode.typesSendMessageOutputMod.SendMessageOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/SendMessageCommand", "SendMessageCommand")
@js.native
class SendMessageCommand protected () extends Command[
      InputTypesUnion, 
      SendMessageInput, 
      OutputTypesUnion, 
      SendMessageOutput, 
      SQSResolvedConfiguration, 
      Readable
    ] {
  def this(input: SendMessageInput) = this()
  /* CompleteClass */
  override val input: SendMessageInput = js.native
  val middlewareStack: MiddlewareStack[SendMessageInput, SendMessageOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: SQSResolvedConfiguration
  ): Handler[SendMessageInput, SendMessageOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: SQSResolvedConfiguration
  ): Handler[SendMessageInput, SendMessageOutput] = js.native
}

