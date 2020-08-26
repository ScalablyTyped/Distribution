package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesPurgeQueueInputMod.PurgeQueueInput
import typings.awsSdkClientSqsNode.typesPurgeQueueOutputMod.PurgeQueueOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/PurgeQueueCommand", JSImport.Namespace)
@js.native
object purgeQueueCommandMod extends js.Object {
  @js.native
  class PurgeQueueCommand protected () extends Command[
          InputTypesUnion, 
          PurgeQueueInput, 
          OutputTypesUnion, 
          PurgeQueueOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: PurgeQueueInput) = this()
    val middlewareStack: MiddlewareStack[PurgeQueueInput, PurgeQueueOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[PurgeQueueInput, PurgeQueueOutput] = js.native
  }
  
}

