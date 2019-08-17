package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsGetExportJobsCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetExportJobsInputMod.GetExportJobsInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetExportJobsOutputMod.GetExportJobsOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetExportJobsCommand", "GetExportJobsCommand")
@js.native
class GetExportJobsCommand protected () extends Command[
      InputTypesUnion, 
      GetExportJobsInput, 
      OutputTypesUnion, 
      GetExportJobsOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: GetExportJobsInput) = this()
  /* CompleteClass */
  override val input: GetExportJobsInput = js.native
  val middlewareStack: MiddlewareStack[GetExportJobsInput, GetExportJobsOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[GetExportJobsInput, GetExportJobsOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[GetExportJobsInput, GetExportJobsOutput] = js.native
}

