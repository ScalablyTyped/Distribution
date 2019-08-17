package typings.atAwsDashSdkClientDashKmsDashBrowser.commandsCancelKeyDeletionCommandMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesCancelKeyDeletionInputMod.CancelKeyDeletionInput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesCancelKeyDeletionOutputMod.CancelKeyDeletionOutput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/CancelKeyDeletionCommand", "CancelKeyDeletionCommand")
@js.native
class CancelKeyDeletionCommand protected () extends Command[
      InputTypesUnion, 
      CancelKeyDeletionInput, 
      OutputTypesUnion, 
      CancelKeyDeletionOutput, 
      KMSResolvedConfiguration, 
      Blob
    ] {
  def this(input: CancelKeyDeletionInput) = this()
  /* CompleteClass */
  override val input: CancelKeyDeletionInput = js.native
  val middlewareStack: MiddlewareStack[CancelKeyDeletionInput, CancelKeyDeletionOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KMSResolvedConfiguration
  ): Handler[CancelKeyDeletionInput, CancelKeyDeletionOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KMSResolvedConfiguration
  ): Handler[CancelKeyDeletionInput, CancelKeyDeletionOutput] = js.native
}

