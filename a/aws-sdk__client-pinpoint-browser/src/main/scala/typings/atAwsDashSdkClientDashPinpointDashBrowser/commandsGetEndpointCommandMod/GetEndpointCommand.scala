package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsGetEndpointCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetEndpointInputMod.GetEndpointInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetEndpointOutputMod.GetEndpointOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetEndpointCommand", "GetEndpointCommand")
@js.native
class GetEndpointCommand protected () extends Command[
      InputTypesUnion, 
      GetEndpointInput, 
      OutputTypesUnion, 
      GetEndpointOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: GetEndpointInput) = this()
  /* CompleteClass */
  override val input: GetEndpointInput = js.native
  val middlewareStack: MiddlewareStack[GetEndpointInput, GetEndpointOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[GetEndpointInput, GetEndpointOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[GetEndpointInput, GetEndpointOutput] = js.native
}

