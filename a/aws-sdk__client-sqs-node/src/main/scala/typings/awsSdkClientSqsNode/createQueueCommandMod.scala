package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesCreateQueueInputMod.CreateQueueInput
import typings.awsSdkClientSqsNode.typesCreateQueueOutputMod.CreateQueueOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/CreateQueueCommand", JSImport.Namespace)
@js.native
object createQueueCommandMod extends js.Object {
  @js.native
  class CreateQueueCommand protected () extends Command[
          InputTypesUnion, 
          CreateQueueInput, 
          OutputTypesUnion, 
          CreateQueueOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: CreateQueueInput) = this()
    val middlewareStack: MiddlewareStack[CreateQueueInput, CreateQueueOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[CreateQueueInput, CreateQueueOutput] = js.native
  }
  
}

