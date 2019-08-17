package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsDeleteEndpointCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteEndpointInputMod.DeleteEndpointInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteEndpointOutputMod.DeleteEndpointOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteEndpointCommand", "DeleteEndpointCommand")
@js.native
class DeleteEndpointCommand protected () extends Command[
      InputTypesUnion, 
      DeleteEndpointInput, 
      OutputTypesUnion, 
      DeleteEndpointOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: DeleteEndpointInput) = this()
  /* CompleteClass */
  override val input: DeleteEndpointInput = js.native
  val middlewareStack: MiddlewareStack[DeleteEndpointInput, DeleteEndpointOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[DeleteEndpointInput, DeleteEndpointOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[DeleteEndpointInput, DeleteEndpointOutput] = js.native
}

