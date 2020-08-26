package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchInputMod.ChangeMessageVisibilityBatchInput
import typings.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchOutputMod.ChangeMessageVisibilityBatchOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/ChangeMessageVisibilityBatchCommand", JSImport.Namespace)
@js.native
object changeMessageVisibilityBatchCommandMod extends js.Object {
  @js.native
  class ChangeMessageVisibilityBatchCommand protected () extends Command[
          InputTypesUnion, 
          ChangeMessageVisibilityBatchInput, 
          OutputTypesUnion, 
          ChangeMessageVisibilityBatchOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: ChangeMessageVisibilityBatchInput) = this()
    val middlewareStack: MiddlewareStack[ChangeMessageVisibilityBatchInput, ChangeMessageVisibilityBatchOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[ChangeMessageVisibilityBatchInput, ChangeMessageVisibilityBatchOutput] = js.native
  }
  
}

