package typings.awsSdkClientSqsNode

import typings.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typings.awsSdkClientSqsNode.typesTagQueueInputMod.TagQueueInput
import typings.awsSdkClientSqsNode.typesTagQueueOutputMod.TagQueueOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/TagQueueCommand", JSImport.Namespace)
@js.native
object tagQueueCommandMod extends js.Object {
  @js.native
  class TagQueueCommand protected () extends Command[
          InputTypesUnion, 
          TagQueueInput, 
          OutputTypesUnion, 
          TagQueueOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: TagQueueInput) = this()
    /* CompleteClass */
    override val input: TagQueueInput = js.native
    val middlewareStack: MiddlewareStack[TagQueueInput, TagQueueOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[TagQueueInput, TagQueueOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[TagQueueInput, TagQueueOutput] = js.native
  }
  
}

