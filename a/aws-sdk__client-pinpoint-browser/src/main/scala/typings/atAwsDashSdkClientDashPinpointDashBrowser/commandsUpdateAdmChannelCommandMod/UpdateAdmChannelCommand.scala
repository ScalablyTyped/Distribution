package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsUpdateAdmChannelCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateAdmChannelInputMod.UpdateAdmChannelInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateAdmChannelOutputMod.UpdateAdmChannelOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateAdmChannelCommand", "UpdateAdmChannelCommand")
@js.native
class UpdateAdmChannelCommand protected () extends Command[
      InputTypesUnion, 
      UpdateAdmChannelInput, 
      OutputTypesUnion, 
      UpdateAdmChannelOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: UpdateAdmChannelInput) = this()
  /* CompleteClass */
  override val input: UpdateAdmChannelInput = js.native
  val middlewareStack: MiddlewareStack[UpdateAdmChannelInput, UpdateAdmChannelOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[UpdateAdmChannelInput, UpdateAdmChannelOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[UpdateAdmChannelInput, UpdateAdmChannelOutput] = js.native
}

