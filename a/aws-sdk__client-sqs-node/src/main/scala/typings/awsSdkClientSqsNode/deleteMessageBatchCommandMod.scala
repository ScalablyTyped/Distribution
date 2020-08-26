package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesDeleteMessageBatchInputMod.DeleteMessageBatchInput
import typings.awsSdkClientSqsNode.typesDeleteMessageBatchOutputMod.DeleteMessageBatchOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/DeleteMessageBatchCommand", JSImport.Namespace)
@js.native
object deleteMessageBatchCommandMod extends js.Object {
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
    val middlewareStack: MiddlewareStack[DeleteMessageBatchInput, DeleteMessageBatchOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[DeleteMessageBatchInput, DeleteMessageBatchOutput] = js.native
  }
  
}

