package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsUpdateGcmChannelCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateGcmChannelInputMod.UpdateGcmChannelInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateGcmChannelOutputMod.UpdateGcmChannelOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateGcmChannelCommand", "UpdateGcmChannelCommand")
@js.native
class UpdateGcmChannelCommand protected () extends Command[
      InputTypesUnion, 
      UpdateGcmChannelInput, 
      OutputTypesUnion, 
      UpdateGcmChannelOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: UpdateGcmChannelInput) = this()
  /* CompleteClass */
  override val input: UpdateGcmChannelInput = js.native
  val middlewareStack: MiddlewareStack[UpdateGcmChannelInput, UpdateGcmChannelOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[UpdateGcmChannelInput, UpdateGcmChannelOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[UpdateGcmChannelInput, UpdateGcmChannelOutput] = js.native
}

