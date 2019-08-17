package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsCreateSegmentCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesCreateSegmentInputMod.CreateSegmentInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesCreateSegmentOutputMod.CreateSegmentOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/CreateSegmentCommand", "CreateSegmentCommand")
@js.native
class CreateSegmentCommand protected () extends Command[
      InputTypesUnion, 
      CreateSegmentInput, 
      OutputTypesUnion, 
      CreateSegmentOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: CreateSegmentInput) = this()
  /* CompleteClass */
  override val input: CreateSegmentInput = js.native
  val middlewareStack: MiddlewareStack[CreateSegmentInput, CreateSegmentOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[CreateSegmentInput, CreateSegmentOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[CreateSegmentInput, CreateSegmentOutput] = js.native
}

