package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsGetSegmentVersionCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetSegmentVersionInputMod.GetSegmentVersionInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetSegmentVersionOutputMod.GetSegmentVersionOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetSegmentVersionCommand", "GetSegmentVersionCommand")
@js.native
class GetSegmentVersionCommand protected () extends Command[
      InputTypesUnion, 
      GetSegmentVersionInput, 
      OutputTypesUnion, 
      GetSegmentVersionOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: GetSegmentVersionInput) = this()
  /* CompleteClass */
  override val input: GetSegmentVersionInput = js.native
  val middlewareStack: MiddlewareStack[GetSegmentVersionInput, GetSegmentVersionOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[GetSegmentVersionInput, GetSegmentVersionOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[GetSegmentVersionInput, GetSegmentVersionOutput] = js.native
}

