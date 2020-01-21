package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesReceiveMessageInputMod.ReceiveMessageInput
import typings.awsSdkClientSqsNode.typesReceiveMessageOutputMod.ReceiveMessageOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/ReceiveMessageCommand", JSImport.Namespace)
@js.native
object receiveMessageCommandMod extends js.Object {
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
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[ReceiveMessageInput, ReceiveMessageOutput] = js.native
  }
  
}

