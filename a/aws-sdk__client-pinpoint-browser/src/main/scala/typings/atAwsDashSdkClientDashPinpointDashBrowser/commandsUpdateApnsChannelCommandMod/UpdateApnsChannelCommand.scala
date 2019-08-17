package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsUpdateApnsChannelCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateApnsChannelInputMod.UpdateApnsChannelInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateApnsChannelOutputMod.UpdateApnsChannelOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateApnsChannelCommand", "UpdateApnsChannelCommand")
@js.native
class UpdateApnsChannelCommand protected () extends Command[
      InputTypesUnion, 
      UpdateApnsChannelInput, 
      OutputTypesUnion, 
      UpdateApnsChannelOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: UpdateApnsChannelInput) = this()
  /* CompleteClass */
  override val input: UpdateApnsChannelInput = js.native
  val middlewareStack: MiddlewareStack[UpdateApnsChannelInput, UpdateApnsChannelOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[UpdateApnsChannelInput, UpdateApnsChannelOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[UpdateApnsChannelInput, UpdateApnsChannelOutput] = js.native
}

