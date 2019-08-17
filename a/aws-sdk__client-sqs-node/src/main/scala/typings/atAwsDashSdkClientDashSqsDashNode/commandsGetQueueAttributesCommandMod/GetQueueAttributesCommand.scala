package typings.atAwsDashSdkClientDashSqsDashNode.commandsGetQueueAttributesCommandMod

import typings.atAwsDashSdkClientDashSqsDashNode.sQSConfigurationMod.SQSResolvedConfiguration
import typings.atAwsDashSdkClientDashSqsDashNode.typesGetQueueAttributesInputMod.GetQueueAttributesInput
import typings.atAwsDashSdkClientDashSqsDashNode.typesGetQueueAttributesOutputMod.GetQueueAttributesOutput
import typings.atAwsDashSdkClientDashSqsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/GetQueueAttributesCommand", "GetQueueAttributesCommand")
@js.native
class GetQueueAttributesCommand protected () extends Command[
      InputTypesUnion, 
      GetQueueAttributesInput, 
      OutputTypesUnion, 
      GetQueueAttributesOutput, 
      SQSResolvedConfiguration, 
      Readable
    ] {
  def this(input: GetQueueAttributesInput) = this()
  /* CompleteClass */
  override val input: GetQueueAttributesInput = js.native
  val middlewareStack: MiddlewareStack[GetQueueAttributesInput, GetQueueAttributesOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: SQSResolvedConfiguration
  ): Handler[GetQueueAttributesInput, GetQueueAttributesOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: SQSResolvedConfiguration
  ): Handler[GetQueueAttributesInput, GetQueueAttributesOutput] = js.native
}

