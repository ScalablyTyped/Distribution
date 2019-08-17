package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsDeleteBaiduChannelCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteBaiduChannelInputMod.DeleteBaiduChannelInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteBaiduChannelOutputMod.DeleteBaiduChannelOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteBaiduChannelCommand", "DeleteBaiduChannelCommand")
@js.native
class DeleteBaiduChannelCommand protected () extends Command[
      InputTypesUnion, 
      DeleteBaiduChannelInput, 
      OutputTypesUnion, 
      DeleteBaiduChannelOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: DeleteBaiduChannelInput) = this()
  /* CompleteClass */
  override val input: DeleteBaiduChannelInput = js.native
  val middlewareStack: MiddlewareStack[DeleteBaiduChannelInput, DeleteBaiduChannelOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[DeleteBaiduChannelInput, DeleteBaiduChannelOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[DeleteBaiduChannelInput, DeleteBaiduChannelOutput] = js.native
}

