package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsGetAppCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetAppInputMod.GetAppInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetAppOutputMod.GetAppOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetAppCommand", "GetAppCommand")
@js.native
class GetAppCommand protected () extends Command[
      InputTypesUnion, 
      GetAppInput, 
      OutputTypesUnion, 
      GetAppOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: GetAppInput) = this()
  /* CompleteClass */
  override val input: GetAppInput = js.native
  val middlewareStack: MiddlewareStack[GetAppInput, GetAppOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[GetAppInput, GetAppOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[GetAppInput, GetAppOutput] = js.native
}

