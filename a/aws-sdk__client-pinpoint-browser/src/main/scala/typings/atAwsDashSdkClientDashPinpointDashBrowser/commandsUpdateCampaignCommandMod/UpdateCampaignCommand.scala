package typings.atAwsDashSdkClientDashPinpointDashBrowser.commandsUpdateCampaignCommandMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateCampaignInputMod.UpdateCampaignInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateCampaignOutputMod.UpdateCampaignOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateCampaignCommand", "UpdateCampaignCommand")
@js.native
class UpdateCampaignCommand protected () extends Command[
      InputTypesUnion, 
      UpdateCampaignInput, 
      OutputTypesUnion, 
      UpdateCampaignOutput, 
      PinpointResolvedConfiguration, 
      Blob
    ] {
  def this(input: UpdateCampaignInput) = this()
  /* CompleteClass */
  override val input: UpdateCampaignInput = js.native
  val middlewareStack: MiddlewareStack[UpdateCampaignInput, UpdateCampaignOutput, Blob] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[UpdateCampaignInput, UpdateCampaignOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
    configuration: PinpointResolvedConfiguration
  ): Handler[UpdateCampaignInput, UpdateCampaignOutput] = js.native
}

