package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsGetUserEndpointsCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetUserEndpointsInputMod.GetUserEndpointsInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetUserEndpointsOutputMod.GetUserEndpointsOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetUserEndpointsCommand", "GetUserEndpointsCommand")
@js.native
class GetUserEndpointsCommand protected () extends Command[
      InputTypesUnion, 
      GetUserEndpointsInput, 
      OutputTypesUnion, 
      GetUserEndpointsOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: GetUserEndpointsInput) = this()
  /* CompleteClass */
  override val input: GetUserEndpointsInput = js.native
  val middlewareStack: MiddlewareStack[GetUserEndpointsInput, GetUserEndpointsOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[GetUserEndpointsInput, GetUserEndpointsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[GetUserEndpointsInput, GetUserEndpointsOutput] = js.native
}

