package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsUpdateEndpointsBatchCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateEndpointsBatchInputMod.UpdateEndpointsBatchInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateEndpointsBatchOutputMod.UpdateEndpointsBatchOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateEndpointsBatchCommand", "UpdateEndpointsBatchCommand")
@js.native
class UpdateEndpointsBatchCommand protected () extends Command[
      InputTypesUnion, 
      UpdateEndpointsBatchInput, 
      OutputTypesUnion, 
      UpdateEndpointsBatchOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: UpdateEndpointsBatchInput) = this()
  /* CompleteClass */
  override val input: UpdateEndpointsBatchInput = js.native
  val middlewareStack: MiddlewareStack[UpdateEndpointsBatchInput, UpdateEndpointsBatchOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[UpdateEndpointsBatchInput, UpdateEndpointsBatchOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[UpdateEndpointsBatchInput, UpdateEndpointsBatchOutput] = js.native
}

