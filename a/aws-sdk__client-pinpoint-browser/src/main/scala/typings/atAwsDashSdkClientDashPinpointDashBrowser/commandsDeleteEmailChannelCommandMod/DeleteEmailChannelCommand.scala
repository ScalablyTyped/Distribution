package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsDeleteEmailChannelCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteEmailChannelInputMod.DeleteEmailChannelInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteEmailChannelOutputMod.DeleteEmailChannelOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteEmailChannelCommand", "DeleteEmailChannelCommand")
@js.native
class DeleteEmailChannelCommand protected () extends Command[
      InputTypesUnion, 
      DeleteEmailChannelInput, 
      OutputTypesUnion, 
      DeleteEmailChannelOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: DeleteEmailChannelInput) = this()
  /* CompleteClass */
  override val input: DeleteEmailChannelInput = js.native
  val middlewareStack: MiddlewareStack[DeleteEmailChannelInput, DeleteEmailChannelOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[DeleteEmailChannelInput, DeleteEmailChannelOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[DeleteEmailChannelInput, DeleteEmailChannelOutput] = js.native
}

