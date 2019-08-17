package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsGetAdmChannelCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetAdmChannelInputMod.GetAdmChannelInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetAdmChannelOutputMod.GetAdmChannelOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetAdmChannelCommand", "GetAdmChannelCommand")
@js.native
class GetAdmChannelCommand protected () extends Command[
      InputTypesUnion, 
      GetAdmChannelInput, 
      OutputTypesUnion, 
      GetAdmChannelOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: GetAdmChannelInput) = this()
  /* CompleteClass */
  override val input: GetAdmChannelInput = js.native
  val middlewareStack: MiddlewareStack[GetAdmChannelInput, GetAdmChannelOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[GetAdmChannelInput, GetAdmChannelOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[GetAdmChannelInput, GetAdmChannelOutput] = js.native
}

