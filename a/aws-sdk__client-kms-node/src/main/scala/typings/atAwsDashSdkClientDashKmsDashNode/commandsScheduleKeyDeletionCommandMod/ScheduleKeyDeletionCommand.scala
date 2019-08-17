package typings.atAwsDashSdkClientDashKmsDashNode.commandsScheduleKeyDeletionCommandMod

import typings.atAwsDashSdkClientDashKmsDashNode.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesScheduleKeyDeletionInputMod.ScheduleKeyDeletionInput
import typings.atAwsDashSdkClientDashKmsDashNode.typesScheduleKeyDeletionOutputMod.ScheduleKeyDeletionOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/ScheduleKeyDeletionCommand", "ScheduleKeyDeletionCommand")
@js.native
class ScheduleKeyDeletionCommand protected () extends Command[
      InputTypesUnion, 
      ScheduleKeyDeletionInput, 
      OutputTypesUnion, 
      ScheduleKeyDeletionOutput, 
      KMSResolvedConfiguration, 
      Readable
    ] {
  def this(input: ScheduleKeyDeletionInput) = this()
  /* CompleteClass */
  override val input: ScheduleKeyDeletionInput = js.native
  val middlewareStack: MiddlewareStack[ScheduleKeyDeletionInput, ScheduleKeyDeletionOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: KMSResolvedConfiguration
  ): Handler[ScheduleKeyDeletionInput, ScheduleKeyDeletionOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: KMSResolvedConfiguration
  ): Handler[ScheduleKeyDeletionInput, ScheduleKeyDeletionOutput] = js.native
}

