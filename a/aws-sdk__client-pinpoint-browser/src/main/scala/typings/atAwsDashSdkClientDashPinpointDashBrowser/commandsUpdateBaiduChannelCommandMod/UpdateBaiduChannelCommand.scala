package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsUpdateBaiduChannelCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateBaiduChannelInputMod.UpdateBaiduChannelInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateBaiduChannelOutputMod.UpdateBaiduChannelOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateBaiduChannelCommand", "UpdateBaiduChannelCommand")
@js.native
class UpdateBaiduChannelCommand protected () extends Command[
      InputTypesUnion, 
      UpdateBaiduChannelInput, 
      OutputTypesUnion, 
      UpdateBaiduChannelOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: UpdateBaiduChannelInput) = this()
  /* CompleteClass */
  override val input: UpdateBaiduChannelInput = js.native
  val middlewareStack: MiddlewareStack[UpdateBaiduChannelInput, UpdateBaiduChannelOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[UpdateBaiduChannelInput, UpdateBaiduChannelOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[UpdateBaiduChannelInput, UpdateBaiduChannelOutput] = js.native
}

