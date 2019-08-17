package typings.atAwsDashSdkClientDashSqsDashNode.commandsPurgeQueueCommandMod

import typings.atAwsDashSdkClientDashSqsDashNode.sQSConfigurationMod.SQSResolvedConfiguration
import typings.atAwsDashSdkClientDashSqsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesPurgeQueueInputMod.PurgeQueueInput
import typings.atAwsDashSdkClientDashSqsDashNode.typesPurgeQueueOutputMod.PurgeQueueOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/PurgeQueueCommand", "PurgeQueueCommand")
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
  /* CompleteClass */
  override val input: PurgeQueueInput = js.native
  val middlewareStack: MiddlewareStack[PurgeQueueInput, PurgeQueueOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: SQSResolvedConfiguration
  ): Handler[PurgeQueueInput, PurgeQueueOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: SQSResolvedConfiguration
  ): Handler[PurgeQueueInput, PurgeQueueOutput] = js.native
}

