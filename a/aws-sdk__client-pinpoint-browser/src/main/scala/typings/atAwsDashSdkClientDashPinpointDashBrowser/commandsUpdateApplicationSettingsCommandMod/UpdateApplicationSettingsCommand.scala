package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsUpdateApplicationSettingsCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateApplicationSettingsInputMod.UpdateApplicationSettingsInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateApplicationSettingsOutputMod.UpdateApplicationSettingsOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateApplicationSettingsCommand", "UpdateApplicationSettingsCommand")
@js.native
class UpdateApplicationSettingsCommand protected () extends Command[
      InputTypesUnion, 
      UpdateApplicationSettingsInput, 
      OutputTypesUnion, 
      UpdateApplicationSettingsOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: UpdateApplicationSettingsInput) = this()
  /* CompleteClass */
  override val input: UpdateApplicationSettingsInput = js.native
  val middlewareStack: MiddlewareStack[UpdateApplicationSettingsInput, UpdateApplicationSettingsOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[UpdateApplicationSettingsInput, UpdateApplicationSettingsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[UpdateApplicationSettingsInput, UpdateApplicationSettingsOutput] = js.native
}

