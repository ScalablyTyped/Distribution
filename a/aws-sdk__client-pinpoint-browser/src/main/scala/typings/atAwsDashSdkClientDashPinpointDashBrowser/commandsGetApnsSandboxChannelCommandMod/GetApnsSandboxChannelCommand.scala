package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsGetApnsSandboxChannelCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetApnsSandboxChannelInputMod.GetApnsSandboxChannelInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetApnsSandboxChannelOutputMod.GetApnsSandboxChannelOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetApnsSandboxChannelCommand", "GetApnsSandboxChannelCommand")
@js.native
class GetApnsSandboxChannelCommand protected () extends Command[
      InputTypesUnion, 
      GetApnsSandboxChannelInput, 
      OutputTypesUnion, 
      GetApnsSandboxChannelOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: GetApnsSandboxChannelInput) = this()
  /* CompleteClass */
  override val input: GetApnsSandboxChannelInput = js.native
  val middlewareStack: MiddlewareStack[GetApnsSandboxChannelInput, GetApnsSandboxChannelOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[GetApnsSandboxChannelInput, GetApnsSandboxChannelOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[GetApnsSandboxChannelInput, GetApnsSandboxChannelOutput] = js.native
}

