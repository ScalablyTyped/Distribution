package typings.atAwsDashSdkClientDashSqsDashNode

import typings.atAwsDashSdkClientDashSqsDashNode.sQSConfigurationMod.SQSResolvedConfiguration
import typings.atAwsDashSdkClientDashSqsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesSetQueueAttributesInputMod.SetQueueAttributesInput
import typings.atAwsDashSdkClientDashSqsDashNode.typesSetQueueAttributesOutputMod.SetQueueAttributesOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/SetQueueAttributesCommand", JSImport.Namespace)
@js.native
object commandsSetQueueAttributesCommandMod extends js.Object {
  @js.native
  class SetQueueAttributesCommand protected () extends Command[
          InputTypesUnion, 
          SetQueueAttributesInput, 
          OutputTypesUnion, 
          SetQueueAttributesOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: SetQueueAttributesInput) = this()
    /* CompleteClass */
    override val input: SetQueueAttributesInput = js.native
    val middlewareStack: MiddlewareStack[SetQueueAttributesInput, SetQueueAttributesOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[SetQueueAttributesInput, SetQueueAttributesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[SetQueueAttributesInput, SetQueueAttributesOutput] = js.native
  }
  
}

