package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesSendMessageInputMod.SendMessageInput
import typings.awsSdkClientSqsNode.typesSendMessageOutputMod.SendMessageOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/SendMessageCommand", JSImport.Namespace)
@js.native
object sendMessageCommandMod extends js.Object {
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
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[SendMessageInput, SendMessageOutput] = js.native
  }
  
}

