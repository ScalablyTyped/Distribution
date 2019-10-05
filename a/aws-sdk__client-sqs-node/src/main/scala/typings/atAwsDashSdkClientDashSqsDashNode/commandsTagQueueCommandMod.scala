package typings.atAwsDashSdkClientDashSqsDashNode

import typings.atAwsDashSdkClientDashSqsDashNode.sQSConfigurationMod.SQSResolvedConfiguration
import typings.atAwsDashSdkClientDashSqsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesTagQueueInputMod.TagQueueInput
import typings.atAwsDashSdkClientDashSqsDashNode.typesTagQueueOutputMod.TagQueueOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/TagQueueCommand", JSImport.Namespace)
@js.native
object commandsTagQueueCommandMod extends js.Object {
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
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[TagQueueInput, TagQueueOutput] = js.native
  }
  
}

