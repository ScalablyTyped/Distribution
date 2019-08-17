package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsGetChannelsCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetChannelsInputMod.GetChannelsInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetChannelsOutputMod.GetChannelsOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetChannelsCommand", "GetChannelsCommand")
@js.native
class GetChannelsCommand protected () extends Command[
      InputTypesUnion, 
      GetChannelsInput, 
      OutputTypesUnion, 
      GetChannelsOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: GetChannelsInput) = this()
  /* CompleteClass */
  override val input: GetChannelsInput = js.native
  val middlewareStack: MiddlewareStack[GetChannelsInput, GetChannelsOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[GetChannelsInput, GetChannelsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[GetChannelsInput, GetChannelsOutput] = js.native
}

