package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsCreateImportJobCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesCreateImportJobInputMod.CreateImportJobInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesCreateImportJobOutputMod.CreateImportJobOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/CreateImportJobCommand", "CreateImportJobCommand")
@js.native
class CreateImportJobCommand protected () extends Command[
      InputTypesUnion, 
      CreateImportJobInput, 
      OutputTypesUnion, 
      CreateImportJobOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: CreateImportJobInput) = this()
  /* CompleteClass */
  override val input: CreateImportJobInput = js.native
  val middlewareStack: MiddlewareStack[CreateImportJobInput, CreateImportJobOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[CreateImportJobInput, CreateImportJobOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[CreateImportJobInput, CreateImportJobOutput] = js.native
}

