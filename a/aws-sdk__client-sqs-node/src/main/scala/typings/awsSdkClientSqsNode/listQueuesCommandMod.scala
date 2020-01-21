package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesListQueuesInputMod.ListQueuesInput
import typings.awsSdkClientSqsNode.typesListQueuesOutputMod.ListQueuesOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/ListQueuesCommand", JSImport.Namespace)
@js.native
object listQueuesCommandMod extends js.Object {
  @js.native
  class ListQueuesCommand protected () extends Command[
          InputTypesUnion, 
          ListQueuesInput, 
          OutputTypesUnion, 
          ListQueuesOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListQueuesInput) = this()
    /* CompleteClass */
    override val input: ListQueuesInput = js.native
    val middlewareStack: MiddlewareStack[ListQueuesInput, ListQueuesOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[ListQueuesInput, ListQueuesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[ListQueuesInput, ListQueuesOutput] = js.native
  }
  
}

