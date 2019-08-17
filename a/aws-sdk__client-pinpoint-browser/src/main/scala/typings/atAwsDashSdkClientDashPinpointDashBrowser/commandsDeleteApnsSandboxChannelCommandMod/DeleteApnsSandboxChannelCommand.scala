package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsDeleteApnsSandboxChannelCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteApnsSandboxChannelInputMod.DeleteApnsSandboxChannelInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteApnsSandboxChannelOutputMod.DeleteApnsSandboxChannelOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteApnsSandboxChannelCommand", "DeleteApnsSandboxChannelCommand")
@js.native
class DeleteApnsSandboxChannelCommand protected () extends Command[
      InputTypesUnion, 
      DeleteApnsSandboxChannelInput, 
      OutputTypesUnion, 
      DeleteApnsSandboxChannelOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: DeleteApnsSandboxChannelInput) = this()
  /* CompleteClass */
  override val input: DeleteApnsSandboxChannelInput = js.native
  val middlewareStack: MiddlewareStack[DeleteApnsSandboxChannelInput, DeleteApnsSandboxChannelOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[DeleteApnsSandboxChannelInput, DeleteApnsSandboxChannelOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[DeleteApnsSandboxChannelInput, DeleteApnsSandboxChannelOutput] = js.native
}

