package typings.atAwsDashSdkClientDashKmsDashBrowser.commandsDisableKeyRotationCommandMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesDisableKeyRotationInputMod.DisableKeyRotationInput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesDisableKeyRotationOutputMod.DisableKeyRotationOutput
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/DisableKeyRotationCommand", "DisableKeyRotationCommand")
@js.native
class DisableKeyRotationCommand protected () extends Command[
      InputTypesUnion, 
      DisableKeyRotationInput, 
      OutputTypesUnion, 
      DisableKeyRotationOutput, 
      KMSResolvedConfiguration, 
      Blob
    ] {
  def this(input: DisableKeyRotationInput) = this()
  /* CompleteClass */
  override val input: DisableKeyRotationInput = js.native
  val middlewareStack: MiddlewareStack[DisableKeyRotationInput, DisableKeyRotationOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KMSResolvedConfiguration
  ): Handler[DisableKeyRotationInput, DisableKeyRotationOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: KMSResolvedConfiguration
  ): Handler[DisableKeyRotationInput, DisableKeyRotationOutput] = js.native
}

