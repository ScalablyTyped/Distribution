package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetCampaignActivitiesInputMod.GetCampaignActivitiesInput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetCampaignActivitiesOutputMod.GetCampaignActivitiesOutput
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetCampaignActivitiesCommand", JSImport.Namespace)
@js.native
object commandsGetCampaignActivitiesCommandMod extends js.Object {
  @js.native
  class GetCampaignActivitiesCommand protected () extends Command[
          InputTypesUnion, 
          GetCampaignActivitiesInput, 
          OutputTypesUnion, 
          GetCampaignActivitiesOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetCampaignActivitiesInput) = this()
    /* CompleteClass */
    override val input: GetCampaignActivitiesInput = js.native
    val middlewareStack: MiddlewareStack[GetCampaignActivitiesInput, GetCampaignActivitiesOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetCampaignActivitiesInput, GetCampaignActivitiesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetCampaignActivitiesInput, GetCampaignActivitiesOutput] = js.native
  }
  
}

