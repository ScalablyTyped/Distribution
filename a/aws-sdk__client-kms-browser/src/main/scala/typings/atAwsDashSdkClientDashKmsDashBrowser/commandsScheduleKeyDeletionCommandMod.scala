package typings.atAwsDashSdkClientDashKmsDashBrowser

import typings.atAwsDashSdkClientDashKmsDashBrowser.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesScheduleKeyDeletionInputMod.ScheduleKeyDeletionInput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesScheduleKeyDeletionOutputMod.ScheduleKeyDeletionOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/ScheduleKeyDeletionCommand", JSImport.Namespace)
@js.native
object commandsScheduleKeyDeletionCommandMod extends js.Object {
  @js.native
  class ScheduleKeyDeletionCommand protected () extends Command[
          InputTypesUnion, 
          ScheduleKeyDeletionInput, 
          OutputTypesUnion, 
          ScheduleKeyDeletionOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: ScheduleKeyDeletionInput) = this()
    /* CompleteClass */
    override val input: ScheduleKeyDeletionInput = js.native
    val middlewareStack: MiddlewareStack[ScheduleKeyDeletionInput, ScheduleKeyDeletionOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[ScheduleKeyDeletionInput, ScheduleKeyDeletionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[ScheduleKeyDeletionInput, ScheduleKeyDeletionOutput] = js.native
  }
  
}

