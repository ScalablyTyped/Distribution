package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsGetSegmentsCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetSegmentsInputMod.GetSegmentsInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetSegmentsOutputMod.GetSegmentsOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetSegmentsCommand", "GetSegmentsCommand")
@js.native
class GetSegmentsCommand protected () extends Command[
      InputTypesUnion, 
      GetSegmentsInput, 
      OutputTypesUnion, 
      GetSegmentsOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: GetSegmentsInput) = this()
  /* CompleteClass */
  override val input: GetSegmentsInput = js.native
  val middlewareStack: MiddlewareStack[GetSegmentsInput, GetSegmentsOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[GetSegmentsInput, GetSegmentsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[GetSegmentsInput, GetSegmentsOutput] = js.native
}

