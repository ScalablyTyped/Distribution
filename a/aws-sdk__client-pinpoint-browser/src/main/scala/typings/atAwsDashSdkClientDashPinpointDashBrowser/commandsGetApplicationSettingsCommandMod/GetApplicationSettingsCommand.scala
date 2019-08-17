package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsGetApplicationSettingsCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetApplicationSettingsInputMod.GetApplicationSettingsInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetApplicationSettingsOutputMod.GetApplicationSettingsOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetApplicationSettingsCommand", "GetApplicationSettingsCommand")
@js.native
class GetApplicationSettingsCommand protected () extends Command[
      InputTypesUnion, 
      GetApplicationSettingsInput, 
      OutputTypesUnion, 
      GetApplicationSettingsOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: GetApplicationSettingsInput) = this()
  /* CompleteClass */
  override val input: GetApplicationSettingsInput = js.native
  val middlewareStack: MiddlewareStack[GetApplicationSettingsInput, GetApplicationSettingsOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[GetApplicationSettingsInput, GetApplicationSettingsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[GetApplicationSettingsInput, GetApplicationSettingsOutput] = js.native
}

