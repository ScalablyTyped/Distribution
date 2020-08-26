package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesUntagQueueInputMod.UntagQueueInput
import typings.awsSdkClientSqsNode.typesUntagQueueOutputMod.UntagQueueOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/UntagQueueCommand", JSImport.Namespace)
@js.native
object untagQueueCommandMod extends js.Object {
  @js.native
  class UntagQueueCommand protected () extends Command[
          InputTypesUnion, 
          UntagQueueInput, 
          OutputTypesUnion, 
          UntagQueueOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: UntagQueueInput) = this()
    val middlewareStack: MiddlewareStack[UntagQueueInput, UntagQueueOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[UntagQueueInput, UntagQueueOutput] = js.native
  }
  
}

