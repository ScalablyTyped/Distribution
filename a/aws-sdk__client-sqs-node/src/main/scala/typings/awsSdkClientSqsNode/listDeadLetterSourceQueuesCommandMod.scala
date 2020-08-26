package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesListDeadLetterSourceQueuesInputMod.ListDeadLetterSourceQueuesInput
import typings.awsSdkClientSqsNode.typesListDeadLetterSourceQueuesOutputMod.ListDeadLetterSourceQueuesOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/ListDeadLetterSourceQueuesCommand", JSImport.Namespace)
@js.native
object listDeadLetterSourceQueuesCommandMod extends js.Object {
  @js.native
  class ListDeadLetterSourceQueuesCommand protected () extends Command[
          InputTypesUnion, 
          ListDeadLetterSourceQueuesInput, 
          OutputTypesUnion, 
          ListDeadLetterSourceQueuesOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListDeadLetterSourceQueuesInput) = this()
    val middlewareStack: MiddlewareStack[ListDeadLetterSourceQueuesInput, ListDeadLetterSourceQueuesOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[ListDeadLetterSourceQueuesInput, ListDeadLetterSourceQueuesOutput] = js.native
  }
  
}

