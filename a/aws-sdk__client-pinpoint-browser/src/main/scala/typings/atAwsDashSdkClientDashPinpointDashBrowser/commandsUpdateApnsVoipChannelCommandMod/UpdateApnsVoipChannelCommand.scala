package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsUpdateApnsVoipChannelCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateApnsVoipChannelInputMod.UpdateApnsVoipChannelInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateApnsVoipChannelOutputMod.UpdateApnsVoipChannelOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateApnsVoipChannelCommand", "UpdateApnsVoipChannelCommand")
@js.native
class UpdateApnsVoipChannelCommand protected () extends Command[
      InputTypesUnion, 
      UpdateApnsVoipChannelInput, 
      OutputTypesUnion, 
      UpdateApnsVoipChannelOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: UpdateApnsVoipChannelInput) = this()
  /* CompleteClass */
  override val input: UpdateApnsVoipChannelInput = js.native
  val middlewareStack: MiddlewareStack[UpdateApnsVoipChannelInput, UpdateApnsVoipChannelOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[UpdateApnsVoipChannelInput, UpdateApnsVoipChannelOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[UpdateApnsVoipChannelInput, UpdateApnsVoipChannelOutput] = js.native
}

