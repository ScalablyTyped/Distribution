package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsDeleteSegmentCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteSegmentInputMod.DeleteSegmentInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteSegmentOutputMod.DeleteSegmentOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteSegmentCommand", "DeleteSegmentCommand")
@js.native
class DeleteSegmentCommand protected () extends Command[
      InputTypesUnion, 
      DeleteSegmentInput, 
      OutputTypesUnion, 
      DeleteSegmentOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: DeleteSegmentInput) = this()
  /* CompleteClass */
  override val input: DeleteSegmentInput = js.native
  val middlewareStack: MiddlewareStack[DeleteSegmentInput, DeleteSegmentOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[DeleteSegmentInput, DeleteSegmentOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[DeleteSegmentInput, DeleteSegmentOutput] = js.native
}

