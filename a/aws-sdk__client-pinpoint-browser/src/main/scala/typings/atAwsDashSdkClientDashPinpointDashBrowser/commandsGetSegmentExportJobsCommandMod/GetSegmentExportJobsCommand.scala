package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsGetSegmentExportJobsCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetSegmentExportJobsInputMod.GetSegmentExportJobsInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetSegmentExportJobsOutputMod.GetSegmentExportJobsOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetSegmentExportJobsCommand", "GetSegmentExportJobsCommand")
@js.native
class GetSegmentExportJobsCommand protected () extends Command[
      InputTypesUnion, 
      GetSegmentExportJobsInput, 
      OutputTypesUnion, 
      GetSegmentExportJobsOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: GetSegmentExportJobsInput) = this()
  /* CompleteClass */
  override val input: GetSegmentExportJobsInput = js.native
  val middlewareStack: MiddlewareStack[GetSegmentExportJobsInput, GetSegmentExportJobsOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[GetSegmentExportJobsInput, GetSegmentExportJobsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[GetSegmentExportJobsInput, GetSegmentExportJobsOutput] = js.native
}

