package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsGetApnsVoipChannelCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetApnsVoipChannelInputMod.GetApnsVoipChannelInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetApnsVoipChannelOutputMod.GetApnsVoipChannelOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetApnsVoipChannelCommand", "GetApnsVoipChannelCommand")
@js.native
class GetApnsVoipChannelCommand protected () extends Command[
      InputTypesUnion, 
      GetApnsVoipChannelInput, 
      OutputTypesUnion, 
      GetApnsVoipChannelOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: GetApnsVoipChannelInput) = this()
  /* CompleteClass */
  override val input: GetApnsVoipChannelInput = js.native
  val middlewareStack: MiddlewareStack[GetApnsVoipChannelInput, GetApnsVoipChannelOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[GetApnsVoipChannelInput, GetApnsVoipChannelOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[GetApnsVoipChannelInput, GetApnsVoipChannelOutput] = js.native
}

