package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsUpdateEndpointCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateEndpointInputMod.UpdateEndpointInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateEndpointOutputMod.UpdateEndpointOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateEndpointCommand", "UpdateEndpointCommand")
@js.native
class UpdateEndpointCommand protected () extends Command[
      InputTypesUnion, 
      UpdateEndpointInput, 
      OutputTypesUnion, 
      UpdateEndpointOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: UpdateEndpointInput) = this()
  /* CompleteClass */
  override val input: UpdateEndpointInput = js.native
  val middlewareStack: MiddlewareStack[UpdateEndpointInput, UpdateEndpointOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[UpdateEndpointInput, UpdateEndpointOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[UpdateEndpointInput, UpdateEndpointOutput] = js.native
}

