package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesSendMessageBatchInputMod.SendMessageBatchInput
import typings.awsSdkClientSqsNode.typesSendMessageBatchOutputMod.SendMessageBatchOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/SendMessageBatchCommand", JSImport.Namespace)
@js.native
object sendMessageBatchCommandMod extends js.Object {
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
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[SendMessageBatchInput, SendMessageBatchOutput] = js.native
  }
  
}

