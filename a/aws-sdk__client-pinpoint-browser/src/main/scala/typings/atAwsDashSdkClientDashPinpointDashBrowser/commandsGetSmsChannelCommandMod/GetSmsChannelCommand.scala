package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsGetSmsChannelCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetSmsChannelInputMod.GetSmsChannelInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetSmsChannelOutputMod.GetSmsChannelOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetSmsChannelCommand", "GetSmsChannelCommand")
@js.native
class GetSmsChannelCommand protected () extends Command[
      InputTypesUnion, 
      GetSmsChannelInput, 
      OutputTypesUnion, 
      GetSmsChannelOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: GetSmsChannelInput) = this()
  /* CompleteClass */
  override val input: GetSmsChannelInput = js.native
  val middlewareStack: MiddlewareStack[GetSmsChannelInput, GetSmsChannelOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[GetSmsChannelInput, GetSmsChannelOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[GetSmsChannelInput, GetSmsChannelOutput] = js.native
}

