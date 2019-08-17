package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsDeleteApnsVoipSandboxChannelCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteApnsVoipSandboxChannelInputMod.DeleteApnsVoipSandboxChannelInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteApnsVoipSandboxChannelOutputMod.DeleteApnsVoipSandboxChannelOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteApnsVoipSandboxChannelCommand", "DeleteApnsVoipSandboxChannelCommand")
@js.native
class DeleteApnsVoipSandboxChannelCommand protected () extends Command[
      InputTypesUnion, 
      DeleteApnsVoipSandboxChannelInput, 
      OutputTypesUnion, 
      DeleteApnsVoipSandboxChannelOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: DeleteApnsVoipSandboxChannelInput) = this()
  /* CompleteClass */
  override val input: DeleteApnsVoipSandboxChannelInput = js.native
  val middlewareStack: MiddlewareStack[DeleteApnsVoipSandboxChannelInput, DeleteApnsVoipSandboxChannelOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[DeleteApnsVoipSandboxChannelInput, DeleteApnsVoipSandboxChannelOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[DeleteApnsVoipSandboxChannelInput, DeleteApnsVoipSandboxChannelOutput] = js.native
}

