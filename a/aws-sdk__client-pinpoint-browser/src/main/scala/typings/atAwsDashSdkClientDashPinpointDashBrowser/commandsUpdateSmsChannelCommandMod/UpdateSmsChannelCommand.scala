package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsUpdateSmsChannelCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateSmsChannelInputMod.UpdateSmsChannelInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateSmsChannelOutputMod.UpdateSmsChannelOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateSmsChannelCommand", "UpdateSmsChannelCommand")
@js.native
class UpdateSmsChannelCommand protected () extends Command[
      InputTypesUnion, 
      UpdateSmsChannelInput, 
      OutputTypesUnion, 
      UpdateSmsChannelOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: UpdateSmsChannelInput) = this()
  /* CompleteClass */
  override val input: UpdateSmsChannelInput = js.native
  val middlewareStack: MiddlewareStack[UpdateSmsChannelInput, UpdateSmsChannelOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[UpdateSmsChannelInput, UpdateSmsChannelOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[UpdateSmsChannelInput, UpdateSmsChannelOutput] = js.native
}

