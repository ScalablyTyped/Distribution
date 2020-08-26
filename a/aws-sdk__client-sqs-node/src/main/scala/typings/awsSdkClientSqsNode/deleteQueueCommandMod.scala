package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesDeleteQueueInputMod.DeleteQueueInput
import typings.awsSdkClientSqsNode.typesDeleteQueueOutputMod.DeleteQueueOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/DeleteQueueCommand", JSImport.Namespace)
@js.native
object deleteQueueCommandMod extends js.Object {
  @js.native
  class DeleteQueueCommand protected () extends Command[
          InputTypesUnion, 
          DeleteQueueInput, 
          OutputTypesUnion, 
          DeleteQueueOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteQueueInput) = this()
    val middlewareStack: MiddlewareStack[DeleteQueueInput, DeleteQueueOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[DeleteQueueInput, DeleteQueueOutput] = js.native
  }
  
}

