package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetCampaignInputMod.GetCampaignInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetCampaignOutputMod.GetCampaignOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetCampaignCommand", JSImport.Namespace)
@js.native
object commandsGetCampaignCommandMod extends js.Object {
  @js.native
  class GetCampaignCommand protected () extends Command[
          InputTypesUnion, 
          GetCampaignInput, 
          OutputTypesUnion, 
          GetCampaignOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetCampaignInput) = this()
    /* CompleteClass */
    override val input: GetCampaignInput = js.native
    val middlewareStack: MiddlewareStack[GetCampaignInput, GetCampaignOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetCampaignInput, GetCampaignOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetCampaignInput, GetCampaignOutput] = js.native
  }
  
}

