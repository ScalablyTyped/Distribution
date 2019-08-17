package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsGetCampaignVersionCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetCampaignVersionInputMod.GetCampaignVersionInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetCampaignVersionOutputMod.GetCampaignVersionOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetCampaignVersionCommand", "GetCampaignVersionCommand")
@js.native
class GetCampaignVersionCommand protected () extends Command[
      InputTypesUnion, 
      GetCampaignVersionInput, 
      OutputTypesUnion, 
      GetCampaignVersionOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: GetCampaignVersionInput) = this()
  /* CompleteClass */
  override val input: GetCampaignVersionInput = js.native
  val middlewareStack: MiddlewareStack[GetCampaignVersionInput, GetCampaignVersionOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[GetCampaignVersionInput, GetCampaignVersionOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[GetCampaignVersionInput, GetCampaignVersionOutput] = js.native
}

