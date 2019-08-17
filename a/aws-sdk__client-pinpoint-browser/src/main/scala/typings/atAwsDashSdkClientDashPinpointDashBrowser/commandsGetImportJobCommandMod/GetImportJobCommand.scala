package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsGetImportJobCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetImportJobInputMod.GetImportJobInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetImportJobOutputMod.GetImportJobOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetImportJobCommand", "GetImportJobCommand")
@js.native
class GetImportJobCommand protected () extends Command[
      InputTypesUnion, 
      GetImportJobInput, 
      OutputTypesUnion, 
      GetImportJobOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: GetImportJobInput) = this()
  /* CompleteClass */
  override val input: GetImportJobInput = js.native
  val middlewareStack: MiddlewareStack[GetImportJobInput, GetImportJobOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[GetImportJobInput, GetImportJobOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[GetImportJobInput, GetImportJobOutput] = js.native
}

