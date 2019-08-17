package typings.atAwsDashSdkClientDashSqsDashNode.commandsUntagQueueCommandMod

import typings.atAwsDashSdkClientDashSqsDashNode.sQSConfigurationMod.SQSResolvedConfiguration
import typings.atAwsDashSdkClientDashSqsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesUntagQueueInputMod.UntagQueueInput
import typings.atAwsDashSdkClientDashSqsDashNode.typesUntagQueueOutputMod.UntagQueueOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/UntagQueueCommand", "UntagQueueCommand")
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
  /* CompleteClass */
  override val input: UntagQueueInput = js.native
  val middlewareStack: MiddlewareStack[UntagQueueInput, UntagQueueOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: SQSResolvedConfiguration
  ): Handler[UntagQueueInput, UntagQueueOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: SQSResolvedConfiguration
  ): Handler[UntagQueueInput, UntagQueueOutput] = js.native
}

